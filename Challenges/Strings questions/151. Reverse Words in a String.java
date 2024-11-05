class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        Stack<String> words=new Stack<>();
        int i=0, j=0;
        while(i!=s.length() && j!=s.length()){
            if(s.charAt(j)==' '){
                i=j;
                i++;
                j++;
            }
            else {
                if(j<s.length()-1 && s.charAt(j+1)==' ')
                    words.push(s.substring(i,j+1));
                j++;
            }
        }
        words.push(s.substring(i,j));
        StringBuilder ans=new StringBuilder();
        while(!words.isEmpty())
            ans.append(words.pop()+" ");
        return ans.toString().substring(0,ans.length()-1);
    }
}
