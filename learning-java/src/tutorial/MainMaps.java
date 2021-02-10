package tutorial;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMaps {
    public static void main(String[] args){
        //Maps are Dictionary in Python

        Map m = new HashMap();

        m.put("mark", 17);
        m.put("king", "awesome");
        m.put(12, 101117);

        System.out.println(m);
        System.out.println(m.get(12));
        System.out.println(m.get("mark"));

        //TreeMap are sorted should had same datatype for keys
        Map n = new TreeMap();

        n.put("mark", 18);
        n.put("king", "awesome");
        n.put("Russ", 9999);

        System.out.println(n);
        System.out.println(n.get("king"));
        System.out.println(n.get("mark"));

        //LinkedHasMap follow the order it was added should had same datatype for keys
        Map o = new LinkedHashMap();

        o.put("mark", 18);
        o.put("king", "awesome");
        o.put("Russ", 9999);

        System.out.println(o);
        System.out.println(o.get("king"));
        System.out.println(o.get("mark"));

        //using containsKey and containsValue
        System.out.println(m.containsValue("mark"));
        System.out.println(m.containsKey("mark"));
        System.out.println(m.containsValue(17));
        System.out.println(m.containsKey(17));
        System.out.println(m.values());
        System.out.println(m.isEmpty());
    }
}
