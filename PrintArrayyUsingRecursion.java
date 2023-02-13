public class PrintArrayyUsingRecursion {
    public static void printArray(int arr[],int idx) {
            if(idx == arr.length) {
            // System.out.pri   nt(arr+" ");
            return;
         }
        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1);
    }
    public static void main(String args[]) {
        int arr[] = {1,2,4,6,7,8};
        printArray(arr, 0);
    }
    
}