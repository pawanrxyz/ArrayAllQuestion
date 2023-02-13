import java.util.Scanner;
public class ArrayPrwfixSum {
    public static int[] prefixAndSum(int []arr) {
        int n = arr.length;
        // int left = 0,right = n-1;
        int [] pref = new int[n];
        pref[0] = arr[0]; 
        
        for(int i=1;i<n;i++) {
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;    
    }

    public static void printArray(int arr[]) {
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
        int [] pref = prefixAndSum(arr);
        // printArray(pref);
        System.out.println(pref);

        System.out.println("Enetr number of queriese : ");
        int q = in.nextInt();

        while(q-->0) {
            System.out.println("Enter Range ");
            // int l = in.nextInt();
            // int r = in.nextInt();

            // int ans = prefixAndSum[r]-prefixAndSum[l-1];
            // System.out.println(ans);
        }
        in.close();

    }    
    
}
