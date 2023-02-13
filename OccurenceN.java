import java.util.Scanner;

public class OccurenceN {
    static int Occurence(int arr[] , int x) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    // lastOccurences Number
    public static int lastOcuurencs(int [] arr,int x) {
        int lastIndex = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+ " elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enetr x: ");
        int x = sc.nextInt();

        System.out.println("COUNT OF X: " + Occurence(arr, x));
        System.out.println("COUNT OF X: " +lastOcuurencs(arr, x));

        sc.close();
    }
}