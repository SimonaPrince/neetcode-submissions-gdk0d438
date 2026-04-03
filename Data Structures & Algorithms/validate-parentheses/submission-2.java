class Solution {
    public boolean isValid(String s) {
        char[] c= s.toCharArray();
        Stack<Character> st= new Stack();
        for(int i=0; i< c.length;i++){
            if((c[i] == '{') ||(c[i] == '[' )||( c[i] == '(')){
                st.push(c[i]);
            }
            else if(c[i]=='}' || c[i] ==']' || c[i] == ')'){
                 if (st.isEmpty()){
                     return false;
                 }
                 char top  = st.peek();
                 if( (top != '{' && c[i] == '}' )|| (top != '[' && c[i] == ']') || (top != '(' && c[i] == ')'))
                     return false;
                 st.pop();
            }
        }
        return st.isEmpty();
    }
}
