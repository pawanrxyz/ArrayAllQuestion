public class MiscProblem {
    static void swap(int a,int b) {
        System.out.println("Original  value :");
        System.out.println(a+ " and "+ b);
        int temp = a;
        a  = b;
        b = temp;
        System.out.println("After wsappnig the value:" +a+ " and " +b);

    }
    public static void main(String [] args) {
        int a = 3;
        int b = 9;
        
        // int arr [] = {3,5,5,6,8};
        swap(a, b);
    }
    
}
