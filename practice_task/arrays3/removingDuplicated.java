import java.util.Scanner;

public class removingDuplicated {
    static int remove(int [] arr){
        int rem=0;
        int i,j;
        for(i=0;i<arr.length;i++){
            for( j=0;j<arr.length;j++){
                if(arr[j]!=arr[i]){
                    break;
                }
            }
            arr[rem++]=arr[i];
            i=j-1;
        }
        return rem;


    }
    public static void main(String[] args) {
        // Scanner s= new Scanner(System.in);
        // int n;
        // System.out.println("Enter the the size of the array: ");        /*try expception heare method here   */
        // n=s.nextInt();
        // int arr[]=new int[n];


        // System.out.println("Enter your array in sorted order: ");
        
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=s.nextInt();
        // }

    
        int r= remove(arr);
        for(int i=0;i<r;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
    
}
