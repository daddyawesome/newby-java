package tutorial;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSets {
    public static void main(String[] args){
        //Sets

        Set<Integer> t = new HashSet<Integer>();
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

        Set<Integer> tree = new TreeSet<Integer>();
        tree.add(5);
        tree.add(7);
        tree.add(5);
        tree.add(9);
        tree.add(-5);
        tree.add(-15);
        tree.add(25);

        tree.remove(9);

        x =tree.contains(5);
        System.out.println(tree); //TreeSet is not sorted
        System.out.println(x);
        y = tree.size();
        System.out.println("Before clearing the size of the set is "+y);
        //to clear the set
        tree.clear();
        System.out.println("After clearing the set, the size of the set is "+ y);

    }
}
