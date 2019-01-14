using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ND3_is_Java_
{
    class Program
    {
        static void Main(string[] args)
        {
            Taskas taskas = new Taskas(8, 15);
            taskas.Apkeisk();

            Console.WriteLine();

            Telefonas telefonas1 = new Telefonas("Nokia", "Lumia", 16.5, "juoda");
            Telefonas telefonas2 = new Telefonas("Samsung", "Galaxy", 8.8, "sidabrine");
            Telefonas telefonas3 = new Telefonas("Iphone", "Penki", 32.0, "balta");

            telefonas1.Parodyk();
            telefonas2.Parodyk();
            telefonas3.Parodyk();

            Console.WriteLine();

            Pinigine pinigine = new Pinigine(100, 0, 20, 0, 0);
            pinigine.Parodyk();
            pinigine.Inesk(0, 0, 20, 0, 0);
            pinigine.Parodyk();
            pinigine.Suma();

            Console.WriteLine();

            Skaiciuotuvas skaiciavke = new Skaiciuotuvas(100.4, 25.6);
            skaiciavke.Veiksmai();

            string[,] manoPiramide = new string [6, 11]
                {
                    { "nulis", "nulis", "nulis", "nulis", "nulis", "iksas", "nulis", "nulis", "nulis", "nulis", "nulis" },
                    { "nulis", "nulis", "nulis", "nulis", "iksas", "iksas", "iksas", "nulis", "nulis", "nulis", "nulis" },
                    { "nulis", "nulis", "nulis", "iksas", "iksas", "iksas", "iksas", "iksas", "nulis", "nulis", "nulis" },
                    { "nulis", "nulis", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "nulis", "nulis" },
                    { "nulis", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "nulis" },
                    { "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas", "iksas" },
                };

            for (int i = 0; i < 6; i++)
            {
                for (int j = 0; j < 11; j++)
                {
                    if (manoPiramide[i, j] == "iksas")
                    {
                        Console.Write("X");
                    }
                    else
                    {
                        Console.Write("O");
                    }

                }
                Console.WriteLine();
            }

            Console.ReadLine();
        }

    }
}
