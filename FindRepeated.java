import java.util.Scanner;
public class FindRepeated {
    static int findMax(int arr[]) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i]>mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecondMAx(int arr[]) {
        int mx = findMax(arr);
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
                break;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
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

        System.out.println("This is the second element of the array: "+findSecondMAx(arr));
        sc.close();
    }
    
}
