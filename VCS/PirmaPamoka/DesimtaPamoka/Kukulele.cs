using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesimtaPamoka
{
    class Kukulele : IStyginis
    {
        public Kukulele(int stygos, decimal kaina)
        {
            Pavadinimas = "Kukulele";
            StyguSk = stygos;
            Kaina = kaina;
        }

        public int StyguSk { get; }

        public string Pavadinimas { get; }

        public decimal Kaina { get; }

        public void Grok()
        {
            Console.WriteLine("Dziul dziul dziul kul kul kul");
        }

        public void SpausdinkInformacija()
        {
            Console.WriteLine($"Tai {Pavadinimas}. Jis turi {StyguSk} stygu. Kaina yra {Kaina} Eur.");
        }
    }
}
