import java.util.Scanner;
public class FindSttrictlygreaterThanNo {
    static int strctlyArray(int[] arr, int x) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+ n + " elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();            
        }
        System.out.println("Enter no of x: ");
        int x = sc.nextInt();
        System.out.println("Total greater element of x is: " +strctlyArray(arr, x));
        sc.close();        
    }    
}
