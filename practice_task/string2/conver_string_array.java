import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class conver_string_array {
    static int[] convert(String len){
        String []t =len.split(" ");
        int []out = new int[t.length];
        for(int i=0;i<t.length;i++){
            try{
                out[i]=Integer.parseInt(t[i]);

            }
            catch(NumberFormatException e){
                out[i]=-1;
                
            }
        }
        return out;


    }
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String  len;
    
        System.out.println("Enter the string: ");

        try{
            len = reader.readLine();
        }
        catch(Exception e){
            System.out.println("An exception occured ");
            return ;
        }
        int arr[]=convert(len);

        System.out.println("The result is : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
    

}
