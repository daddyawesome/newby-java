package tutorial;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args){
        //Let's count the characters in the sentence
        Map m = new HashMap();
        String s = "I am so Awesome and Happy and youshould know that";

        for (char x:s.toCharArray()){
            if (m.containsKey(x)){
                int old = (int) m.get(x);
                m.put(x,old + 1);
            }
            else {
                m.put(x, 1);
            }
        }

        m.remove(' ');
        System.out.println(m);


    }
}
