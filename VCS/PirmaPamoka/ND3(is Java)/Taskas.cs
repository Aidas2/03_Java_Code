using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ND3_is_Java_
{
    class Taskas
    {
        private int _X { get; set; }
        private int _Y { get; set; }

        public Taskas (int x, int y)
        {
            _X = x;
            _Y = y;
        }

        public void Apkeisk()
        {
            Console.WriteLine($"Taskas x lygus {_Y}, taskas y lygus {_X}.");
        }
    }
}
