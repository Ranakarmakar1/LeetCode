class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        
        //check all the value
        for(int num: nums){
            
            if(set.contains(num)){
                return true;
            }
            
            set.add(num);
        }
        return false;
        
    }
}