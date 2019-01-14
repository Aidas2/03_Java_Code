package lt.vtvpmc.ems.Collections_demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class AppEliphant02Map
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

        public String toString() {
            return "Eliphant (" + this.getName() + ", " + this.getWeight() + ")";
        }

    }

    public static void main(String[] args)
    {
        Map<String, Eliphant> eliphants = new HashMap<String, Eliphant>();

        eliphants.put("Jonas", new Eliphant("Jonas", 800));
        eliphants.put("Onute", new Eliphant("Onute", 700));

        System.out.println(
                eliphants.get("Onute")
        );
    }
}