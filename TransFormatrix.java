
import java.util.Scanner;
public class TransFormatrix {
    public static void printArray(int arr[][]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");                
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter size of row ");
        int row = sc.nextInt();
        System.out.println("Enter size of coloumn ");
        int  col = sc.nextInt(); 
        
        System.out.println("Enter number of row and column ");
        int arr[][] = new int [row][col];
         for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                arr[i][j] = sc.nextInt();
            }
         }
         System.out.println("Before transeeForrm Matrix ");
         printArray(arr);
         int ans[][] = new int [row][col];
        System.out.println("Transform matrix ");
         for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                ans[i][j] = arr[j][i];
            }
         }
         printArray(ans);
         sc.close();

     }
    
}
