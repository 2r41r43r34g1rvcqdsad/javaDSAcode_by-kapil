package Recurison;
import java.util.*;

public class Length_of_String {
    public static void main(String[] args) {
        String a= "I am kapil";
        System.out.println(Lenght(a));
        
    }
    
    static int  Lenght(String s){
        if(s.equals("")){
            return 0;
        }
        return Lenght(s.substring(1))+1;

    }
}
