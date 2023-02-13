import java.util.Scanner;
// import java.util.*;
public class RotateArray_2 {
    static void printArray(int arr[]) {
        System.out.println("Our Array After rotating:");
        for(int  i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void revers(int []arr,int i,int j) {
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateInplace(int [] arr,int k) {
        int n = arr.length;
        k = k%n;
        revers(arr, 0, n-k-1);
        revers(arr, n-k, n-1);
        revers(arr, 0, n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n+" Elements of array:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    

        System.out.println("Enter k: ");
        int k = sc.nextInt();
            rotateInplace(arr,k);
            
            
        printArray(arr);
        sc.close();
    }
    
}
