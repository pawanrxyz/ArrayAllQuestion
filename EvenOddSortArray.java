import java.util.*;

public class EvenOddSortArray {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortEvenAndOdd(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements of for array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter Original Arrray:");
        printArray(arr);
        sortEvenAndOdd(arr);
        System.out.println("After Sorting array:");
        printArray(arr);
        Arrays.sort(arr);
        in.close();
    }
}
