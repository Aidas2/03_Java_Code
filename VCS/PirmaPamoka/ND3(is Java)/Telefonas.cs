using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ND3_is_Java_
{
    class Telefonas
    {
        public string Marke { get; set; }
        public string Modelis { get; set; }
        public double Atmintis { get; set; }
        public string Spalva { get; set; }

        public Telefonas(string mk, string md, double at, string sp)
        {
            Marke = mk;
            Modelis = md;
            Atmintis = at;
            Spalva = sp;
        }

        public void Parodyk()
        {
            Console.WriteLine($"Telefono marke yra {Marke}, modelis {Modelis}, atmintis {Atmintis} MB, spalva - {Spalva}.");
        }


    }


}
