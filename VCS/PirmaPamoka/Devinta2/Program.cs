using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Devinta2
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] skaiciai = new int [10] { 5, 15, 10, 55, -100, 55, 11, 47, 47, 120 };
            /*Console.WriteLine(skaiciai.Sum());
            Console.WriteLine(skaiciai.Min());
            Console.WriteLine(skaiciai.Max());
            Console.WriteLine(skaiciai.Average());
            Console.WriteLine(skaiciai.First());
            Console.WriteLine(skaiciai.Last());
            var distinct = skaiciai.Distinct();
            foreach (var t in distinct)
            {
                Console.Write(t + " ");
            }
            Console.WriteLine();
            var siektiek = skaiciai.Skip(4).Take(5);
            foreach (var s in siektiek)
            {
                Console.Write(s + " ");
            }*/

            /*skaiciai
                .Where(sk => sk % 2 == 0)
                .ToList()
                .ForEach(sk => Console.Write(sk + " "));

            Console.WriteLine();

            skaiciai
                .Where(x => x > 10 && x < 30)
                .ToList()
                .ForEach(x => Console.Write(x + " "));

            Console.WriteLine();

            skaiciai
                .OrderByDescending(x => x)
                .Select(x => $"Skaicius = {x}. Kvadratas = {x * x}.")
                .ToList()
                .ForEach(x => Console.WriteLine(x + " "));*/

            // ====================== UZDUOTIS NR.5 ==================================================
            /*string[] miestai = { "ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS" };
            var tinkamasMiestas = miestai.Where(x => x.StartsWith("A") && x.EndsWith("M")).First();
            Console.WriteLine(tinkamasMiestas);*/

            // ====================== UZDUOTIS NR.6 ==================================================
            List<IGyvunas> gyvunai = new List<IGyvunas>
            {
                new Kate (3, 2.4),
                new Suo (5, 7.5),
                new Kate (1, 1.4),
                new Suo (5, 2.9),
                new Kate (15, 3.3),
                new Suo (12, 7.9),
                new Kate (3, 5.1),
                new Suo (8, 9.8),
            };

            gyvunai.ToList().ForEach(g => g.SpausdinkInformacija());

            Console.WriteLine();

            gyvunai
                .OrderByDescending(x => x.Svoris)
                .ToList()
                .ForEach(g => g.SpausdinkInformacija());

            gyvunai
                .Where(x => x.UsuSk > 3)
                .ToList()
                .ForEach(g => Console.WriteLine($"Turiu tiek {g.UsuSk} usu."));

            gyvunai
                .Skip(1)
                .Take(3)
                .ToList()
                .ForEach(x => x.Kalbek());

            Console.ReadLine();
        }
    }
}
