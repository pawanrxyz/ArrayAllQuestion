import java.util.*;
public class PrefixOfSumWithoutNewArry {
    static int [] prefixAndSum(int arr[]) {
        int n = arr.length;
        // int left = 0,right = n-1;
        // int [] pref = new int[n];
        // pref[0] = arr[0]; 
        
        for(int i=1;i<n;i++) {
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
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
        // printArray(pref);
        
        System.out.println("Enter number of queriese ");
        int q = in.nextInt();
        
        while(q-->0) {
            System.out.println("Enter range ");
            int l = in.nextInt();
            int r = in.nextInt();

            int ans = pref[r]-pref[l-1];
            System.out.println("Sum "+ans);
        }
        in.close();
    }    
}
    

