import java.util.*;
import java.lang.Math;

public class maxdifbw2nums {
public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n;
    System.out.println("Entr the lenght of hte array: ");
    n=s.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter the numbers in array: ");
    for(int i=0; i<n; i++){
        arr[i]= s.nextInt();
    }
    int diff;
    int maxdif=0;
    int a1=0;
    int a2=0;
    for(int i=0;i<n; i++){
        for(int j=i+1;j<n;j++){
            diff=Math.abs(arr[i]-arr[j]);
            if(diff>maxdif){
                maxdif=diff;
                a1=i;
                a2=j;

            }
        }
    }

    System.out.println("The maximum difference b/w " +maxdif );
    System.out.println("The two elements with the largest difference are "+ arr[a1] + "and"+ arr[a2]);
    

}
    

}
