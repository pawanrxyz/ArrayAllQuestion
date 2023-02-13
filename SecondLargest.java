import java.util.Scanner;

public class SecondLargest {
    static int findFirstLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // second largest element
    static int SecondLargests(int arr[]) {
        int mx = findFirstLargest(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secMax = findFirstLargest(arr);
        return secMax;

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
        // System.out.println("Largest element in array : "+findFirstLargest(arr));
        System.out.println("Second largest element in array : " + SecondLargests(arr));
        sc.close();

    }
}
