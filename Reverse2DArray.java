import java.util.Scanner; 
public class Reverse2DArray {
    public static void printarray(int arr[][]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static Scanner sc = new Scanner(System.in);
        
        static int r = sc.nextInt();
        static int c = sc.nextInt();
    
    public static void reverse(int arr[][]) {
        
        for(int i=0;i<r;i++) {
            int start = 0;
            int end = c-1;

            while(start<end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your row size ");
        // int r = sc.nextInt();
        // System.out.println("Enter your coloumn size ");
        // int c = sc.nextInt();

        int arr[][] = new int[r][c];
        int total = r*c;
        System.out.println("Enter "+total+" Elment ");

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }printarray(arr);
        System.out.println("After revsrse ");
        reverse(arr);

    }
    
}
