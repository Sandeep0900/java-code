public class bubbleSort {
    public static void main() {
        // int[] arr = new int[10];
        int[] arr1 = {1,2,3,4,5};
        int n =  arr1.length;
        // while(n != 0) { //timeCoplexity of this code is O(N^2)
        //     for(int i=0; i<n; i++) {
        //         if(arr1[i]>arr1[i+1]) {
        //             // Swap
        //             int temp = arr1[i];
        //             arr1[i] = arr1[i+1];
        //             arr1[i+1] = temp;
        //         }
        //     }
        //     n--;
        // }

        for(int i=0 ; i<n; i++) { //the time complexity of this code is O(N^2);
            int nu = arr1[i];
            int index = i;
            for(int j =i+1; j<n; j++) {
                if(arr1[j]< nu) {
                    nu = arr1[j];
                    index = j;
                }
            }
            int temp = arr1[i];
            arr1[i] = nu;
            arr1[index] = temp;
        }

        for(int at: arr1) {
            System.out.print(at+" ");
        }

    }
    
}
