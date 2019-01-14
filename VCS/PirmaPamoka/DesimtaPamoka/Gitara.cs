using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesimtaPamoka
{
    class Gitara : IStyginis
    {
        public Gitara(int stygos, decimal kaina)
        {
            Pavadinimas = "Gitara";
            StyguSk = stygos;
            Kaina = kaina;
        }

        public int StyguSk { get; }

        public string Pavadinimas { get; }

        public decimal Kaina { get; }

        public void Grok()
        {
            Console.WriteLine("Dziam dziam, dziam dziam dziam dziam");
        }

        public void SpausdinkInformacija()
        {
            Console.WriteLine($"Tai {Pavadinimas}. Jis turi {StyguSk} stygu. Kaina yra {Kaina} Eur.");
        }

    }
}
