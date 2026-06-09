class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> freqmap= new HashMap<>();
        for(String s: strs){
            String freq=getFrequencyString(s);
            freqmap.putIfAbsent(freq, new ArrayList<>());
            freqmap.get(freq).add(s);
       }
        return new ArrayList<>(freqmap.values());
    }
    public static String getFrequencyString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
