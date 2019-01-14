using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AstuntaPamoka
{
    class Program
    {
        static void Main(string[] args)
        {
            /*List<IGyvunas> gyvunai = new List<IGyvunas>
            {
                new Dramblys(),     // skliaustuose galima bieko nerasyt nes kls4je n4ra toi reikalaujancio konstruktoriaus
                new Skruzdeda("Sviesiai ruda", 2.3), // butina ivesti duomenis nes yra to reikalaujantis konstruktorius
                new Dramblys(),
                new Skruzdeda("Tamsiai ruda", 3.1),
            };

            foreach (var gyvunas in gyvunai)
            {
                gyvunas.Kalbek();
                gyvunas.SpausdinkInformacija();
            }

            Console.ReadLine();*/


            List<IFigura> figuros = new List<IFigura>
            {
                new Kvadratas(10),
                new Apskritimas(3),
                new StatusTrikampis(2, 3),
                new Staciakampis(5, 9),
                new Kvadratas(101),
                new Apskritimas(31),
                new StatusTrikampis(12, 35),
                new Staciakampis(14, 25),
                new Kvadratas(110),
                new Apskritimas(33),
                new StatusTrikampis(21, 45),
                new Staciakampis(32, 14)
            };

            foreach (var figura in figuros)
            {
                figura.IsveskInformacija();
            }

            double bendrasPlotas = 0;
            foreach (var figura in figuros)
            {
                bendrasPlotas += figura.PaskaiciuokPlota();
            }

            Console.WriteLine("Bendras plotas: " + bendrasPlotas);

            // 9-os pamokos dalis (LinQ ir Lambda):
            var pagalPlota = figuros.OrderBy(x => x.PaskaiciuokPlota());
            var maziausiasIlgis = figuros.Min(x => x.PaskaiciuokIlgi());
            var bPlotas = figuros.Sum(x => x.PaskaiciuokPlota());




            Console.ReadLine();
        }
    }
}
