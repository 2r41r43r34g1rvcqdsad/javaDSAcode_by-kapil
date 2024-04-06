
import java.util.Random;
import java.util.Scanner;
public class Emulate_N_Dice_Roller {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n ;
        System.out.println("Enter a the number to come :");
        n=s.nextInt();
        Random rand = new Random();
        do{
            System.out.println("The values on the dice are :");
            for(int i=0;i<n;i++){
                System.out.println(rand.nextInt(6)+1);
            }


            System.out.println("To continue true or to stop  false");
        }while(s.nextBoolean()==true);
        s.close();
        
    }
    
}
