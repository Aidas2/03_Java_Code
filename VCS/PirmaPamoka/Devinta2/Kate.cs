using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Devinta2
{
    class Kate : IGyvunas
    {
        public Kate (int usai, double svoris)
        {
            UsuSk = usai;
            Svoris = svoris;
        }

        public int UsuSk { get ; }
        public double Svoris { get; }

        public void Kalbek()
        {
            Console.WriteLine("Miau miau miaaaaaau");
        }

        public void SpausdinkInformacija()
        {
            Console.WriteLine($"As esu kate. Usu kiekis yra {UsuSk}. Mano svoris yra {Svoris} kg.");
        }
    }
}
