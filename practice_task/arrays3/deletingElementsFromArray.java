import java.util.Scanner;

public class deletingElementsFromArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,x,loc=0,flag=1;
        System.out.println("Enter the sixe of the array: ");
        n=s.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element number to delete: ");
        x=s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=1;
                loc=i;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            for(int i=(loc-1);i<n;i++){
                arr[i-1]=arr[i];
            }
            System.out.println("After deleting : ");
            for(int i=0;i<(n-2);i++){
                System.out.println(arr[i]+" ");
    
            }
            System.out.println(n-2);
          
        }
        else{
            System.out.println("Element not fonund: ");
        }

    }
    
}
