using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DevintaPamoka
{
    class Udra : IGyvunas
    {
        public Udra(int usuSk, double svoris)
        {
            UsuSk = usuSk;
            Svoris = svoris;
        }

        public int UsuSk { get; }

        public double Svoris { get; }

        public void Kalbek()
        {
            Console.WriteLine("Udra udra udra . . . tiu tiu tiu ");
        }

        public void SpausdinkInformacija()
        {
            Console.WriteLine($"As esu udra. Turiu tiek usu - {UsuSk}, mano svoris - {Svoris} kg");
        }
    }
}
