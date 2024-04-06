import java.io.*;

// public class minDisBew2Num {
//     static int  mindis(int[] arr,int x, int y){
//         int prev,i=0;
//         prev=0;
//     int dist=Integer.MAX_VALUE;
//     for(i=0;i<arr.length;i++){
//         if(arr[i]== x|| arr[i]==y){
//             prev=i;
//             break;
//         }
//     }

//     for( i=prev+1;i<arr.length;i++){
//         if(arr[i]==x||arr[i]==y){
//             if(arr[i] != arr[prev] && arr[i-prev]<dist){
//                 dist=i-prev;
//                 prev=i;
//             }
//             else{
//                 prev=i;
        
//     }


        
//         }
//     }

//     return dist;

    

//     }
//     public static void main(String[] args) {
//         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//         int n;
//         System.out.println("Enter the size of the array: ");
//         try{
//             n=Integer.parseInt(br.readLine());
//         }
//         catch(Exception e){
//             System.out.println("An error occured. ");
//             return;
//         }

//         int arr[] = new int[n];
//         System.out.println("Enter the elemrnts into the array:");
//         for(int i=0 ; i<arr.length;i++){
//             try{
//                 arr[i]=Integer.parseInt(br.readLine());

//             }
//             catch(Exception e){
//                 System.out.println("An error occurd.");

//             }

//         }

//         System.out.println("Enter the two numbrs to find the distance: ");
//         int x,y;
//         try{
//             x=Integer.parseInt(br.readLine());
//             y=Integer.parseInt(br.readLine());

//         }
//         catch(Exception e){
//             System.out.println("An error occured ");
//             return;
//         }





//         int d=mindis(arr,x,y);
//         System.out.println("Minimum distance b/w array is : "+d);


//     }





    
// }


class minDisBew2Num{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array :");
        int d;
        try{
            d= Integer.parseInt(br.readLine());

        }
        catch(Exception e){
            System.out.println("Error occured :");
            return;
        }
        System.out.println("Enter the elements into tha array: ");

        int[] arr = new int[d] ;
        for(int i=0; i<d;i++){
            try{
                arr[i]= Integer.parseInt(br.readLine());
            }
            catch(Exception e){
                System.out.println("An error accured :");
            }


        }
        System.out.println("Enter the two nombers to find the distance bewtween them: ");
        int x,y;
        try{
            x=Integer.parseInt(br.readLine());
            y=Integer.parseInt(br.readLine());

        }
        catch(Exception e){
            System.out.println("Error occured :");
            return ;
        }

        System.out.print("The distance b/w the x and y is : ");






    }
    static int mindis(int [] arr, int x, int y){
        int prev =0;
        int dist=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x||arr[i]==y){
                prev = i;
            }
        }
        for (int i=0; i<arr.length; i++){
            if(arr[i]==x||arr[i]==y){
                if(arr[i]!=arr[prev]&& arr[i-prev] <dist){
                    dist= i-prev;
                    prev=i;
                }
                else{
                    prev=i;
                }
            }
        }

        return dist;


    }
}