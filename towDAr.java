import java.util.*;

public class towDAr {
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[row][cols];

        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        boolean notFound = true;

        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                if(matrix[i][j] == x) {
                    System.out.println("row = "+i+" and cols = "+j);
                    notFound = false;
                }
            }
        }

        if(notFound) {
            System.out.println(x+" wont exist in the  matrix");
        }

        sc.close();
    }
}