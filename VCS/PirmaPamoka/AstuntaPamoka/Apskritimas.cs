using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AstuntaPamoka
{
    class Apskritimas : IFigura
    {
        private double _spindulys;

        public Apskritimas (double spindulys)
        {
            _spindulys = spindulys;
        }

        public void IsveskInformacija()
        {
            Console.WriteLine($"Apskritimo spindulys yra {_spindulys}.");
        }

        public double PaskaiciuokIlgi()
        {
            return 2 * Math.PI * _spindulys;
        }

        public double PaskaiciuokPlota()
        {
            return Math.PI * _spindulys * _spindulys;
        }
    }
}
