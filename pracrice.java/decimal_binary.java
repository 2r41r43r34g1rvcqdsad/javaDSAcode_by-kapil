import java.util.Scanner;

public class decimal_binary {
    public static void main(String[] args) {
        int a;
        String b = "";
        Scanner e= new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        a=e.nextInt();
        while(a>0){
            int c= a%2;
            a=a /2;
            b=c+ "" +b;
;
        }
        System.out.println(b);
    }
    
}
