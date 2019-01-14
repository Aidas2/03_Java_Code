using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SestaPamoka
{
    class Circle
    {
        private double _radius = 1;     // savybe (su reiksme kuri bus naudojamas jei nebus ivesta kitokiu ar jokiu)
        private string color = "red";   

        public Circle()                 // konstruktorius (neuzduodantis reiksmiu ivedimo)
        {

        }

        public Circle (double radius)   // konstruktorius (uzduodantis reiksmes ivedima)
        {
            _radius = radius;
        }

        public double GetArea()         // metodas
        {
            return Math.PI * Math.Pow(_radius, 2);
        }

        public double GetLength()       // metodas
        {
            return 2 * Math.PI * _radius;
        }
    }
}
