using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DevintaPamoka
{
    interface IGyvunas
    {
        int UsuSk { get; }
        double Svoris { get; }

        void Kalbek();
        void SpausdinkInformacija();
    }
}
