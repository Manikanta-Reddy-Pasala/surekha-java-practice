package com.learning.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Machine implements Comparable<Machine> {
    private String name;

    public Machine(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
//if we want to add elements to the set we need hashcode and equals method
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
        final Machine other = (Machine) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Machine machine) { //sorting length of string wise, there should be no conflicts between this &
        //equals method
        int len1 = name.length();
        int len2 = machine.name.length();

        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        else {//when 2 names are same length in treeSet 1 replaces the other with same length hence below method to print
            // both the strings by comparing the string name.
            return name.compareTo(machine.name);
        }
    }
}

public class NaturalOrdering {
    public static void main(String[] args) {
        List<Machine> list = new ArrayList<Machine>();
        SortedSet<Machine> set = new TreeSet<Machine>();

        addElements(list);
        addElements(set);

        Collections.sort(list);//only for list because TreeSet sorts in natural order by default and this can't be used
        //for our own objects hence we used compare to method from above comparator interface

       showElements(list);
        System.out.println();
        showElements(set);
    }
//since collections interface can be used in both list & set we can use below method as common to both
    private static void addElements(Collection<Machine> col) {
        col.add(new Machine("Joe"));
        col.add(new Machine("Sue"));
        col.add(new Machine("Juliet"));
        col.add(new Machine("Clare"));
        col.add(new Machine("Mike"));
    }

    private static void showElements(Collection<Machine> col) {
        for(Machine element: col) {
            System.out.println(element);
        }
    }

}

