using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AstuntaPamoka
{
    class Dramblys : IGyvunas
    {
        public string Spalva { get; set; }      // savybes
        public string StraublioIlgis { get; set; }

        public void Kalbek()        // metodas
        {
            Console.WriteLine("tuuuuuuuuuu tuuuuuuuuuuuu");
        }

        public void SpausdinkInformacija()      // metodas
        {
            Console.WriteLine($"Mano spalva - {Spalva}, straublio ilgis - {StraublioIlgis}");
        }
    }
}
