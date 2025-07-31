// import java.util.*;

public class learningString {
    public static void main(String arr[]) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Hii my name is "+name);
        // sc.close();

        // ##concatenation (adding the tow or more string)

        // String firstName  = "Sandeep";
        // String lastName = "Sharma";
        // String fullName = firstName+" " + lastName;
        // System.out.println(fullName.length());

        // for(int i=0; i<fullName.length(); i++) {
        //     System.out.print(fullName.charAt(i)+" ");
        // }


        // ##How to Compare the two Strings {compateTo()}

        // String firstName = "Sandeep";
        // String firstName1 = "Sandeep";

        // if(new String("sandeep") != new String("sandeep")) {
        //     System.out.println("the strings are not equal!!");
        // }


        // System.out.println(firstName.compareTo(firstName1) == 0);


        // ##substring 

        String sentence = "My name is Sandeep";
        String name  = sentence.substring(14, sentence.length());

        System.out.println(name);

        // ## Strings are immutable {onc the string is create in the memory is can not be changed, to make any changes we have to create a new string with the changes at different memory location}
    }
}
