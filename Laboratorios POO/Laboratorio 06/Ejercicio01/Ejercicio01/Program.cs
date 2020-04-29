using System;
using System.Collections.Generic;

namespace Ejercicio01 
{
    internal class Program
    {
        static List<Evaluacion> listaDeEvaluacion = new List<Evaluacion>();
        private static int verificadorPorcentaje = 0;
        public static void Main(string[] args)
        {

            bool continuar = true;
            int opcion;
            do
            {
                Console.WriteLine(Menu());
                try
                {
                    opcion = Convert.ToInt32(Console.ReadLine());
                }
                catch (FormatException exc)
                {
                    opcion = 0;
                    Console.WriteLine("Favor ingresar algo valido.");
                }

                switch (opcion) {
                case 1:
                    try
                    {
                        AgregarEvaluacion();
                    }
                    catch (PercentageExceedsTheLimits e)
                    {
                        Console.WriteLine("El porcentaje ingresado supera al 100%, volviendo al menu...");
                    }catch (FormatException e)
                    {
                        Console.WriteLine("Favor ingresar algo valido.");
                    }
                    break;
                case 2: MostrarEvaluaciones(); break;
                case 3: EliminarEvaluacion(); break;
                case 4: CalcularNota.CalculandoNota(listaDeEvaluacion); continuar = false; break;
                case 0: break;    //Para el try catch
                default: Console.WriteLine("Opcion invalida."); break;
                }
            } while (continuar);
        }
        static string Menu(){
            return "\nSeleccione una opcion:\n" +
                   "1) Agregar evaluacion\n" +
                   "2) Mostrar evaluaciones almacenadas\n" +
                   "3) Eliminar evaluacion\n" +
                   "4) Terminar programa\n";
        }

        static void AgregarEvaluacion()
        { 
            Console.WriteLine("Que tipo de evaluacion desea agregar?\n1)Parcial\n2)Laboratorio\n3)Tarea");
           int opcionEvaluacion = Convert.ToInt32(Console.ReadLine());
           Console.WriteLine("Porcentaje disponible: " + (100 - verificadorPorcentaje));
           Console.Write("\nIngrese el porcentaje que tendra la evaluacion: ");
           int porcentajeEvaluacion = Convert.ToInt32(Console.ReadLine());
           verificadorPorcentaje += porcentajeEvaluacion;
           if (verificadorPorcentaje <= 100)
           {
               Console.Write("Ingrese el nombre que se le asignara a la evaluacion: ");
               String nombreEvaluacion = Console.ReadLine();
               switch (opcionEvaluacion)
               {
                   case 1:
                       Console.Write("Ingrese la cantidad de preguntas que tendra el parcial: ");
                       int cantidadPreguntas = Convert.ToInt32(Console.ReadLine());
                       listaDeEvaluacion.Add(new Parcial(porcentajeEvaluacion, nombreEvaluacion, cantidadPreguntas));
                       break;
                   case 2:
                       Console.Write("Ingrese el tipo del laboratorio: ");
                       String tipoLaboratorio = Console.ReadLine();
                       listaDeEvaluacion.Add(new Laboratorio(porcentajeEvaluacion, nombreEvaluacion, tipoLaboratorio));
                       break;
                   case 3:
                       Console.Write("Indique la fecha de entrega para la terea: ");
                       DateTime fechaEntrega = Convert.ToDateTime(Console.ReadLine());
                       listaDeEvaluacion.Add(new Tarea(porcentajeEvaluacion, nombreEvaluacion, fechaEntrega));
                       break;
               }
           }
           else
           {
               verificadorPorcentaje -= porcentajeEvaluacion;
               throw new PercentageExceedsTheLimits("");
           }
        }

        static void MostrarEvaluaciones()
        {
            if (listaDeEvaluacion.Count == 0)
            {
                Console.WriteLine("La lista esta vacia.");
            }
            else
            {
                foreach (Evaluacion evaluacion in listaDeEvaluacion)
                {
                    Console.WriteLine("\n" + evaluacion);
                }
            }
        }

        static void EliminarEvaluacion()
        {
            Console.Write("Ingrese el nombre de la evaluacion a eliminar:");
            String nombreEliminar = Console.ReadLine();
            bool eliminado = false;
            foreach (Evaluacion ev in listaDeEvaluacion)
            {
                if (ev.Nombre.Equals(nombreEliminar)) {
                    listaDeEvaluacion.Remove(ev);
                    eliminado = true;
                }
            }
            if (eliminado) {
                Console.WriteLine("Evaluacion eliminada exitosamente.");
            }else{
                Console.WriteLine("No se encontro la evaluacion.");
            }
        }
    }
}