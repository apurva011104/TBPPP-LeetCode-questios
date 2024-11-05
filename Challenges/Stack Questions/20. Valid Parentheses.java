class Solution {
    public boolean isValid(String s) {
        Stack<Character> check=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                check.push(s.charAt(i));
            else{
                if(check.isEmpty())
                    return false;
                else if(s.charAt(i)==')' && check.peek()!='(')
                    return false;
                else if(s.charAt(i)=='}' && check.peek()!='{')
                    return false;
                else if(s.charAt(i)==']' && check.peek()!='[')
                    return false;
                else
                    check.pop();
            }
            if(i==s.length()-1 && !check.isEmpty())
                return false;
        }
        return true;
    }
}
