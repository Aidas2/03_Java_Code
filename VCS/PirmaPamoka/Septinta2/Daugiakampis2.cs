using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Septinta2
{
    class Daugiakampis2
    {
        private List<Taskas2> _taskai2;

        public Daugiakampis2 (List<Taskas2> taskai2)
        {
            _taskai2 = taskai2;
        }

        public void Atspausdink2()
        {
            foreach (var t in _taskai2)
            {
                t.Spausdinti2();
            }
        }

        public void PridekTaska(double x, double y)
        {
            _taskai2.Add(new Taskas2(x, y));
        }

        public void IstrinkTaska (int indeksas)
        {
            _taskai2.RemoveAt(indeksas);
        }



    }
}
