public class ceiling {
    
        public static void main(String[] args) {
            int[] arr = {2,3,4,14,16,18};
            int target = 15;
            int ans = num(arr, target);
            System.out.println( ans);
    
        }

        // gratest number grater then equals to the target.
    
        static int num(int[] arr, int target) {
            int ans =[-1,-1];
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid =  (end + start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
    
                } else if (target > arr[mid]) {
                    start = mid + 1;
    
                } else {
                    // potential answar

                    return mid;
            }z
            
    
        }
        return ans;


        static int check(int[] arr, int target, boolean che) {
            int ans=-1;
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid =  (end + start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
    
                } else if (target > arr[mid]) {
                    start = mid + 1;
    
                } else {
                    return mid;
                    if(che){
                        end=mid-1;
                    }
                    else{
                        start = mid+1;
                    }
            }
            
    
        }
        return ans;
    
    }
    }
    
    }
    }
    
    

