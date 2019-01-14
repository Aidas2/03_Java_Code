using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AstuntaPamoka
{
    class Staciakampis : IFigura
    {
        private double _krastineA;      //savybes
        private double _krastineB;

        public Staciakampis (double krastineA, double krastineB)        // konsruktorius
        {
            _krastineA = krastineA;
            _krastineB = krastineB;
        }

        public void IsveskInformacija()     // metodas
        {
            Console.WriteLine($"Staciakampio krastines yra {_krastineA} ir {_krastineB}.");
        }

        public double PaskaiciuokIlgi()     // metodas
        {
            return 2 * _krastineA + 2 * _krastineB;
        }

        public double PaskaiciuokPlota()    // metodas
        {
            return _krastineA * _krastineB;
        }
    }
}
