import java.util.Scanner;
public class ArrrayNumberOfQueriese {
    public static int [] preSumQuriese(int arr[]) {
        int n = arr.length;
        for(int i=1;i<n;i++) {
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
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

        int prefSum [] = preSumQuriese(arr);
        System.out.println("PreFix Sum "+prefSum);

        System.out.println("Enter number of queriese ");
        int q = in.nextInt();

        while(q-->0) {
            System.out.println("Enter range ");
            int l = in.nextInt();
            int r = in.nextInt();

            int ans = prefSum[r]-prefSum[l-1];
            System.out.println("Sum "+ans);
        }
        in.close();

    }
    
}
