import java.util.ArrayList;
import java.util.Collections;

// to import every thing, All the classes
// import java.util.*;

public class arrayLinst1 {
    public static void main(String args[]) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        // ArrayLinst<String> List2 = new ArrayList<String>();

        List.add(0);
        List.add(0);
        List.add(0);
        System.out.println(List.get(0));
        // add element in between
        List.add(1,1);
        System.out.println(List);
        // set element in between
        List.set(2,2);
        System.out.println(List);
        // delete element in the list of array
        List.remove(2);
        System.out.println(List);

        // size of the Array List
        System.out.println(List.size());

        // Loop of the Array list
        for(int i=0; i<List.size(); i++) {
            List.set(i,List.get(i) +1);
        }
        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);
    }
    
}
