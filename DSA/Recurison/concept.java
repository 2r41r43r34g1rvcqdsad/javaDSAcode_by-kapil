package Recurison;

public class concept {
    public static void main(String[] args) {
        num(5);
        
    }
    static void num(int n){
        if (n==0){
            return ;
        }
        //return num(n--);         // In this case first the function is calling the then going to stack while returning from the stack the number is printing

        System.out.println(n);
        //num(--n);                  // In this case the number is frist printing  and then calling the next function call then it is going to the stack
         
    }
    
}
