using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SeptintaPamoka
{
    class KavosAparatas
    {
        public double CukrausKiekisKg { get; set; }      // cia yra savybes
        public double KavosPupeliuKiekisKg { get; set; }
        public double VandensKiekisKg { get; set; }
        public double PienoKiekisL { get; set; }
        private int _panaudojimuSk = 0;

        private const int MaxPanaudojimuSk = 20;


        public KavosAparatas(double cukrus, double kava, double vanduo, double pienas)  // konstruktorius (vienai rusiai)
        {
            CukrausKiekisKg = cukrus;
            KavosPupeliuKiekisKg = kava;
            VandensKiekisKg = vanduo;
            PienoKiekisL = pienas;
        }

        public KavosAparatas(double kava, double vanduo)                                // konstruktorius (kitai rusiai ?)
        {
            KavosPupeliuKiekisKg = kava;
            VandensKiekisKg = vanduo;
        }

        public void SpausdinkBusena()         // metodas
        {
            Console.WriteLine("=============Busena===============");
            Console.WriteLine($"Cukraus yra {CukrausKiekisKg} kg, kavos yra {KavosPupeliuKiekisKg} kg, vandens yra {VandensKiekisKg} kg, pieno yra {PienoKiekisL} ltr. ");
            Console.WriteLine();
        }

        public void DarykKava()         // metodas
        {
            Console.WriteLine("Iveskite kavos pavadinima:");
            string kavosPavadinimas = Console.ReadLine();

            switch (kavosPavadinimas)
            {
                case "latte":
                    DarykGerima(0.2, 0.1, 0.1, 0.2);
                    PienoKiekisL -= 0.1;
                    VandensKiekisKg -= 0.1;
                    KavosPupeliuKiekisKg -= 0.2;
                    CukrausKiekisKg -= 0.1;
                    break;
                case "black":
                    DarykGerima(0.2, 0.1, 0.1, 0.2);
                    break;
                default:
                    Console.WriteLine("Tokios kavos daryti nemoku");
                    break;
            }

        }

        private void DarykGerima(double kava, double pienas, double cukrus, double vanduo)  // metodas
        {
            if (ArUztenkaIngridientu(kava, pienas, cukrus, vanduo))
            {
                PienoKiekisL -= pienas;
                VandensKiekisKg -= vanduo;
                KavosPupeliuKiekisKg -= kava;
                CukrausKiekisKg -= cukrus;
                Console.WriteLine("Kava padaryta !");
                _panaudojimuSk++;
            }
            else
            {
                Console.WriteLine("Neuztenka ingridientu kavai pagaminti");
            }

        }
        
        private bool ArUztenkaIngridientu(double kava, double pienas, double cukrus, double vanduo)     // metodas
                        // keista kad dubliuojasi reikalingi ivesti double - ar reikes ivedineti du kartus ta pati ?
        {
            if (PienoKiekisL - pienas >=0 && VandensKiekisKg - vanduo >= 0 && KavosPupeliuKiekisKg - kava >= 0 && CukrausKiekisKg - cukrus >= 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    }
}
