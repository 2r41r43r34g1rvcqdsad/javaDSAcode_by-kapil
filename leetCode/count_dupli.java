public class count_dupli {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3,4,4,1,1};
        int c =0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]!=nums[c]){
                c++;
                nums[c] =nums[i];
            }

        }
    System.out.println(c+1);

        
    }



    
}
