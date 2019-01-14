using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PenktaPamoka
{
    class FailuOperacijos
    {
        public static void NuskaitykIrIsveskEilute (string path)  //1-oji uzduotis
        {
            string[] eilutes = File.ReadAllLines(path);

            foreach(var eilute in eilutes)
            {
                Console.WriteLine(eilute);
            }
        }

        public static void NuskaitykIrIsvesk(string path)       //1-oji uzduotis       
        {
            string tekstas = File.ReadAllText(path);
            Console.WriteLine(tekstas);
        }

        public static void NuskaitykPakeiskIrasyk(string path)  //2-oji uzduotis
        {
            string[] eilutes = File.ReadAllLines(path);
            for (int i = 0; i < eilutes.Length; i++)    // galima daryti be if, vietoj i++ rasyti i+=2, zr zemiau
            {
                if ((i + 1) % 2 == 0)
                {
                    eilutes[i] = eilutes[i].ToUpper();
                }
            }
            File.WriteAllLines(path, eilutes);
        }

        public static void NuskaitykPakeiskIrasyk2(string path)
        {
            string[] eilutes = File.ReadAllLines(path);
            for (int i = 0; i < eilutes.Length; i += 2)
            {
                 eilutes[i] = eilutes[i].ToUpper();
            }
            File.WriteAllLines(path, eilutes);
        }

        public static void NuskaitykIrIsveskAK(string path)
        {
            string tekstas = File.ReadAllText(path);
            Console.WriteLine(tekstas);
        }
    }
}
