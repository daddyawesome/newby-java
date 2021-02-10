package tutorial;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainLists {
    public static void main(String[] args){
        //lists can change size
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(2);
        t.add(4);
        t.add(5);
        t.add(4);
        t.add(1);
        t.add(6);

        t.set(1,5);

        System.out.println(t);
        System.out.println(t.get(0));
        System.out.println(t.size());
        System.out.println(t.isEmpty());
        System.out.println(t.subList(1,3));

        System.out.println("Using LinkedList");
        LinkedList<Integer> tt = new LinkedList<Integer>();
        tt.add(6);
        tt.add(7);
        tt.add(5);
        tt.add(4);
        tt.add(-1);
        tt.add(8);

        tt.set(3,5);

        System.out.println(tt);
        System.out.println(tt.get(0));
        System.out.println(tt.size());
        System.out.println(tt.isEmpty());
        System.out.println(tt.subList(1,3));
    }
}
