using System;

namespace Ejercicio04
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Ingrese una frase para realizar los cambios:\t");
            string frase = Console.ReadLine();
            string newFrase = frase.Replace('a' , 'b');
            frase = newFrase.Replace('A', 'B');
            //2 veces para tomar en cuenta mayusculas y  minusculas
            Console.WriteLine(frase);
        }
    }
}