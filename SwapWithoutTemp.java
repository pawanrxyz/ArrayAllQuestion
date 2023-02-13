public class SwapWithoutTemp {
    static void swap(int a,int b) {
        System.out.println("Before Swapping the  value: ");
        System.out.println("a : " +a);
        System.out.println("b : " +b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping the value: ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    public static void main(String [] args) {
        int a = 4;
        int b = 5;
        swap(a, b);

    }    
}
