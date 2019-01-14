using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SeptintaPamoka
{
    class Taskas
    {
        public double X { get; set; }       // cia yra savybes
        public double Y { get; set; }

        public Taskas(double x, double y)   // cia yra konstruktorius
        {
            X = x;
            Y = y;
        }

        public void Spausdinti()            // cia yra metodas
        {
            Console.WriteLine($"x = {X}, y = {Y}");
        }
    }
}
