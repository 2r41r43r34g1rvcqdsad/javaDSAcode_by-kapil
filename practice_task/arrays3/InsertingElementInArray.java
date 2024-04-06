import java.util.*;
public class InsertingElementInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the  array: ");
        n= s.nextInt();
        int []arr = new int[n+n];
        System.out.println("ENter the array elements: ");

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("ENter tha array element you wnat to insert: ");
        int t=s.nextInt();
        System.out.println("Enter the index: ");
        int d= s.nextInt();
        for(int i=(n-1);i>=(d-1);i--) {
            arr[i+1]=arr[i];
        }
        arr[t-1]=d;
        System.out.println("After Inserting : ");
        for(int i =0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println(arr[n]);
        
    }
    
}
