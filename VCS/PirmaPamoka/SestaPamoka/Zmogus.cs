using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SestaPamoka
{
    class Zmogus
    {
        public string Vardas { get; set; }  //savybes
        public string Pavarde { get; set; }
        public string Telefonas { get; set; }

        public Zmogus(string vardas, string telefonas)  //konstruktorius
        {
            Vardas = vardas;
            Telefonas = telefonas;
        }

        public Zmogus(string vardas, string pavarde, string telefonas) // konstruktorius kitas
        {
            Vardas = vardas;
            Pavarde = pavarde;
            Telefonas = telefonas;
        }

        public void AtspausdinkInformacija()    // metodas
        {
            Console.WriteLine($"{Vardas} {Pavarde} {Telefonas}");
        }
    }
}
