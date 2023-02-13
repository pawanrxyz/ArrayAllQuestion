
import java.util.Scanner;
public class ReverseBySwap {
    static void swapArray(int arr[]) {
        int n = arr.length;
        System.out.println("Before reverse the arrays:");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("After Revese the array:");
        for(int i=n-1;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the "+n+" elements:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        swapArray(arr);
        sc.close();

    }
    
}
