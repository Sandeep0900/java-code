import java.util.*;

public class Hashing {
    public static void main(String arr[]){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA",30 );
        map.put("China", 140);
        map.put("India", 1280);
        System.out.println(map);
        // System.out.println(map.containsKey("India1"));
        // System.out.println(map.get("India"));
        // System.out.println(map.get("Indonesia"));

        // for(Map.Entry<String, Integer> e : map.entrySet()) {
        //     System.out.println(e.getValue());
        //     System.out.println(e.getKey());
        // }

        // Set<String> keys = map.keySet();

        // for(String key : keys) {
        //     System.out.println(key + " " + map.get(key));
        // }

        map.remove("China");
        System.out.println(map);

    }
    
}
