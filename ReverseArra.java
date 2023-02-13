import java.util.Scanner;
public class ReverseArra {
    static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void revrseArray(int arr[]) {
        int n = arr.length;
        int start = 0,end = n-1;
        while(start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        System.out.println("Enter "+n+" Elements of an array : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before reverse array ");
        printArray(arr);
        System.out.println("After reverese array");
        revrseArray(arr);
        printArray(arr);
        sc.close();
    }
}