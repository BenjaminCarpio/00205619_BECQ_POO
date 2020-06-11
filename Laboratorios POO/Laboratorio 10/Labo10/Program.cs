using System;
using System.Collections.Generic;
using System.Runtime.InteropServices;

namespace Labo10
{
    internal class Program
    {
        private delegate void MyDelegate(List<CuentaBancaria> accList);
        private static MyDelegate myDelegate;
        public static void Main(string[] args)
        {
            int opc;
            bool continuar = true;
            var listaCuentas = new List<CuentaBancaria>();
            string NombreCuenta;
            double SaldoCuenta;
            string[] vocales =
            {
                "a", "e", "i", "o", "u",
                "A", "E", "I", "O", "U",
            };
            
                    do
                    {
                        Console.WriteLine(Menu());
                        try
                        {
                            opc = Convert.ToInt32(Console.ReadLine());
                            switch (opc)
                        {
                            case 1:
                                Console.Write("Ingrese el nombre de la cuenta bancaria: ");
                                NombreCuenta = Console.ReadLine();
                                Console.Write("Ingrese el saldo que tendra la cuenta: ");
                                SaldoCuenta = Convert.ToDouble(Console.ReadLine());
                                listaCuentas.Add(new CuentaBancaria(NombreCuenta,SaldoCuenta));
                                break;
                            case 2:
                                myDelegate = MostrarCuentas;
                                myDelegate.Invoke(listaCuentas);
                                break;
                            case 3:
                                myDelegate = MostrarCuentas;
                                myDelegate += TotalCuentas;
                                myDelegate.Invoke(listaCuentas);
                                break;
                            case 4:
                                Action<List<CuentaBancaria>> myAction = (lista) =>
                                {
                                    Console.WriteLine("\nCuentas bancarias registradas: ");
                                    foreach (var acc in listaCuentas)
                                    {
                                        Console.WriteLine(acc);
                                    }
                                };
                                myAction += (lista) =>
                                {
                                    double total = 0;
                                    foreach (var acc in listaCuentas)
                                    {
                                        total += acc.Saldo;
                                    }
                                    Console.WriteLine("\nSaldo total en las cuentas: $" + total);
                                };
                                myAction += (lista) =>
                                {
                                    Console.WriteLine("\nCuentas bancarias que inician con vocal: ");
                                    foreach (var acc in listaCuentas)
                                    {
                                        foreach (var letra in vocales)
                                        {
                                            if (acc.Nombre.StartsWith(letra))
                                            {
                                                Console.WriteLine(acc);
                                            }
                                        }
                                    }
                                };
                                myAction.Invoke(listaCuentas);
                                break;
                            case 5:
                                Console.WriteLine("Saliendo de la aplicacion.");
                                continuar = false;
                                break;
                            default:
                                Console.WriteLine("Intente nuevamente.");
                                break;
                        }
                        }catch (FormatException e)
                        {
                            Console.WriteLine("\nFormato invalido.");
                        }
                    }while (continuar);
               
                
        }
        static string Menu(){
            return "\nSeleccione una opcion:\n" +
                   "1. Agregar una cuenta.\n" +
                   "2. Ver cuentas almacenadas.\n" +
                   "3. Ver cuentas almacenadas y el total de las cuentas.\n" +
                   "4. Ver cuentas almacenadas, total de las cuentas, y cuentas de las personas que su nombre inicie con una vocal.\n" +
                   "5. Salir.\n";
        }

        public static void MostrarCuentas(List<CuentaBancaria> listaCuentas)
        {
            Console.WriteLine("\nCuentas bancarias registradas: ");
            foreach (var acc in listaCuentas)
            {
                Console.WriteLine(acc);
            }
        }
        
        public static void TotalCuentas(List<CuentaBancaria> listaCuentas)
        {
            double total = 0;
            foreach (var acc in listaCuentas)
            {
                total += acc.Saldo;
            }
            Console.WriteLine("\nSaldo total en las cuentas: $" + total);
        }
        
        /*
        public static void MostrarCuentasVocales(List<CuentaBancaria> listaCuentas)
        {
            string[] vocales =
            {
                "a", "e", "i", "o", "u",
                "A", "E", "I", "O", "U",
            };
            Console.WriteLine("Cuentas bancarias que inician con vocal: ");
            foreach (var acc in listaCuentas)
            {
                foreach (var letra in vocales)
                {
                    if (acc.Nombre.StartsWith(letra))
                    {
                        Console.WriteLine(acc);
                    }
                }
            }
        }
        */
    }
}

