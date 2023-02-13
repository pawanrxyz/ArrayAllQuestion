public class MergeSort {

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void devide(int arr[],int start,int end) {
        int mid = start+(end-start)/2;
        if(start>=end) {
            return;
        }
        mid = start+(end-start)/2;
        devide(arr, start, mid);
        devide(arr, mid+1, end);
        conquer(arr, start, mid, end);
    }

    public static void conquer(int arr[],int start,int mid,int end) {
        int merged[] = new int[end-start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;

        while(idx1<=mid && idx2<=end) {
            if(arr[idx1]<=arr[idx2]) {
                merged[x++] = arr[idx1++];
            }
            else {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1<=mid) {
            merged[x++] = arr[idx1++];
        }
        while(idx2<=end) {
            merged[x++] = arr[idx2++];
        }

        for(int i=0,j=start;i<merged.length;i++,j++) {
            arr[j] = merged[i];
        }
    }

    
    public static void main(String args[]) {
        int arr[] = {2,6,4,3,1,7};
        int start = 0;
        int end = arr.length-1;
        devide(arr, start, end);
        printArray(arr);
    
    }
    
}
