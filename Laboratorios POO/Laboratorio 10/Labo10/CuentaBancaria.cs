namespace Labo10
{
    public class CuentaBancaria
    {
        public readonly string  Nombre;
        public readonly double Saldo;

        public CuentaBancaria(string nombre, double saldo)
        {
            Nombre = nombre;
            Saldo = saldo;
        }

        public override string ToString()
        {
            return $"{nameof(Nombre)}: {Nombre}, {nameof(Saldo)}: ${Saldo}";
        }
    }
}