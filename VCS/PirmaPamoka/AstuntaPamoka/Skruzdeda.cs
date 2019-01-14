using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AstuntaPamoka
{
    class Skruzdeda : IGyvunas
    {
        public string Spalva { get; set; }      // savybes
        public double Svoris { get; set; }

        public Skruzdeda (string spalva, double svoris) //konstruktorius
        {
            Spalva = spalva;
            Svoris = svoris;
        }

        public void Kalbek()        // metodas
        {
            Console.WriteLine("bububububu");
        }

        public void SpausdinkInformacija()      // metodas
        {
            Console.WriteLine($"Mano spava - {Spalva}, o mano svoris - {Svoris}");
        }
    }
}
