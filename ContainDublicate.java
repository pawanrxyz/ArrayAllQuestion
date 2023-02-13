import java.util.Scanner;
public class ContainDublicate {
    public static boolean isContainDub(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
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
        printArray(arr);
        System.out.println(isContainDub(arr));
        // isContainDub(arr);
        sc.close();
    }
    
}
