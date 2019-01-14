using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NamuDarbai2
{
    class Program
    {
        static void Main(string[] args)
        {
            //========= NAMU DARBAI 2. UZDUOTIS NR1 (Banko sakaita) ==============================
            /*BankoSaskaita bankoSaskaita1 = new BankoSaskaita("LT01245", 1000);
            BankoSaskaita bankoSaskaita2 = new BankoSaskaita("LT63594", 50);

            bankoSaskaita1.IsimkGrynuju(620);
            bankoSaskaita1.IdekPinigu(100);
            bankoSaskaita2.IsimkGrynuju(240);
            bankoSaskaita2.IdekPinigu(10);

            Console.ReadLine();*/

            //========= NAMU DARBAI 2. UZDUOTIS NR2 (Viktorinos klausimas) ========================
            ViktorinosKlausimas klausimas = new ViktorinosKlausimas("Kokios spalvos yra arbuzas ?", new string[] { "oranzinis", "raudonas", "melynas" }, 1);
            klausimas.AtspausdinkKlausima();
            Console.WriteLine(klausimas.NuskaitykIrPatikrink());
            //klausimas.NuskaitykIrPatikrink2();
            //klausimas.NuskaitykIrPatikrink3();
            Console.ReadLine();

            //========= NAMU DARBAI 2. UZDUOTIS NR3 (Viktorina) ===================================
            var klausimas1 = new ViktorinosKlausimas("Kurios salies sostine yra Paryzius ?", new string[] { "Prancuzijos", "JAV", "Lietuvos" }, 0); 
            var klausimas2 = new ViktorinosKlausimas("Kokios spalvoos yra bananas ?", new string[] { "Melynos", "Geltonos", "Raudonos" }, 1); 
            var klausimas3 = new ViktorinosKlausimas("Kokia kalba cia mokomes ?", new string[] { "Java", "JavaScript", "C#" }, 2);

            var klausimai = new List<ViktorinosKlausimas> { klausimas1, klausimas2, klausimas3 };

            Viktorina viktorina = new Viktorina(klausimai);

            viktorina.PradetiZaidima();
            viktorina.ParodykRezultata();

            //viktorina.PradetiZaidima2();
            //viktorina.ParodykRezultata2();

            Console.Read();
        }
    }
}
