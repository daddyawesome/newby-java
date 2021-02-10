package tutorial;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainLinkedSets {
    public static void main(String[] args){
        //linked hash set is faster Sets

        Set<Integer> t = new LinkedHashSet<Integer>();
        t.add(2);
        t.add(15);
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-5);

        t.remove(9);

        boolean x =t.contains(5);
        System.out.println(t); //hashSet is not sorted
        System.out.println(x);
        int y = t.size();
        System.out.println("Before clearing the size of the set is "+ y);
        //to clear the set
        t.clear();
        y = t.size();
        System.out.println("After clearing the set, the size of the set is "+ y);

    }
}
