package Recurison;

public class remove_duplicate {
    public static void main(String[] args) {
        String a="Kappipikfjmnbakdkfk";
        String b="Kjhfjhafkdjfajkajfakj";
        System.out.println(duplicate(a));
        System.out.println(duplicate(b));
        
    }
    static String duplicate(String str){
        if(str.length()<=1){
            return str;
            
        }
        if(str.charAt(0)==str.charAt(1)){
            return duplicate(str.substring(1));
        }
        else{
            return str.charAt(0)+duplicate(str.substring(1));
        }
    }
    
}
