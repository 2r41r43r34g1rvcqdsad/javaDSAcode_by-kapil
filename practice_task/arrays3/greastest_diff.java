import java.util.*;

public class greastest_diff {
    public static void main(String[] args) {
        Scanner s = new Scanner();
        int n;
        System.out.println("Enter the lenght if the string :");
        n = s.nextInt();
        int arr = new Int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i]= s.nextInt();

        }

        int dis =0, dif;
        int a=0,int b=0;
        for(int i=0; i<n; i++){
            for(j=i+1; i<n; i++){
                dif=Math.abs(arr[i]-arr[j])
                dis=dif;
                a=i;
                b=j;


                
            }
        }

    }

}
