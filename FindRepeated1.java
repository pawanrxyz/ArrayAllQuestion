import java.util.Scanner;
public class FindRepeated1 {
    public static int findRepeatingNumber(int [] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        } 
        return -1;      
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
        System.out.println("Repeatting Element is : "+findRepeatingNumber(arr));
        sc.close();
    }
        
}
