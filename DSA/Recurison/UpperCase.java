package Recurison;
import java.io.EOFException;
import java.util.*;
public class UpperCase {
    public static void main(String[] args) {
        String s ="kapilKumarmishra";
        String m= "KAPILkKUMARMISHRA";
        char  o=Upper(s, 0);
        char p= Lower(m, 0);
        System.out.println(o);
        System.out.println(p);
        
    }
    static char Upper(String str, int i){
        if(str.charAt(i)=='\0'){
            return 0;
        }
        if(Character.isUpperCase(str.charAt(i))){  // here we are checking wether the element is in upper case or lower case
            return str.charAt(i);
        }
        try{
            return Upper(str,i+1);
        }
        catch(Exception e){
            System.out.println("Error occured");
            
            
        }
        return 0;
    }
    static char Lower(String str, int i){
        if(str.charAt(i)=='\0'){
            return 0;
        }
        if(Character.isLowerCase(str.charAt(i))){  // Here we are finding the lower case of the string
            return str.charAt(i);

        }
        try{
            return Lower(str,i+1);
        }
        catch(Exception e){
            System.out.println("Error occured ");
        }
        return 0;

    }
    
}
