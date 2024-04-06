package Recurison;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int arr[] = {48, 44, 86};
       
        bb(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void bb(int[] arr, int s, int l) {
        if (l == 0) {
            return;
        }
        if (s < l) {
            if (arr[s] < arr[s + 1]) {
                int temp = arr[s];
                arr[s] = arr[s + 1];
                arr[s + 1] = temp;
            }
            bb(arr, s + 1, l);
        } else {
            bb(arr, 0, l - 1);
        }
    } 
}
