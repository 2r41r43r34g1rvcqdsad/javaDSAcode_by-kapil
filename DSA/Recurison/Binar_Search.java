package Recurison;
// binar search using recursion

public class Binar_Search {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 2;
        int s = 1;
        int e = 6;
        System.out.println(search(arr, target, s, e));

    }
    // static int search(int arr[], int target, int s, int e){
    // if(s>e){
    // return -1;

    // }
    // int m=s+(e-s)/2;
    // if(arr[m]==target){
    // return m;
    // }
    // else if(arr[m]>target){
    // return search(arr, target, s, e-1);

    // }
    // else{
    // return search(arr, target, s+1, e);
    // }
    // }
    static int search(int[] arr, int t, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == t) {
            return m;

        }
        if (arr[m] > t) {
            return search(arr, t, s, m - 1);
        } else {
            return search(arr, t, m + 1, e);
        }

    }
}
