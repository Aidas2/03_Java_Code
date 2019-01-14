using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NamuDarbai2
{
    class Viktorina
    {
        private List<ViktorinosKlausimas> _klausimai;
        private int _taskai = 0;

        public Viktorina(List<ViktorinosKlausimas> klausimai)  // konstruktorius
        {
            _klausimai = klausimai;
        }

        public void PradetiZaidima()     // metodas
        {
            foreach (var klausimas in _klausimai)
            {
                Console.WriteLine("================");
                klausimas.AtspausdinkKlausima();
                var ivedeTeisingai = klausimas.NuskaitykIrPatikrink();
                if (ivedeTeisingai)
                {
                    _taskai++;
                }

            }
        }

        public void ParodykRezultata()      // metodas
        {
            Console.WriteLine($"Surinkote tasku: {_taskai}");
        }
        
        // ============================== mano variantas kuris nepaejo ....... ============================
        /*private List<ViktorinosKlausimas> _klausimai;   //savybes
        private int _taskai = 0; // {get; set;}

        public Viktorina (List<ViktorinosKlausimas> klausimai)  // konstruktorius
        {
            _klausimai = klausimai;
        }

        public void PradetiZaidima2()     // metodas
        {
            for (int i = 0; i < _klausimai.Count; i++)  // o cia atvirksciai - geriau naudoti foreach (?)
            {
                _klausimai[i].AtspausdinkKlausima();
                _klausimai[i].NuskaitykIrPatikrink();
                if (_klausimai[i].NuskaitykIrPatikrink() == true)
                    {
                        _taskai++;
                    }
            }
        }

        public void ParodykRezultata2()      // metodas
        {
            Console.WriteLine($"Teisingu atsakymu kiekis yra {_taskai}.");
        }*/
    }
}
