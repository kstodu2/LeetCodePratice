class Solution {
    public boolean isPalindrome(String s) {
        
        String outPut = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String outPutSecond = "";
        char [] arrayCheck = outPut.toCharArray();  

        for(int i = arrayCheck.length - 1; i >= 0 ; i--){
            outPutSecond += arrayCheck[i];
        }

        if(outPut.equals(outPutSecond)){
            return true;
        }
        else{
            return false;
        }
    }
}