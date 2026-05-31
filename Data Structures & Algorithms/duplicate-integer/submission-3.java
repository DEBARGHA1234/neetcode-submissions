class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> x = new HashSet<>();

        for (int num : nums) {
            if (!x.add(num)) {
                return true;
            }
        }

        return false;
    }
}