class Solution {
    public boolean isPalindrome(String s) {
        char[] cstr=s.toLowerCase().replaceAll("[^A-Za-z0-9]","").toCharArray();
        int i=0;
        int j=cstr.length-1;
        while(i<=j){
            if(cstr[i]!= cstr[j]){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
