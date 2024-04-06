import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class map {
    // public static void main(String[] args) {
    //     Map<String, Integer> map = new Hashtable<>();
    //     map.put("Kapil ",458);
    //     map.put("Mishra ",8594);
    //     map.put("harsh ",588);
    //     map.put("Kiran ",898);
    //     System.out.println(map.keySet());
    //     for(String key :map.keySet()){
    //         System.out.println(key+ "="+map.get(key));
    //     }
    
    // }
    public static void main(String[] args) {
        ptr2(4, 0);
        
    }
    static void ptr(int r, int c){
        if(r==0){
            return ;
        }
        if(r>c){
            System.out.print("*");
            ptr(r, c+1);
        }
        else{
            System.out.println();
            ptr(r-1,0);
        }
    }
    static void ptr2(int r, int c){
        if(r==0){
            return ;
        }
        if(r>c){
           
            ptr(r, c+1);
            System.out.print("*");
        }
        else{
            
            ptr(r-1,0);
            System.out.println();
        }
    }
    
}
