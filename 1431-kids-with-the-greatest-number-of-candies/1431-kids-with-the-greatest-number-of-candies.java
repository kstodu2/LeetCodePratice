class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> kidMax = new ArrayList<>();
        int max = 0;
        for(int i = 0; i<candies.length; i++){
            max= Math.max(candies[i],max);
        }
        for(int j = 0; j<candies.length; j++){
            kidMax.add(candies[j] + extraCandies >= max);
        }
        return kidMax;
    }
}