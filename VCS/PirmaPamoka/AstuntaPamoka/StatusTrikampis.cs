using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AstuntaPamoka
{
    class StatusTrikampis : IFigura
    {
        private double _statinisX;
        private double _statinisY;

        public StatusTrikampis(double statinisX, double statinisY)
            {
            _statinisX = statinisX;
            _statinisY = statinisY;
            }

        public void IsveskInformacija()
        {
            Console.WriteLine($"Pirmo statinio ilgis - {_statinisX}, o antro - {_statinisY}");
        }

        public double PaskaiciuokIlgi()
        {
            var izambine = Math.Sqrt(_statinisX * _statinisX + _statinisY * _statinisY);
            return izambine + _statinisX + _statinisY;
        }

        public double PaskaiciuokPlota()
        {
            return _statinisX * _statinisY / 2;
        }
    }
}
