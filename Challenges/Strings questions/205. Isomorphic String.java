class Solution{
    public static boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        boolean letter[]=new boolean[256];
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(t.charAt(i)!=map.get(s.charAt(i))){
                    return false;
                }
            }
            else{
                if(letter[t.charAt(i)-0]){
                    return false;
                }
                else{
                    letter[t.charAt(i)-0]=true;
                    map.put(s.charAt(i),t.charAt(i));
                }
            }
        }
        return true;
    }
}
