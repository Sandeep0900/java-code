// import java.util.*;

public class StringBuilderLearnig {
    public static void main(String arr[]) {
        StringBuilder sb = new StringBuilder("Sandeep");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(4, 'i');
        System.out.println(sb);

        // to insert the char in the string
        
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.insert(6, 'e');
        System.out.println(sb);

        // to delete the char/ chars form the string
        sb.delete(0, 1);
        sb.delete(4, 5);

        System.out.println(sb);

        // Combination of delete and insert
        sb.delete(4, sb.length());
        sb.insert(4, 'y');
        System.out.println(sb);

        // append (to add the string in the last of the current string)

        sb.append("yyy!");
        System.out.println(sb.length());

        // Q1) reverce the string

        for(int i=0; i<sb.length()/2; i++) {  // the timecomplexity of the code is O(n/2) => O(n)
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);

    }
}
