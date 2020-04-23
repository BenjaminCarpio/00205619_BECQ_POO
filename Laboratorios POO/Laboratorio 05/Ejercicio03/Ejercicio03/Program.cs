using System;

namespace Ejercicio03
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Indique hasta que numero se realizara la recursion:  ");

            int n = Convert.ToInt32(Console.ReadLine());
            int x = 1;
            int i = 1;  //contador
            Recursive(n, x, i);
        }
        
        static void Recursive(int n, int x, int i) {
            if (i < n && x < n) {
                Console.Write(x + "  ");
                x++;
                i++;
                Recursive(n, x, i);
            }
            else if(x==n){
                Console.Write(x + "  ");
                x--;
                Recursive(n,x,i);
                i++;
            }
            else if(x < n && x > 0){
                Console.Write(x + "   ");
                x--;
                Recursive(n,x,i);
            }
            else if(x==0)
                return;
        }
    }
}