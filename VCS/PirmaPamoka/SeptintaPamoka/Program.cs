using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SeptintaPamoka
{
    class Program
    {
        static void Main(string[] args)
        {
            //// Užduotis TAŠKAS
            var taskas = new Taskas(1, 2);
            taskas.Spausdinti();

            Console.WriteLine("===============");

            //// Užduotis DAUGIAKAMPIS
            var sarasasTasku = new List<Taskas> { new Taskas(12, 15), new Taskas(3, 4), new Taskas(5, 7) }; // cia tik listas (ji pasiruosiam kad butu su kuo dirbti arba ka pildyti), o ne objektas !
                                                                                                            // uzpildom objektais sukuriamais pagal klases Taskas konstruktoriaus numatyma 
            var daugiakampis = new Daugiakampis(sarasasTasku);      // cia jau pagal konstruktoriu sukuriamas objektas;
                                                                    // konstruktorius numate kad reikia ideti lista, tai ir idedam ta kur pries tai susikurem t.y. "sarasasTasku"
            daugiakampis.SpausdinkTaskus();

            Console.WriteLine("===============");

            daugiakampis.PridekTaska(2,8);
            daugiakampis.SpausdinkTaskus();

            Console.WriteLine("===============");

            daugiakampis.IstrinkTaska(0);
            daugiakampis.SpausdinkTaskus();

            //// Užduotis KAVOS APARATAS
            KavosAparatas kavosAparatas = new KavosAparatas(1.2, 1.4, 5, 3);
            kavosAparatas.SpausdinkBusena();
            kavosAparatas.DarykKava();
            kavosAparatas.SpausdinkBusena();


            Console.Read();
        }
    }
}
