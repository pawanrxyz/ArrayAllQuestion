import java.util.*;
public class PrefixSumOfArray {
    // static void swap(int arr[],int i,int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }

    //reverse Arrray:

    static int [] prefixAndSum(int arr[]) {
        int n = arr.length;
        // int left = 0,right = n-1;
        int [] pref = new int[n];
        pref[0] = arr[0]; 
        
        for(int i=1;i<n;i++) {
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;
    }
    // printting Array
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = in.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter "+n+" Elements of an array:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Our Prefix and Sum fo Array:");
        int []pref = prefixAndSum(arr);
        printArray(pref);
        in.close();

    }    
}
