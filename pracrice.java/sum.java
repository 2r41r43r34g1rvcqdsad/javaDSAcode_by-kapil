
import java.util.Arrays;
// public class sum {
//     public static void main(String[] args){
//         int sum=0;
//         int[] arr= {1,2,3,4,5,6,7,8};
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
//         }
//          System.out.println(sum);
//     }

import javax.sound.sampled.SourceDataLine;
    
// }

//shorting a numeric array and string array.

// import java.util.Arrays;
// public class sum{
//     public static void main(String[] args){
//         int[] arr= {1,243,534,1342,534,234,3,43,23,4354,234,234};
//         String[] strArray = {"kapil","kjfba","kfha","afkjnd","kapiufkjs"};
//         System.out.println("The sorted int array is : ");
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//         System.out.println("The sorted String is : ");
//         Arrays.sort(strArray);
//         System.out.println(Arrays.toString(strArray));
//         System.out.println(arr[arr.length-1]);

//     }

// }

//program to copy the array by itterating tha array

// public class sum {
//     public static void main(String[] args){
//         int[] arr1={1,534,134,2,43,23,4323,23};
//         int[] arr2= new int[8];
//         System.out.println("source array is :"+ Arrays.toString(arr1));
//         for(int i=0;i<arr1.length;i++){
//             arr2[i]=arr1[i];
//         }
//         System.out.println("The new array is :"+Arrays.toString(arr2));
//     }
    
// }

// public class sum{
//     public static void main(String[] args){
//         int[] arr= {1,57,344,23453,23,32,23};
//         System.out.println("The orignal  array is :"+Arrays.toString(arr));
//         int removeIndex = 3;
//         for(int i = removeIndex;i<arr.length-1;i++){
//             arr[i] = arr[i+1];
//         }
        

//         System.out.println(Arrays.toString(arr));

//     }
// }
    
public class sum {
    public static int findIndex(int[] arr,int target){
    if (arr==null) return -1;
    int i =0;
    while( i<arr.length){
        if (arr[i]==target) return i;
        


    }
    return i-1;
}
    public static void main(String[] args){
        int arr[]= {423,34,1,334,13,123};
        System.out.println("The index is "+ findIndex(arr, 123));
    }

}









