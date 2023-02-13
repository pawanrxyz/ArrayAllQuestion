import java.util.Scanner;
public class ArraySortZeroesAndOnes {
    static void printArray(int [] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortZoresAndOnes(int arr []) {
        int zeroes = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
                zeroes++;               
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(i<zeroes) {
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr [] = new int[n];
        
        System.out.println("Enter "+n+" elements of arrays");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Arrays: ");
        printArray(arr);
        sortZoresAndOnes(arr);
        System.out.println("Sorted Arrays: ");
        printArray(arr);

        sc.close();
    }    
}
