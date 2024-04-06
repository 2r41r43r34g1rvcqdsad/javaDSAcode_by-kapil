import java.util.Arrays;

public class unique {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,1,2,3,4};
        System.out.println(ans(arr))  ;
        
    }

    private static int ans(int[] arr) {
        int Unique =0;
        for(int n :arr){
            Unique^=n;
        }
        return Unique;
    
    }
    
}
