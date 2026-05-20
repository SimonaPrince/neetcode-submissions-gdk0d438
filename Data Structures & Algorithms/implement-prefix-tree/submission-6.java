class PrefixTree {

    PrefixTree[] child;
    boolean endOfWord; 
    public PrefixTree() {
       child = new PrefixTree[26] ;
       for(int i=0;i<26;i++){
        child[i] = null;
       }
       endOfWord = false;

    } 
    public void insert(String word) {
     PrefixTree curr= this; 
      for(int i=0; i < word.length(); i++){
        int idx= word.charAt(i) - 'a';
        if(curr.child[idx] == null){
          curr.child[idx] = new PrefixTree();
        }
        if(i == word.length()-1){
          curr.child[idx].endOfWord= true;
        }
        curr = curr.child[idx];
      }  
    }

    public boolean search(String word) {
      PrefixTree curr= this; 
      for(int i=0; i< word.length(); i++){
        int idx= word.charAt(i) - 'a';
        if(curr.child[idx] == null){
          return false;
        }
        if(i == word.length()-1 && curr.child[idx].endOfWord == false){
          return false;
        }
        curr = curr.child[idx];
      }
      return true;
    }

    public boolean startsWith(String prefix) {
      PrefixTree curr= this; 
      for(int i=0; i< prefix.length(); i++){
        int idx= prefix.charAt(i) - 'a';
        if(curr.child[idx] == null){
          return false;
        }
        curr = curr.child[idx];
      }
      return true;
    }
}
