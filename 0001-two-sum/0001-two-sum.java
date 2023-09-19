class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> sums = new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            Integer sumIndex = sums.get(nums[i]);
            if(sumIndex != null){
                return new int[]{i, sumIndex};
            }
            sums.put(target - nums[i], i);
        }

    return nums;
    }
}