using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NamuDarbai2
{
    class ViktorinosKlausimas
    {
        private string _klausimas; // { get; set; } nereikia privacioms savybems
        private string[] _galimiAtsakymai; // { get; set; }
        private int _teisingasAtsakymas; // { set; get; }

        public ViktorinosKlausimas(string klausimas, string [] galimiAtsakymai, int teisingasAtsakymas) // konstruktorius
        {
            _klausimas = klausimas;
            _galimiAtsakymai = galimiAtsakymai;
            _teisingasAtsakymas = teisingasAtsakymas;
        }

        public void AtspausdinkKlausima()   // metodas
        {
            Console.WriteLine(_klausimas);
            for (int i = 0; i < _galimiAtsakymai.Length; i++) //geriau nei foreach, nes galima ideti ir klausimo numeri
            {
                Console.WriteLine($"{i+1}. {_galimiAtsakymai[i]}");
            }
        }

        public bool NuskaitykIrPatikrink()      // metodas
        {
            Console.WriteLine();
            Console.WriteLine("Iveskite teisingojo atsakymo numeri:");
            int numeris = int.Parse(Console.ReadLine());
            return (numeris - 1) == _teisingasAtsakymas;
        }

        // ============= alternatyvus variantai (mano paties) ================
        /*public void NuskaitykIrPatikrink2()
        {
            Console.WriteLine("Iveskite teisingojo atsakymo numeri:");
            int numeris = int.Parse(Console.ReadLine());
            if ((numeris-1) == _teisingasAtsakymas)
            {
                Console.WriteLine("Atsakymas yra teisingas");
            }
            else
            {
                Console.WriteLine("Atsakymas yra neteisingas");
            }
        }

        public void NuskaitykIrPatikrink3() // per sudetingas bet veikia ;)
        {
            Console.WriteLine("Iveskite teisingojo atsakymo numeri:");
            int numeris = int.Parse(Console.ReadLine());
            bool patikrinimas = ((numeris - 1) == _teisingasAtsakymas);
            Console.WriteLine($"Buti ar nebuti ? {patikrinimas} . Stai kur klausimas.");
        }*/

    }
}
