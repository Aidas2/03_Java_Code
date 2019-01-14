using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesimtaPamoka
{
    class Program
    {
        static void Main(string[] args)
        {
            /*int[] skaiciai = new int[] { 6, 14, 11, 53, -110, 65, 111, 477, 477, 110 };
            skaiciai
                     .OrderByDescending(y => y)
                     .Where(y => y % 2 != 0)
                     .Skip(0).Take(3)
                     .ToList()
                     .ForEach(y => Console.Write(y + " "));

            Console.WriteLine();

            string[] zodziai = new string [] { "vieNAS", "DU", "trys", "KETURI", "PEnki" };
            zodziai
                .Where(y => y == y.ToUpper())
                .ToList()
                .ForEach(x => Console.Write(x + " "));

            Console.WriteLine();

            string[] zodziai2 = new string[] { "vieNAS", "DU", "trys", "KETURI", "PEnki" };
            zodziai2
                .ToList()
                .ForEach(x => Console.Write($"{x.ToLower()} "));
            //arba
            //.Select(x => x.ToLoewer());

            Console.WriteLine();

            string[] zodziai3 = new string[] { "vieNAS", "DU", "trys", "KETURI", "PEnki", "Penkiasdesimt penki" };
            zodziai3
                .Where(x => x.Length > 5 && x.Length < 8)
                .ToList()
                .ForEach(x => Console.Write(x + " "));*/


            ///////////////////////////////////////////////////////////////////////////////////////////

            // var styginiai = new List<IStyginis> // tinka ir listas ir masyvas
            /*IStyginis[] styginiai = new IStyginis[]
            {
                new Smuikas (6, 150),
                new Kukulele (4, 80),
                new Gitara (8, 160),
                new Smuikas (7, 195),
                new Kukulele (5, 88),
                new Gitara (12, 240),
                new Smuikas (8, 198),
                new Kukulele (2, 54),
                new Gitara (11, 345),
            };

            styginiai
                .ToList()
                .ForEach(x => x.SpausdinkInformacija());

            Console.WriteLine();

            styginiai
                .OrderBy(x => x.Pavadinimas)
                .ToList()
                .ForEach(x => x.SpausdinkInformacija());

            Console.WriteLine();

            styginiai
                .Where(x => x.StyguSk > 3 && x.StyguSk <6)
                .ToList()
                .ForEach(x => Console.WriteLine($"Esu {x.Pavadinimas}. Turiu {x.StyguSk} stygas."));

            Console.WriteLine();

            styginiai
                .Skip(2).Take(styginiai.Length - 2 - 1)  // jei Listas tada styginiai.Count
                .ToList()
                .ForEach(x => x.Grok());*/

            // ============== PAVELDEJIMAS ===============================================

            var person = new Person("Jonas", "Jonaitis", "Zibuciu g.12");
            Console.WriteLine(person);
            Console.WriteLine(person.Name);

            var student = new Student("Petras", "Petraitis", "Universiteto g.3");
            Console.WriteLine(student);
            student.AddCourseGrade("matematika", 2);
            Console.WriteLine(student.PrintGrades());



            Console.ReadLine();
        }
    }
}
