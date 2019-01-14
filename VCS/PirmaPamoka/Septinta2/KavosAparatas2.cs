using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Septinta2
{
    class KavosAparatas2
    {
        public double CukrausKiekis { get; set; }
        public double KavosPupeliuKiekis { get; set; }
        public double VandensKiekis { get; set; }
        public double PienoKiekis { get; set; }
        private int _panaudojimuSkaicius = 0;

        private const int MaxPanaudojimuSk = 3;

        public KavosAparatas2 (double cukrus, double pupeles, double vanduo, double pienas)
        {
            CukrausKiekis = cukrus;
            KavosPupeliuKiekis = pupeles;
            VandensKiekis = vanduo;
            PienoKiekis = pienas;
        }

        private void DarykGerima(double cukrus, double pupeles, double vanduo, double pienas)
        {
            if (ArUztenkaIngridientu(cukrus, pupeles, vanduo, pienas))
            {
                CukrausKiekis -= cukrus;
                KavosPupeliuKiekis -= pupeles;
                VandensKiekis -= vanduo;
                PienoKiekis -= pienas;
                Console.WriteLine("Kava padaryta !");
                _panaudojimuSkaicius++;
            }
            else
            {
                Console.WriteLine("Neuztenka ingridientu kavai pagaminti");
            }
        }

        public void DarykKava()
        {
            while (_panaudojimuSkaicius < MaxPanaudojimuSk)
            {
                Console.WriteLine($"Kavos aparatas pasiruoses (ingridientu uztenka, iki issivalymo liko {MaxPanaudojimuSk - _panaudojimuSkaicius} kartai/-u.");
                Console.WriteLine("Iveskite kavos pavadinima (latte, ekspresso, black): ");
                string kavosPavadinimas = Console.ReadLine();

                switch (kavosPavadinimas)
                {
                    case "latte":
                        DarykGerima(0.1, 0.2, 0.25, 0.12);
                        break;
                    case "ekspresso":
                        DarykGerima(0.1, 0.45, 0.20, 0);
                        break;
                    case "black":
                        DarykGerima(0, 0.31, 0.32, 0);
                        break;
                    default:
                        Console.WriteLine("Tokios kavos daryti nemoku");
                        break;
                }
            }
            if (_panaudojimuSkaicius == MaxPanaudojimuSk)
            {
                Console.WriteLine("Laikas atlikti kavos aparato plovima. Spauskite mygtuka 1.");
                var nuspaustasMygtukas = int.Parse(Console.ReadLine());
                if(nuspaustasMygtukas == 1)
                {
                    AtlikPlovima();
                }
                else
                {
                    Console.WriteLine("Kvailiuk, sakiau gi spausk vieneta");
                }
            }

        }

        public void SpausdinkBusena()
        {
            Console.WriteLine("=============Busena===============");
            Console.WriteLine($"Cukraus yra {CukrausKiekis} kg, kavos yra {KavosPupeliuKiekis} kg, vandens yra {VandensKiekis} kg, pieno yra {PienoKiekis} ltr.");
            Console.WriteLine();
        }

        private bool ArUztenkaIngridientu(double cukrus, double pupeles, double vanduo, double pienas)
        {
            if (CukrausKiekis - cukrus >= 0 && KavosPupeliuKiekis - pupeles >= 0 && VandensKiekis - vanduo >= 0 && PienoKiekis - pienas >= 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public void AtlikPlovima()
        {
            _panaudojimuSkaicius = 0;
            Console.WriteLine($"Kavos aparatas buvo isplautas. Einamasis panaudojimu skaicius yra {_panaudojimuSkaicius}");
        }
    }
}
