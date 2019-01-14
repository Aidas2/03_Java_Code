using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesimtaPamoka
{
    class Smuikas : IStyginis
    {
        public Smuikas (int stygos, decimal kaina)
        {
            Pavadinimas = "Smuikas";
            StyguSk = stygos;
            Kaina = kaina;
        }

        public int StyguSk { get; }

        public string Pavadinimas { get; }

        public decimal Kaina { get; }

        public void Grok()
        {
            Console.WriteLine("Dzyru dzyru duok pipiru");
        }

        public void SpausdinkInformacija()
        {
            Console.WriteLine($"Tai {Pavadinimas}. Jis turi {StyguSk} stygu. Kaina yra {Kaina} Eur.");
        }
    }
}
