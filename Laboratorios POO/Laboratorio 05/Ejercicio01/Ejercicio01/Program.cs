using System;

namespace Ejercicio01
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            int numero = 0, fibo1 = 0, fibo2 = 1, aux = 0;
            Console.WriteLine("\n\tSeries de fibonacci");
            Console.Write("Indique hasta que numero desea realizar la serie de fibonacci:");
            numero = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i < numero; i++)
            {
                Console.Write(fibo1 + "\t");
                aux = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = aux;
            }
        }
    }
}