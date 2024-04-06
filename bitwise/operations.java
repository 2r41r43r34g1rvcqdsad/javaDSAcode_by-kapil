public class operations {
    public static void main(String[] args) {
        int n=68;
        System.out.println(check(n));
        
    }
    private static boolean check(int n){
        return (n & 1)==1;

    }
    
}
