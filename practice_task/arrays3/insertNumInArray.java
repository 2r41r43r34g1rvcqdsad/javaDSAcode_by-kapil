import java.util.*;

public class insertNumInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=s.nextInt();
        int arr[]=new int[n+n];

        System.out.println("Enter the elements into the array: ");
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
       // System.out.println("The array before ensertion is :" + );

        System.out.println("Enter the index to inset the number: ");
        int ind = s.nextInt();
        System.out.println("Enter the value:");
        int value = s.nextInt();
        for(int i=(n-1);i>=(ind-1);i--){
            arr[i+1]=arr[i];

        }
        arr[ind-1]=value;
        for(int i=0;i<n;i++){
            System.out.println("The new array is :" + arr[i]);
        
    }
    System.out.println(arr[n]);
    
}
}
