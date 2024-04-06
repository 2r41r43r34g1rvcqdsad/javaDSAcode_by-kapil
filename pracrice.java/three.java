import java.time.Duration;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class three {
public static void main(String[] args) {
    int yr;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a year: ");
    yr= s.nextInt();
    boolean flag = false;
    if(yr%400==0){
        flag = true;
    }
    else if (yr%100==0){ 
        flag = false;
    }
    else if(yr%4==0){
        flag = true;
    }
    else {
        System.out.println(yr + " is not  a leap year.");
    }
    if (flag==true){
        System.out.println(yr + " is a leap year");

    }
    else {
        System.out.println(yr + "Not a leap year");
    }

}
    
    
}
