class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int i =0; i < accounts.length; i++ ){
            int currentMax = 0;
            for(int j = 0; j < accounts[i].length; j++){
                currentMax+=accounts[i][j];
            }
            max = Math.max(currentMax,max);
        }
        return max;
    }
    
}