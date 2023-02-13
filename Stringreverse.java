public class Stringreverse {
    public static void reverse(String str,int idx) {
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        // char curr = str.charAt(idx);
        reverse(str, idx-1);
    }
    public static void main(String args[]) {
        String str = "abc";
        reverse(str, 3);

    }
    
}
