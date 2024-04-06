package Recurison;

public class ReverseString {
    public static void main(String[] args) {
        String str="Kapil Kaumr Mishra";
        String reverse = Reverse(str);
        System.out.println(reverse);
    }
    static String Reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return Reverse(str.substring(1)+str.charAt(0));
        
    }
    
}
