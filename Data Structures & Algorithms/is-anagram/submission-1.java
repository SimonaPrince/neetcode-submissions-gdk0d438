class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(s.length() == t.length()){
            for(int i=0; i< c1.length;i++){
                if(c1[i] != c2[i])
                return false;
            }
        }
        else
           return false;
        return true;
    }
}
