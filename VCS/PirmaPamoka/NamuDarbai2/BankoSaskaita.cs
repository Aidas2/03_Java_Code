using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NamuDarbai2
{
    class BankoSaskaita
    {
        private string _saskaitosNumeris { get; set; }
        private decimal _piniguSuma { get; set; }

        public BankoSaskaita(string saskaitosNumeris, decimal piniguSuma)
        {
            _saskaitosNumeris = saskaitosNumeris;
            _piniguSuma = piniguSuma;
        }

        public void IsimkGrynuju(decimal isimamasKiekis)
        {
            if (isimamasKiekis <= _piniguSuma)
            {
                _piniguSuma -= isimamasKiekis;
                Console.WriteLine($"Saskaitoje liko {_piniguSuma} euru.");
            }
            else
            {
                Console.WriteLine("Pinigu sumos nepakanka.");
            }
        }

        public void IdekPinigu(decimal idedamasKiekis)
        {
            _piniguSuma += idedamasKiekis;
            Console.WriteLine($"Saskaitoje yra {_piniguSuma} euru.");
        }

    }
}
