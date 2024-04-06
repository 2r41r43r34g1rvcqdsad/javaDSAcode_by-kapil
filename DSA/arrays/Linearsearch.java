import java.util.*;

public class Linearsearch {
    // public static void main(String[] args) {
    // int arr[]= {1,2,3,4,5,6,7,8};
    // int target = 4;
    // int u= linearSeacrch(arr, target);
    // System.out.println(u);
    // }

    // static int linearSeacrch(int arr[], int target){
    // if(arr.length==0){
    // return -1;
    // }
    // // way 1st.

    // for(int i=0; i<arr.length; i++){
    // int element= arr[i];
    // if(element==target){
    // // return i; // case 1;
    // return element;// case 2;
    // }
    // }
    // return -1;
    // }

    /* 2d array search */

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4, 5, 6 },
                { 7, 5, 9, 756, 42 },
                { 74, 43 },
                { 897, 432, 645 }
        };
        int target = 5;
        int ans[] = dArraySearch(arr, target);
        System.out.println("The indexes of the arrays are : "+Arrays.toString(ans));
        int pns = Max(arr);
        System.out.println("The maximum and minmum value is : "+ pns);
        
    }

    static int[] dArraySearch(int arr[][], int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }

            }

        }

        return new int[] { -1, -1 };

    }

    // max and min values

    static int Max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        for (int[] row : arr) {

            for (int col : row) {
                if (col > max) {
                    max = col;
                }
                if(col<min){
                    min=col;
                }

            }

        }

        //return max;
        return min;

    }

}