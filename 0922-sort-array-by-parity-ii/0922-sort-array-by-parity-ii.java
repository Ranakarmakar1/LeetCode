class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l=0;
        int r=1;
        int n=nums.length;
        while(l<n&&r<n){
            if(nums[l]%2==0){
                l+=2;
            }
            if(nums[r]%2==1){
                r+=2;
            }else{
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
            }
        }
        return nums;
        
        
    }
}