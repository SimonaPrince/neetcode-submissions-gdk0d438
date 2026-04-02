class Solution {
    public int lengthOfLongestSubstring(String s) {
     int left=0;
      int right=0;
      int maxLength=0;
      if(s.length() == 1){
          return 1;
      }
      Hashtable<Character,Integer> hmap= new Hashtable<>();
      while(right<s.length()) {
          if((!hmap.containsKey(s.charAt(right))) ||  hmap.get(s.charAt(right)) < left){
              String temp=s.substring(left,right+1);
              maxLength=Math.max(maxLength,temp.length());
          }
          else {
              if(hmap.get(s.charAt(right)) >= left){
                  left=hmap.get(s.charAt(right)) + 1;
              }
          }
          hmap.put(s.charAt(right),right);
          right++;
      }
      return maxLength;
    }
}
