using System;
using System.Collections.Generic;

namespace Ejercicio05
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            List<char> VocalesListaMin = new List<char>(new []{'a', 'e', 'i', 'o', 'u'});
            List<char> VocalesListaMay = new List<char>(new []{'A', 'E', 'I', 'O', 'U'});
            List<char> VocalesMin = new List<char>();
            List<char> VocalesMay = new List<char>();
            List<char> Mayusculas = new List<char>();
            List<char> Minusculas = new List<char>();
            
            Console.Write("Ingrese el total de letras que ingresara:\t");
            int total = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Ingrese letras 1 por 1 seguidas por un enter");
            for (int i = 0; i < total; i++)
            {
                char letra = Convert.ToChar(Console.ReadLine());
                
                if (VocalesListaMin.Contains(letra))
                    VocalesMin.Add(letra);
                else if (VocalesListaMay.Contains(letra))
                    VocalesMay.Add(letra);
                else if(Char.IsUpper(letra))
                    Mayusculas.Add(letra);
                    else
                    Minusculas.Add(letra);
            }
            
            Console.WriteLine("Vocales minusculas ingresadas");
            
            foreach(char s in VocalesMin){
                Console.WriteLine(s); 
            }
            
            Console.WriteLine("Vocales mayusculas ingresadas");
            foreach(char s in VocalesMay){
                Console.WriteLine(s);
            }
            
            Console.WriteLine("Mayusculas ingresadas");
            foreach(char s in Mayusculas){
                Console.WriteLine(s);
            }
            
            Console.WriteLine("Minusculas ingresadas");
            foreach(char s in Minusculas){
                Console.WriteLine(s);
            }
        }
    }
}