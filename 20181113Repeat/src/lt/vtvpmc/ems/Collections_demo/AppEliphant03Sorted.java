package lt.vtvpmc.ems.Collections_demo;


import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class AppEliphant03Sorted
{
    private static class Eliphant implements Comparable<Eliphant> {
        private String name;
        private double weight;

        public Eliphant(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return this.name;
        }

        public double getWeight() {
            return this.weight;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Eliphant other = (Eliphant) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }

        @Override
        public int compareTo(Eliphant other) {
            return this.getName().compareTo(other.getName());
        }

    }

    public static void main(String[] args)
    {
        SortedSet<Eliphant> eliphants = new TreeSet<Eliphant>(
                (leftEliphant, rightEliphant) ->
                        leftEliphant.getName().compareTo(rightEliphant.getName())
        );

        eliphants.add(new Eliphant("Jonas", 900));
        eliphants.add(new Eliphant("Onute", 700));

//      System.out.println(
//          (new Eliphant("Jonas", 900)).equals(new Eliphant("Jonas", 800))
//      );

        System.out.println(
                eliphants.contains(new Eliphant("Jonas", 800))
        );
    }
}