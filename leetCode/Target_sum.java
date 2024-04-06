public class Target_sum {
    public static void main(String[] args) {
        int nums[]  = {1,1,1,1,1};
        System.out.println(ans(nums,0,0,3));

    }
    static int ans(int[] nums, int i, int sum, int t){
        // base condition 
        if(i==nums.length){
            if(sum==t)return 1;
            return 0;
        }
        // left
        int pos = ans(nums, i+1, sum+nums[i], t);
        // Right 
        int neg = ans(nums, i+1, sum-nums[i], t);
        
        return pos+neg;
    }
    
}
