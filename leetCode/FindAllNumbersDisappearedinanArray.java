public class FindAllNumbersDisappearedinanArray   {
     List<Integer> findDisappearedNumbers(int[] nums)  {
        
        int i=0;
        while(i<nums.length){
            int correct =arr[i]-1;
            if(nums[i]!=nums[correct]){
            swap(arr,i,correct);}
            else{
                i++;
            }
        }

        // jsut find missing numbars
        List<Integer> ans = new ArrayList<>();
        for(int i =0 ; index<nums.length;index++){
            if(nums[i]!=index+1){
                ans.add(index+1);

            }

        }
        return ans;
        
        
    }
    static void swap(int[] arr,int first, int second){
         int temp=arr[first];
         arr[first]=arr[second];
         arr[second]=temp;
        
    }
    
}
    

