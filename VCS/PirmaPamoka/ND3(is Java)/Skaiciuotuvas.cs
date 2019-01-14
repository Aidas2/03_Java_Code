using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ND3_is_Java_
{
    class Skaiciuotuvas
    {
        public double PirmasSkaicius { get; set; }
        public double AntrasSkaicius { get; set; }

        public Skaiciuotuvas(double pirmas, double antras)
        {
            PirmasSkaicius = pirmas;
            AntrasSkaicius = antras;
        }

        public void Veiksmai()
        {
            double sudeti = PirmasSkaicius + AntrasSkaicius;
            double atimti = PirmasSkaicius - AntrasSkaicius;
            double sudauginti = PirmasSkaicius * AntrasSkaicius;
            double padalinti = PirmasSkaicius / AntrasSkaicius;
            double liekana = PirmasSkaicius % AntrasSkaicius;
            Console.WriteLine($"Skaiciaus {PirmasSkaicius} ir skaiciaus {AntrasSkaicius} suma yra {sudeti}, atimtis yra {atimti}, sandauga yra {sudauginti}, dalyba yra {padalinti}, liekana yra {liekana}.");
        }
        
        
    }

}
