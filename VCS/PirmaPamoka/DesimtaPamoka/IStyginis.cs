using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesimtaPamoka
{
    interface IStyginis
    {
        int StyguSk { get; }
        string Pavadinimas { get;  }
        decimal Kaina { get; }

        void SpausdinkInformacija();
        void Grok();
    }
}
