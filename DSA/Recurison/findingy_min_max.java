package Recurison;
import java.util.*;

public class findingy_min_max {
    public static void main(String[] args) {
        int[] arr = {1,2,4,-3,5};
        int n=arr.length;
        System.out.println("min= "+FindMin(arr,n));
        System.out.println("max= "+findMax(arr, n));
     }
     static int FindMin(int[]arr, int a){
        if(a==1){
            return arr[0];
        }
        return Math.min((arr[a-1]) ,FindMin(arr,a-1));
     }
     static int findMax(int []arr, int a){
        if(a==1){
            return arr[0];
        
        }
        return Math.max(arr[a-1],findMax(arr, a-1));
     }
}
