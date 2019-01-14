using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SestaPamoka
{
    class Automobilis
    {
        public string Marke { get; set; }   // savybes
        public int IsleidimoMetai { get; set; }

        private double _variklioTuris = 1;  // privati savybe, kurios ivedimas yra apibreztas ribomis ar pan.

        public double VariklioTuris
        {
            get { return _variklioTuris; }
            set
            {
                if (value >= 1.0 && value <= 5.0)
                    _variklioTuris = value;
            }
        }

        public Automobilis(string marke, int isleidimoMetai, double variklioTuris) // konstruktorius
        {
            Marke = marke;
            IsleidimoMetai = isleidimoMetai;
            VariklioTuris = _variklioTuris;
        }

        public void Uzsivesk()  // metodas (su void)
        {
            Console.WriteLine("Brum brum brum bruuuuuuuum - automobilis uzsivede !");
        }

        public int KiekNuvaziavoKm()    // metodas (su int)
        {
            return 152000;
        }

        public void DuomenysIsRegitros()  // metodas (su void)
        {
            Console.WriteLine($"Regitra turi siuos duomenis: {Marke}, isleidimo metai {IsleidimoMetai}, turis {VariklioTuris}.");
        }
    }
}
