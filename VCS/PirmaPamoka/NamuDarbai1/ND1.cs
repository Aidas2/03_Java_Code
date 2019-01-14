using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NamuDarbai1
{
    class ND1
    {
        static void Main(string[] args)
        {
            ////Namu darbu uzduotis Nr.4.
            ////Aprašykite metodą, kuris nieko negrąžina, tiesiog priima string parametrą - vardą ir išveda į Console tokią žinutę - “Labas, [vardas]”
            ND1Metodai.Pasisveikink("Jonas");
            ND1Metodai.Pasisveikink("Rita");           
            ND1Metodai.Pasisveikinimas(); 

            ////Namu darbu uzduotis Nr.5.
            ////Aprašykite metodą, kuris kaip parametrą priima skaičių masyvą, naudodamas foreach ciklą visus skaičius iš masyvo susumuoja ir grąžina sumą.
            int[] betKoksMasyvas = new int[] {8, 5, 7, 9, 2, -14, 11 };
            int rezultatas = ND1Metodai.SusumuokMasyva(betKoksMasyvas);
            Console.WriteLine($"Masyvo elementu suma yra {rezultatas}.");

            ////Namu darbu uzduotis Nr.6.
            ////Aprašykite metodą, kuris priima skaičių int kaip parametrą - masyvo dydį ir grąžiną sukurtą tokio dydžio masyvą.
            var rezultatas4 = ND1Metodai.SukurkMasyva(10);  // 10 yra įvedamas parametras, nulemiantis masyvo dydį
            foreach (var elementas in rezultatas4)          // foreach naudojamas tik sukurto masyvo išvedimui į ekraną
            {
                Console.Write(elementas + " ");
            }
            Console.WriteLine();
            
            ////Namu darbu uzduotis Nr.7.
            ////Aprašykite metodą, kuris priima skaičių int - indeksą bei masyvą int[] kaip parametrus ir grąžina masyvą su nunulintu skaičiumi tuo indeksu.
            int[] betKoksMasyvas5 = new int[] { 8, 5, 7, 9, 2, 14, 11 };
            var rezultatas5 = ND1Metodai.NunulinkElementa(2, betKoksMasyvas5);
            foreach (var elementas in rezultatas5)
            {
                Console.Write(elementas + " ");
            }
            Console.WriteLine();

            //Mano pradiniai variantai kurie nevalit :(, reik pabandyt dar karta
            var rezultatas01 = ND1Metodai.SukurkMasyva01(5);
            foreach (var elementas in rezultatas01)
            {
                Console.Write(elementas + " ");
            }
            Console.WriteLine();

            int[] betKoksMasyvas6 = new int[] { 8, 5, 7, 9, 2, 14, 11 };
            var rezultatas6 = ND1Metodai.NunulinkElementa01(6, betKoksMasyvas6);
            foreach (var elementas in rezultatas6)
            {
                Console.Write(elementas + " ");
            }
            Console.WriteLine();
            
            Console.ReadLine();
        }
    }
}