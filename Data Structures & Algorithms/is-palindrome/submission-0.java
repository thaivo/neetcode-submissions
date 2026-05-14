class Solution {
    public boolean isPalindrome(String s) {
        //first solution
        //clean non-alphanumeric characters from the input string
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int l=0,r= cleanString.length()-1 ;l < r; l++, r--){
            if(cleanString.charAt(l) != cleanString.charAt(r)) return false;
        }
        return true;
    }
}