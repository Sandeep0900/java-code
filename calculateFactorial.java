import java.util.*;

public class calculateFactorial {
    public static int factorial(int num) {
        if(num == 1 || num == 0) {
            return 1;
        }

        return num * factorial(num-1);
    }

    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
    
}
