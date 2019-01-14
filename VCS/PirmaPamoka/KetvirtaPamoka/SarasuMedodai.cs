using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KetvirtaPamoka
{
    class SarasuMedodai
    {
        public static void SpausdinkSarasa(List<int> sarasas)
        {
            if (sarasas.Count == 0)
            {
                Console.WriteLine("Sarasas yra tuscias.");
                return;
            }
            else
            {
                foreach (var elementas in sarasas)
                    {
                        Console.Write($"{elementas} ");
                    }
            Console.WriteLine();
            }   
        }
    }
}
