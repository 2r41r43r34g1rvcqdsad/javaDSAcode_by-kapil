import java.util.Scanner;


public class increment_by_one {
    public static void main(String[] args){
        System.out.println("Enter your nember:");
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        while(n>0){
            int m,a;
            a=n%10;
            a++;
            m *= 10+a;
            n=n/10;
        }

    }

    
}
