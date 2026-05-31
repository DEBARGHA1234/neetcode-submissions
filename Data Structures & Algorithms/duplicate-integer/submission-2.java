class Solution {
    public boolean hasDuplicate(int[] nums) {
        int x=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<x-1;i++){
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}