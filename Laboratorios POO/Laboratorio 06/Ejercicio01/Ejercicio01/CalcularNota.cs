using System;
using System.Collections.Generic;

namespace Ejercicio01
{
    public static class CalcularNota
    {
        public static void CalculandoNota(List<Evaluacion> calcular)
        {
            int porcentaje;
            double notaObtenida, notaFinal = 0;
            Console.WriteLine("A continuacion se mostraran las evaluaciones, favor digitar la nota obtenida para cada una: ");
            foreach (Evaluacion evaluacion in calcular)
            {
                Console.WriteLine("\n" + evaluacion);
                Console.Write("\nIngrese la nota obtenida para la evaluacion mostrada: ");
                notaObtenida = Convert.ToDouble(Console.ReadLine());
                porcentaje = evaluacion.Porcentaje;
                notaFinal += (notaObtenida * porcentaje);
            }
            Console.WriteLine("La nota final es: " + (notaFinal / 100));
        }
        
    }
}