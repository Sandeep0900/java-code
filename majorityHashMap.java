import java.util.*;

public class majorityHashMap {

    public static void printMaxElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = arr.length;
        for(int i=0; i<size; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            } 
        }

        Set<Integer> keys = map.keySet();

        for(int key : keys) {
            if(map.get(key) >= size/3) {
                System.out.print(key+" ");
            }
        }
    }
    
    public static void main(String arr[]){
        int arr1[] = {1,2,3,4,5,1,1,1,1,1,5,5,5,5,5,5,5,5};
        
        printMaxElement(arr1);

    }
}
