using System;
namespace Ejercicio02
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("\n\tVerificador de palindromos");
            if (palindromo()) {
                Console.WriteLine("Si es palindromo!");
            }else{
                Console.WriteLine("No es palindromo!");
            }
        }

        static bool palindromo()
        {
            Console.WriteLine("Ingrese una palabra:");
            String frase = Console.ReadLine();
            bool EsONoEs = true;
            int fin = frase.Length - 1;
            int ini = 0;
            int tamano = frase.Length;
            for (int i = 0; i < tamano; i++)
            {
                if (frase[i] != frase[tamano - i - 1])
                {
                    EsONoEs = false;
                }
            }
            return EsONoEs;
        }
    }
}