import java.util.Random;
import java.util.Scanner;

public class project_1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int  Rendom_num=(int)(Math.random()*100);
        int my_number=0;
        do{
            System.out.println("Guess your number !");
            my_number=sc.nextInt();
            
            if (my_number ==Rendom_num){
                System.out.println("Yes!!!!! you guess it rihght !");
            }
            else if (my_number < Rendom_num){
                System.out.println("Number is smaller than Rendom_num !");
            }
            else {
                System.out.println("Number is greater than Rendom_num !");

            }

        }while(my_number>=0);
        
        System.out.println("Your number was : ");
        System.out.println(my_number);


    }

    
}
