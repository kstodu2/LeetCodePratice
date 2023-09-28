class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer,Integer> hashMap = new HashMap();
        int pairs = 0;

        for(int num: nums){
            if(hashMap.containsKey(num)){
                pairs += hashMap.get(num);
            }
            hashMap.put(num, hashMap.getOrDefault(num, 0) +1);
        }
        return pairs;
    }
}