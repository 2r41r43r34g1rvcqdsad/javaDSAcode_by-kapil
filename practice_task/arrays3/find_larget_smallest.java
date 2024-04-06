import java.util.*;
public class find_larget_smallest {


    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter the size of the array");
        a = s.nextInt();
        int arr[] = new int[a];
        
        for(int i=0;i<a;i++){ 
            arr[i]=s.nextInt();
        }

        int temp;
        for(int i=0;i<a;i++){
            for(int j =i+1;j<a;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("The largest elemrnt int the array is : "+arr[a-1]);
            
        System.out.println("The smallest element into the group is : "+arr[0]);

    }

    
}
