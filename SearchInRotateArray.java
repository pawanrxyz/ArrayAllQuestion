import java.util.Scanner;

public class SearchInRotateArray {
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        if (start >= end) {
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
        // printArray(arr);
    }
    static void findMini(int arr[]) {
        // int min = Integer.MAX_VALUE;

        // for(int i=0)
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements of an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        printArray(arr);
        reverseArray(arr, 0, n - 1);
        printArray(arr);
        sc.close();
    }

}
