using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Devinta2
{
    class Suo : IGyvunas
    {
        public Suo (int usai, double svoris)
        {
            UsuSk = usai;
            Svoris = svoris;
        }

        public int UsuSk { get; }

        public double Svoris { get; }

        public void Kalbek()
        {
            Console.WriteLine("Au au au auuuuuuuuu");
        }

        public void SpausdinkInformacija()
        {
        Console.WriteLine($"As esu suo. Usu kiekis yra {UsuSk}. Mano svoris yra {Svoris} kg.");
        }
    }
}
