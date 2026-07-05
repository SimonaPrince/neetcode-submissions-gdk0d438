class Solution {
    public boolean checkInclusion(String s1, String s2) {
       boolean check=false;
       s1=s1.toUpperCase();
       s2=s2.toUpperCase();
       int[] s1Freq= new int[26];
       int[] s2Freq= new int[26];
       if(s1.length() > s2.length()){
           return false;
       }
       for(int k=0;k<s1.length();k++){
            s1Freq[s1.charAt(k) - 'A']++;
        }
       int i=0;
       int j=0;
       while(j<s2.length()) {
           s2Freq[s2.charAt(j) - 'A']++;
           if (s2.substring(i,j).length() == s1.length() - 1) {
               if (Arrays.equals(s1Freq,s2Freq)) {
                   return true;
               } else {
                   s2Freq[s2.charAt(i) - 'A']--;
                   i++;
               }
           }
           j++;
       }
       return check;
    }
}
