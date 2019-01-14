package lt.vtvpmc.ems.itakademija.aidas;

//Enumsai

import java.util.Arrays;

public class JavaEnums {
    public static void main(String[] args) {
        //Planets planet = new Planets(); // taip negalima nes enumsai
        Planets planet;                    //taip galima ir reikia
        planet = Planets.Mercury;

        System.out.println(planet.getClass().getSuperclass()); //reflection mechanizmas, pasako kas yra tevine klase
                                                                //class java.lang.Enum


        if (planet == Planets.Earth) {
            System.out.println("Vedes ir turi vaiku");
        } else {
            System.out.println("...");
        }

        switch (planet) {
            case Mercury:{
                System.out.println();
                break;
            }
            case Venus: {
                System.out.println();
                break;
            }
            case Earth:{
                System.out.println();
                break;
            }
            case Mars: {
                System.out.println();
                break;
            }
                default: {
                    System.out.println("Itrauk si atveji i Enums sarasa");
                    break;
                }
        }

        Planets solarSystem [] = Planets.values(); //isvedame visa Enums sarasa (su Arrays.to String)
        System.out.println(Arrays.toString(solarSystem));

        for (Planets ourPlanets : solarSystem) { //isvedame visa Enums sarasa (su foreach)
            System.out.println(ourPlanets);
        }

        planet = Planets.valueOf(("Mars"));
        System.out.println("Vedes ir turi vaiku issikrauste i  " + planet);

        //po to kai planetoms enumse buvo suteiktas eiles numeris (value):
        Planets pl1, pl2, pl3;
        for (Planets pl : Planets.values()) {
            System.out.println( pl + " : " + pl.getPlanetNumber());
        }

        //comaparator
        pl1 = Planets.Earth;
        pl2 = Planets.Mars;
        pl3 = Planets.Mercury;
        System.out.println("Comparing: " + pl1.compareTo(pl2)); //Comparing: -1





    }
}
