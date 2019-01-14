using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KetvirtaPamoka
{
    class Program
    {
        static void Main(string[] args)
        {
            /*List<int> pirmasListas = new List<int> { 1, 9, 10, -100, 78, 55 };

            SarasuMedodai.SpausdinkSarasa(pirmasListas);

            pirmasListas.Add(0);
            SarasuMedodai.SpausdinkSarasa(pirmasListas);

            pirmasListas.AddRange(new List<int> { 1, 2, 3 });
            SarasuMedodai.SpausdinkSarasa(pirmasListas);

            pirmasListas.Insert(0, 100);
            SarasuMedodai.SpausdinkSarasa(pirmasListas);

            pirmasListas.InsertRange(1, new List<int> { 0, 0, 0 });
            SarasuMedodai.SpausdinkSarasa(pirmasListas);

            pirmasListas.Remove(78);
            SarasuMedodai.SpausdinkSarasa(pirmasListas);

            pirmasListas.RemoveAt(2);
            SarasuMedodai.SpausdinkSarasa(pirmasListas);

            pirmasListas.RemoveRange(1, 3);
            SarasuMedodai.SpausdinkSarasa(pirmasListas);

            var indeksas = pirmasListas.IndexOf(-100);
            Console.WriteLine(indeksas);

            var contains = pirmasListas.Contains(99);
            Console.WriteLine(contains);

            Console.WriteLine(pirmasListas.Count);

            pirmasListas.Sort();
            SarasuMedodai.SpausdinkSarasa(pirmasListas);

            pirmasListas.Clear();
            SarasuMedodai.SpausdinkSarasa(pirmasListas);*/

            var pazymiai = PazymiuMetodai.NuskaitykPazymius();
            SarasuMedodai.SpausdinkSarasa(pazymiai);

            var vidurkis = PazymiuMetodai.PaskaiciuokVidurki(pazymiai);
            Console.WriteLine(vidurkis);

            var mediana = PazymiuMetodai.PaskaiciuokMediana(pazymiai);
            Console.WriteLine(mediana);

            PazymiuMetodai.IsveskPazymiuStatistika(pazymiai);

            Console.ReadLine();
        }
    }
}
