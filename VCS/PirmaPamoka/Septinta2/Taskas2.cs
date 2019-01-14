using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Septinta2
{
    class Taskas2
    {
        public double X { get; set; }
        public double Y { get; set; }

        public Taskas2 (double x, double y)
        {
            X = x;
            Y = y;
        }

        public void Spausdinti2 ()
        {
            Console.WriteLine($"x = {X}, y = {Y}");
        }
    }
}
