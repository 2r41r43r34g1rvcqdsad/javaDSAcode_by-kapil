public class Infinite_nos {
        public static void main(String[] args) {
            int[] arr = { 4, 6, 8, 9, 10, 20, 39, 49 };
            int target = 8;
            System.out.println(logic(arr, target));
            
    
        }
        static int logic(int[] arr, int target){   // here is the loggic for the sorting the infoninte loo
            // we will use upword method to solve this
            int start=0;
            int end =1;
            while(target>arr[end]){
                int temp = end+1;  // New start
                end=end+((end-start+1)*2);// new end  end + 2 times of the current array
                start = temp;


            }
            return num(arr, target, start, end);

        }

    
        static int num(int[] arr, int target,int start , int end) {
            
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
    

