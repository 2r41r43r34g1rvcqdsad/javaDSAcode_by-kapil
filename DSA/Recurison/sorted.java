package Recurison;

import java.io.*;

public class sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 43, 4, 5, 6, 7, 9 };
        System.out.println(helper(arr, 0));

    }

    static boolean helper(int[] arr, int index) {
        // if(index==arr.length-1){
        // return true;
        // }
        // return arr[index]<arr[index+1]&& helper(arr,index+1);
        // }

        if(index==arr.length-1){
            return true;

        }
        return arr[index]<arr[index+1]&& helper(arr, index+1);

    }
}
