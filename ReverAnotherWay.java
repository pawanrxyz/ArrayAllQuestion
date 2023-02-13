public class ReverAnotherWay {
    

    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static int [] reverseArray(int [] arr) {
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;

        for(int i = n-1;i>=0;i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String [] args) {
        int arr[] = {1,2,3,4,5};
        int[] ans = reverseArray(arr);
        System.out.println(ans);
        printArray(arr);
    }
}