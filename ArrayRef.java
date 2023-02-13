import java.util.Arrays;
public class ArrayRef {
    static void printArray(int [] arr) {
        for(int i=0;i<arr.length;i++) {
            // System.out.print(arr[i] +" ");
            arr[i] = 0;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 6;
        arr[4] = 7;
        System.out.println("Original Array:");
        printArray(arr);
        
        System.out.println("After copied of array:");
        // int [] arr_2 = arr;
        // int [] arr_2 = arr.clone(); // another way change the copy of array
        // int [] arr_2 = Arrays.copyOf(arr, arr.length); // one another method copy of array
        int [] arr_2 = Arrays.copyOfRange(arr, 1, arr.length);

        printArray(arr_2);

        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("After changing value of copied array:");
        printArray(arr_2);
        


    }
    
}
