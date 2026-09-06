class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Lets use two pointers here to iterate quick
        /*
        for(int i = 0; i < nums.length; i++) {
            for(int j = nums.length - 1; j > i; j--){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
        */
        /*
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
        */
        Set<Integer> set  = new HashSet<Integer>();
        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}