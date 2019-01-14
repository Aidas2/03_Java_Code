using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Septinta2
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Taskas2 taskas2 = new Taskas2 (3, 9);
            taskas2.Spausdinti2();

            Console.WriteLine("======================");

            var sarasasTasku = new List<Taskas2> { new Taskas2(5, 8), new Taskas2(7, 15), new Taskas2(25, 68)};
            Daugiakampis2 daugiakampis2 = new Daugiakampis2(sarasasTasku);
            daugiakampis2.Atspausdink2();

            Console.WriteLine("======================");

            daugiakampis2.PridekTaska(127, 254);
            daugiakampis2.Atspausdink2();

            Console.WriteLine("======================");

            daugiakampis2.IstrinkTaska(2);
            daugiakampis2.Atspausdink2();*/

            //===================== KAVOS APARATAS ==============================
            KavosAparatas2 kavosAparatas = new KavosAparatas2(2.5, 3.4, 10.8, 1.6);
            kavosAparatas.SpausdinkBusena();
            kavosAparatas.DarykKava();
            kavosAparatas.SpausdinkBusena();
            kavosAparatas.DarykKava();
            kavosAparatas.SpausdinkBusena();

            Console.ReadLine();
        }        
    }
}
