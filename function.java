import java.util.*;

public class function {

    public static int factorialOfNum(int a) {
        if(a<0) {
            System.out.println("the Factorial of 'Nagative' number is not possilble");
            return 0;
        }

        if(a == 0) {
            return 1;
        }
        int fact = 1;
        while(a != 0) {
            fact *= a;
            a--;
        }

        return fact;
    }

    // public static void printMyName(String a) {
    //     System.out.println();
    //     System.out.println("Hello.."+a+"...!!");

    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number for the factorial: ");
        int n1 = sc.nextInt();
        int fac = factorialOfNum(n1);
        System.out.println(fac);

        sc.close();
    }
    
}
