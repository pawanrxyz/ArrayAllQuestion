import java.util.Scanner;
public class SortZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr [] = new int[n];
        
        System.out.println("Enter "+n+" elements of arrays");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=1;j<arr.length;j++) {
                if(arr[i] != arr[j+1]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    
        System.out.println();
        sc.close();

    }
    
}
