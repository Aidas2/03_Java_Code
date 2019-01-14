using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DevintaPamoka
{
    class Ruonis : IGyvunas
    {
        public Ruonis(int usuSk, double svoris)
        {
            UsuSk = usuSk;
            Svoris = svoris;
        }

        public int UsuSk { get; }

        public double Svoris { get; }

        public void Kalbek()
        {
            Console.WriteLine("Uru ru ru ru . . . tiu tiu tiu ");
        }

        public void SpausdinkInformacija()
        {
            Console.WriteLine($"As esu ruonis. Turiu tiek usu - {UsuSk}, mano svoris - {Svoris} kg");
        }
    }
}
