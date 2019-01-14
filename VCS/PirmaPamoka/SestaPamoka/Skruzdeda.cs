using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SestaPamoka
{
    class Skruzdeda
    {
        private string _vardas;
        public string Vardas
        {
            get
            {
                return _vardas;
            }
            set
            {
                if (value != "")
                {
                    _vardas = value;
                }
            }
        }

        public int Amzius { get; set; }

        public Skruzdeda(string vardas = "NiamNiam", int amzius = 0)
        {
            _vardas = vardas;
            Amzius = amzius;
        }


        public int KiekSuvalgeiSkruzdeliu()
        {
            return 100;
        }

        public void SpausdinkSavoSavybes()
        {
            Console.WriteLine("Vardas yra " + Vardas);
            Console.WriteLine("Amzius yra " + Amzius);
        }

    }
}