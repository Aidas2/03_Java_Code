using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DevintaPamoka
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] masyvas = new int[10] { 5, 15, 10, 55, -100, 55, 11, 47, 47, 100 };
            /*Console.WriteLine(masyvas.Sum());
            Console.WriteLine(masyvas.Min());
            Console.WriteLine(masyvas.Max());
            Console.WriteLine(masyvas.Average());
            Console.WriteLine(masyvas.First());
            Console.WriteLine(masyvas.Last());
            Console.WriteLine("=========");
            var distinct = masyvas.Distinct();
            foreach (var item in distinct)
                {
                Console.Write($"{item} ");
                }
            Console.WriteLine();
            Console.WriteLine("=========");
            var poaibis = masyvas.Skip(4).Take(5);
            foreach (var item in poaibis)
            {
                Console.Write($"{item} ");
            }*/

            /*var skaiciaiMazesniUz20 = masyvas
                .Where(sk => sk < 20)
                .ToList();
            skaiciaiMazesniUz20.ForEach(skaicius => Console.Write(skaicius + " "));

            Console.WriteLine();
            Console.WriteLine("=======================");

            masyvas
                .Where(sk => sk < 20)
                .Distinct()
                .ToList()
               .ForEach(skaicius => Console.Write(skaicius + " "));*/

            /*
            // lyginiai
            var lyginiai = masyvas.Where(sk => sk % 2 == 0).ToList();
            lyginiai.ForEach(lyginis => Console.Write($"{lyginis} "));
            //arba
                masyvas
                .Where(sk => sk % 2 == 0)
                .ToList()
                .ForEach(sk => Console.Write(sk + " "));
            Console.WriteLine();

            // intervale
            var skaiciaiIntervale = masyvas.Where(sk => sk > 10 && sk < 20).ToList();
            skaiciaiIntervale.ForEach(x => Console.Write($"{x} "));
            //arba
            masyvas
                .Where(sk => sk > 10 && sk < 20)
                .ToList()
                .ForEach(sk => Console.Write(sk + " "));

            // mazejancia  tvarka ir pakelta kvadratu
            masyvas
                .OrderByDescending(x => x)
                .ToList()
                .ForEach(x => Console.WriteLine($"Skaicius = {x}, kvadratas = {x * x}"));
           //arba
           masyvas
                .OrderByDescending(x => x)
                .Select(x => $"Skaicius = {x}, kvadratas = {x * x}")
                .ToList()
                .ForEach(x => Console.WriteLine(x));*/

            // ====================== UZDUOTIS NR.5 ==================================================
            /*string [] miestai = { "ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS" };
            var pirmaRaide = NuskaitykRaide(1).ToUpper();
            var antraRaide = NuskaitykRaide(2).ToUpper();
            //var tinkamasMiestas = miestai.Where (m => m.StartsWith(pirmaRaide) && m.EndsWith(antraRaide)).First();
            //arba
            var tinkamasMiestas = miestai.FirstOrDefault(m => m.StartsWith(pirmaRaide) && m.EndsWith(antraRaide));
            Console.WriteLine($"Miestas, kuris prasideda {pirmaRaide} ir baigiasi {antraRaide} yra {tinkamasMiestas}");

            Console.ReadLine();
        }

        static string NuskaitykRaide(int numeris)
        {
            Console.WriteLine($"Iveskite {numeris}-a raide: ");
            return Console.ReadLine();
        }*/


            // ====================== UZDUOTIS NR.6 ==================================================

            IGyvunas[] gyvunai = //new [] gyvunai IGyvunas
            {
                new Udra(10, 3.8),
                new Ruonis(22, 420),
                new Udra(2, 7.3),
                new Ruonis(8, 220),
                new Udra(2, 15.4),
                new Ruonis(6, 340),
                new Udra(2, 7.8),
                new Ruonis(3, 150),
            };

            gyvunai.ToList().ForEach(g => g.SpausdinkInformacija());

            Console.WriteLine("==========================");

            gyvunai
                .OrderByDescending(y => y.Svoris)
                .ToList()
                .ForEach(g => g.SpausdinkInformacija());

            Console.WriteLine("==========================");

            gyvunai
                .Where(x => x.UsuSk > 3)
                .ToList()
                .ForEach(g => Console.WriteLine($"Turiu tiek {g.UsuSk} usu."));

            Console.WriteLine("==========================");

            gyvunai
                .Skip(1)
                .Take(3)
                .ToList()
                .ForEach(g => g.Kalbek());



            Console.ReadLine();
        }
    }
    }
