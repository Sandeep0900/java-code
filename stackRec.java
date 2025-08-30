import java.util.*;

public class stackRec{

    public static void rec(Stack<Integer> s, int a) {
        if(s.isEmpty()) {
            s.push(a);
            return;
        }
        int val = s.pop();
        rec(s,a);
        s.push(val);
    }

    public static void main(String[] arr) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        rec(s,5);
        System.out.println(s);
    }
}