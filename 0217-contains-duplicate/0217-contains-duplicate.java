class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if (nums.length <= 1){
            return false;
        }
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num: nums){
            if(duplicates.contains(num)){
                return true;
            }
            duplicates.add(num);
        }
        return false;
    }
}