class Solution {
    public boolean canSortArray(int[] nums) {
        for(int i = 0 ; i <nums.length-1 ; i++){
    for(int j = 0 ; j< nums.length -1-i ; j++){
        if(nums[j]<nums[j+1]){
         continue;
        }
               else{
         if(Integer.bitCount(nums[j])==Integer.bitCount(nums[j+1])){
            if (nums[j] > nums[j + 1]) {
                      int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
         }   
         else{
            return false;
         }
         }
    }
 }
 return true;
    }
}