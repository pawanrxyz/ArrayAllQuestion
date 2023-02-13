// import java.util.Arrays;
import java.util.Scanner;
public class IsArraySorted {
    static boolean isArraySorted(int[] arr) {
        // Arrays.sort(arr);
        boolean check = true;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String arsg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("isSorted :"+ isArraySorted(arr));
        sc.close();

    }    
}
