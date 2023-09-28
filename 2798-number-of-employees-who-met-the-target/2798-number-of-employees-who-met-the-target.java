class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int goal = 0;

        for(int hour: hours){
            if(hour >= target){
                goal++;
            }
        }
        return goal;
    }
}