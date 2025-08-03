public class prin {
    public static void printFeb(int a, int b, int n) {
        if(n <= 2) {
            return;
        }
        int sum = a+b;
        System.out.print(" "+sum);
        printFeb(b, a+b, n-1);
    }

    public static void main(String[] arr) {
        int a=0, b=1;
        System.out.print(a);
        System.out.print(" "+b);
        printFeb(a, b, 10);
    }
}