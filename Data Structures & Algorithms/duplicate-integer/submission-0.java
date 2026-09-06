class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Lets use two pointers here to iterate quick
        for(int i = 0; i < nums.length; i++) {
            for(int j = nums.length - 1; j > i; j--){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}