package Recurison;
public class recursion {
    public static void main(String[] args) {
        Print(5);

        
    }
    static void Print(int n){
        if(n==0){
            return;

        }
        
        
        System.out.println(n);// 54321
        Print(n-1);
        System.out.println(n);//12345
       
        
        
    }
    
}
