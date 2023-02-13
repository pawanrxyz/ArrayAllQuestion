import java.util.Scanner;
public class FindUniqueNu {
    static int findUnique(int [] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for(int i=0;i<n;i++) {
            if(arr[i]>0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        System.out.print("Enter "+n+" element of array");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("Enter your target element: ");
        // int target = sc.nextInt();

        sc.close();
        System.out.println("The Unique No of Arrays is : "+findUnique(arr));
    }
}