public class searchRotated{ 
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        
        System.out.println(findPovit(arr));
    }

int search(int[] nums, int target) {
    

        int pivot = findPovit(nums);
        if(pivot==-1){
            // for for simple binary search
            return binary(nums,target,0,nums.length-1 );

        }
        // If we found the pivot
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>nums[0]){      
            // If the start<target element ignore the part after the pivot;
            return binary(nums,target,0,pivot-1);
        }
        else{
            //if start>target ignore the part before the pivot
            return binary(nums,target,pivot+1,nums.length-1);  
        }
        
    }
    //apply normal binray search for searhing he target element
    int  binary(int[] arr, int target,int start , int end ){
          

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
    // find the pivot by applying these cases
     int findPovit(int[] nums ){
       int s = 0;
       int e = nums.length-1;
       while(s<=e){
           int mid=s+(e-s)/2;

           if(mid<=e&&nums[mid]>nums[mid+1]){
               return mid;
           }
           if(mid>=s && nums[mid]<nums[mid-1]){
               return mid-1;
           }
           if(nums[s]>=nums[mid]){
               e=mid-1;
           }
           else{
               s=mid+1;

           }
       }
    return -1;
        
    }
}

