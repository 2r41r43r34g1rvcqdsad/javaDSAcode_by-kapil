package sorting;

import java.util.*;
public class bubbleSort{
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,6,5};
    bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int[] arr){
        for(int i= 0;i<arr.length;i++){
            // for each step, max item willcome at last represntative index
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //temp
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

        }
    }


    }
}