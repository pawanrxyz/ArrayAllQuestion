import java.util.Scanner;
public class isPrefixAndSuffixEqual {
    public static int findArraySum(int arr[]) {
        int totalSum = 0;
        for(int i=0;i<arr.length;i++) {
            totalSum += arr[i];
        }        
        return totalSum;
    }

    public static boolean equalSumPartition(int arr[]) {
        int totalSum = findArraySum(arr);

        int prefixSum = 0;
        for(int i=0;i<arr.length;i++) {
            prefixSum += arr[i];

            int suffixSum = totalSum-prefixSum;

            if(suffixSum == prefixSum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = in.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter "+n+" Elements of an array:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        } 
        
        System.out.println(equalSumPartition(arr));     
        in.close();
    }
    
}
