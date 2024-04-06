public class bianarySearch {
    public static void main(String[] args) {
        int[] arr = { -4, -2, 4, 6, 8, 9, 10, 20, 39, 49 };
        int target = 9;
        // int ans = bs(arr, target);
        // System.out.println(ans);
        bin(arr, target, 0, arr.length-1);

    }

    static int num(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }

        }
        return -1;

    }

    // binary search using normal method
    static int bs(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }


    // binary search using recursion
    static void bin(int arr[], int target, int s, int e){
        if(s>e){
            return ;
        }
        int mid= s+(e-s)/2;
        if(arr[mid]==target){
            System.out.println(mid);
        }
        else if(arr[mid]<target){
             bin(arr, target,mid+1,e);
             
        }
        else{
             bin(arr, target, s, mid-1);
        }
        
    }
}