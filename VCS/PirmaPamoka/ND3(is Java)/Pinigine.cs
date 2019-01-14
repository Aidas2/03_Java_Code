using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ND3_is_Java_
{
    class Pinigine
    {
        public int Eur100 { get; set; }
        public int Eur50 { get; set; }
        public int Eur20 { get; set; }
        public int Eur10 { get; set; }
        public int Eur5 { get; set; }

        public Pinigine(int simtas, int penkd, int dvid, int des, int penk)
        {
            Eur100 = simtas;
            Eur50 = penkd;
            Eur20 = dvid;
            Eur10 = des;
            Eur5 = penk;
        }

        public void Inesk (int simtas, int penkd, int dvid, int des, int penk)
        {
            Eur100 += simtas;
            Eur50 += penkd;
            Eur20 += dvid;
            Eur10 += des;
            Eur5 += penk;
        }

        public void Parodyk()
        {
            Console.WriteLine($"Pinigineje yra sios kupiuros {Eur100} Eur, {Eur50} Eur, {Eur20} Eur, {Eur10} Eur, {Eur5} Eur.");

        }

        public void Suma()
        {
            int Suma = Eur100 + Eur50 + Eur20 + Eur10 + Eur5;
            Console.WriteLine($"Pinigineje is viso yra si suma pinigu: {Suma} Eur.");
        }
    }
}
