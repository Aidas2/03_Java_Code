using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AstuntaPamoka
{
    class Kvadratas : IFigura
    {
        private double _krastine;

        public Kvadratas(double krastine)  // konstruktorius
        {
            _krastine = krastine;
        }

        public void IsveskInformacija() // metodas
        {
            Console.WriteLine($"Kvadrato krastine yra {_krastine}.");
        }

        public double PaskaiciuokIlgi() // metodas
        {
            return 4 * _krastine;
        }

        public double PaskaiciuokPlota() // metodas
        {
            return _krastine * _krastine;
        }
    }
}
