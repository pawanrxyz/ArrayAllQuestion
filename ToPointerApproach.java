import java.util.*;
public class ToPointerApproach {
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");            
        }
        System.out.println();
    }
    static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortZeroAndOne(int arr[]) {
        int n = arr.length;
        int left = 0,rigth = n-1;

        while(left<rigth) {
            if(arr[left] == 1 && arr[rigth] == 0) {
                swap(arr,left,rigth);
                left++;
                rigth--;
            }
            if(arr[left] == 0) {
                left++;
            }
            if(arr[rigth] == 1) {
                rigth--;
            }
        }
        // printArray(arr); // we can also call from here
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+"Elements of an Arrays:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Before Sorting array:");
        printArray(arr);
        System.out.println("After swapping array:");
        sortZeroAndOne(arr);
        printArray(arr);
        in.close();
    }    
}
