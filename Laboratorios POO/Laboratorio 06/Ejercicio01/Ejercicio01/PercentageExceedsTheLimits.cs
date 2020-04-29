using System;

namespace Ejercicio01
{
    public class PercentageExceedsTheLimits : Exception
    {
        public PercentageExceedsTheLimits(string message) : base(message)
        {
            
        }
    }
}