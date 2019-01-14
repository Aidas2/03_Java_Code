using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesimtaPamoka
{
    class Person
    {
        public string Name { get; }
        public string Surname { get; }
        public string Address { get; }

        public Person (string name, string surname, string address)
        {
            Name = name;
            Surname = surname;
            Address = address;
        }

        public override string ToString()
        {
            return $"{Name}, {Surname}, {Address}";
        }

    }
}
