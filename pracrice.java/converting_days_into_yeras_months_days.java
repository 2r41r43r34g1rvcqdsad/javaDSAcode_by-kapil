import java.util.Scanner;

public class converting_days_into_yeras_months_days{
    public static void main(String[] args) {
        int d;
        Scanner s =new Scanner(System.in);

        System.out.println("Enter the no of days ");
        d = s.nextInt();
        int y = d/365;
        d=d%365;
        System.out.println("Year = "+ y);
       int w=d/7;
        d=d%7;
        System.out.println("weeek = " + w);
        int day= d; 
        System.out.println("south = " + day);
    }
}