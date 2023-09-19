class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] fStringArray = s.toCharArray();
        char[] sStringArray = t.toCharArray();

        Arrays.sort(fStringArray);
        Arrays.sort(sStringArray);

        return Arrays.equals(fStringArray, sStringArray);

        

    }
}