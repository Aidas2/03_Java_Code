using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SeptintaPamoka
{
    class Daugiakampis
    {
        private List<Taskas> _taskai;               // cia yra savybes (privatus sarasas). Kol kas tuscias.
                                                    // saraso pavadinimas toks pat kaip ir klases Taskas
                                                    // Tai reiskia kad liste yra ar bus ne bet kokie objektai, o objektai is klases Taskas.
        public Daugiakampis(List<Taskas> taskai)    // cia yra konstruktorius. Pagal ji bus sukuriamas objektas ir uzpildomas List.
                                                    // "taskai" yra tiesiog pavadinimas, galima parasyti bet koki, pvz "x".
        {
            _taskai = taskai;
        }

        public void SpausdinkTaskus()               // cia yra metodas
        {
            foreach (var t in _taskai)
            {
                t.Spausdinti();
            }
        }

        public void PridekTaska(double x, double y) // cia yra metodas (prideti taska)
        {
            _taskai.Add(new Taskas(x, y));  // new reikalingas nes neuztenka parasyt tik klases pavadinimo (Taskas). Tai yra desinioji lygybes zenklo puse.
                                            // mes kuriam nauja objekta pagal klase Taskas, todel ir rasom new Taskas;
        }

        public void IstrinkTaska (int indeksas)     // cia yra metodas (atimti taska)
        {
            _taskai.RemoveAt(indeksas);
        }
    }
}
