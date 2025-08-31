import java.util.HashSet;
import java.util.Iterator;

public class HashSetCode {
    public static void main(String arr[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(8);
        set.add(7);
        set.add(3);
        set.add(5);
        set.add(2);
        set.add(null);
        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println(set.contains(2));
        System.out.println(set.size());

        Iterator<Integer> it = set.iterator();
        // System.out.println(it);

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
