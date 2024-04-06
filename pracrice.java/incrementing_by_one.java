
import java .util.*;
public class incrementing_by_one {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c,y=0;
        System.out.println("Enter the number :");
        c=s.nextInt();
        while (c>0){
            int a=c%10;
            a++;
            y = y*10+a;
            c=c/10;
        }
        c=y;
        y=0;
        while(c>0){
            int a =c%10;
            

            y=y*10+a;
            c=c/10;

        }

        System.out.println(y);


    }




    
}
