import java.util.Scanner;
public class ReverArray {
    static void reverseArray(int [] arr) {
        int n = arr.length-1;
        System.out.println("Before reverse the array:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After reverse the array: ");
        for(int i = n;i>=0;i--) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);    
        sc.close();
    }
    
}
