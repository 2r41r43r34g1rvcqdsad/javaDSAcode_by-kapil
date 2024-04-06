public class mountainarray {
    public static void main(String[] args) {
        
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid =  (end + start) / 2;
            if (arr[mid] >arr[mid+1]) {
                // you are in decreasing part of the array
                // this may be the ans
                end = mid;


            } else {
                // you are in increasing part of the array
                start = mid +1; // beacause we know that mid+1 element > mid element
            }

            // int the end === end and ponting to the largest elements in the above 2 chwecks 
            //
        

    }
    return start;
        
    }
}

static int peak(int[] arr){

        int end = arr.length -;
        while (start <= end) {
            int mid =  (end + start) / 2;
            if (arr[mid] >arr[mid+1]) {
                // you are in decreasing part of the array
                // this may be the ans
                end = mid;


            } else {
                // you are in increasing part of the array
                start = mid +1; // beacause we know that mid+1 element > mid element
            }

            // int the end === end and ponting to the largest elements in the above 2 chwecks 
            //
        

    }
    return binary()
        
    }

    static binary(int[] arr, int start,int end , int target){
         static int num(int[] arr, int target) {

        while (start <= end) {
            int mid =  (end + start) / 2;
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
    }