package Recurison;

import java.util.Arrays;

public class margeSort {
    public static void main(String[] args) {
        int arr[]={9,53,554,34,23};
        System.out.println(Arrays.toString(margeSort(arr)));
        
    }
    static int[] margeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;
        int [] left = margeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right = margeSort(Arrays.copyOfRange(arr,mid,arr.length));


        return merge(left,right);

      

    }
    private static int[] merge(int[] left, int[] right) {
        int [] mix = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){

                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;   // keep pringting the arrays into the mix array.

        }
        /*  if one array terminates and  another array has more element left the we can 
         keep printing the left niumber on that array  */
        
        while(i<left.length){   
            mix[k]=left[i];
            i++;
            k++;
            }
        while(j<left.length){
            mix[k]=right[j];
            j++;
            k++;
            }

            return mix;
        
    
}
}


