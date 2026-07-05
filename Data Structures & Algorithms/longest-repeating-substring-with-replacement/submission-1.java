class Solution {
    public int characterReplacement(String s, int k) {
      int[] hash=new int[26];
      int maxLen=0;
      int i=0;
      int j=0;
      int freq=0;
      int chFreq=0;
      while(j<s.length() && i<=j){
        hash[s.charAt(j) - 'A']++;
        chFreq=Math.max(chFreq,hash[s.charAt(j) - 'A']);
        freq+=1;
        j++;
        if (freq - chFreq > k){
            freq--;
            hash[s.charAt(i) - 'A']--;
            i++;
        }
        maxLen=Math.max(freq,maxLen);
      }
      return maxLen;
    }
}
