import java.util.*;

public class input {
  public static void main(String[] args) {
    System.out.print("Enter The Age of the Person:");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    System.out.println("enter the Second Number: ");
    int num = sc.nextInt();
    
    if(age%2==0) {
        System.out.println("the number "+ age +" is Even"+ num);
    } else {
        System.out.println("the number "+ age +" is Odd"+ num);
    }
    sc.close();
  }
}