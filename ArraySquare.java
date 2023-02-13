import java.util.*;

public class ArraySquare {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static int[] squareArray(int arr[]) {
        int n = arr.length;
        int left = 0,  right =  n  - 1;
        int ans[] = new int[n];
        int k = 0;

        while  (left  <= right) {
            if  (Math.abs(arr[left] )  > Math.abs(arr[right])) {
                ans[k++] = arr[left]*arr[left];
                left++;
            } else {
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }
        // printArray(arr);
        return ans;
    }
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.println("Original aray: ");
        printArray(arr);

        int ans[] = squareArray(arr);
        System.out.println(ans);
        printArray(ans);
        reverse(ans);
        printArray(ans);
        sc.close();
    }   
}
