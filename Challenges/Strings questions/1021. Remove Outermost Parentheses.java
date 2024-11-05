class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> sta=new Stack<>();
        int op=1,cl=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='('){
                op++;
            }
            else
                cl++;
            sta.push(s.charAt(i));
            if(op==cl){
                sta.pop();
                cl=0;
                op=1;
                i++;
            }
        }
        String ans="";
        for(char ch: sta)
            ans+=ch;
        return ans;
    }
}
