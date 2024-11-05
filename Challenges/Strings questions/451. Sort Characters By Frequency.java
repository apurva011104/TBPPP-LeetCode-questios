class Solution {
    public String frequencySort(String s) {
        int[][]letter=new int[62][2];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                letter[52+s.charAt(i)-'0'][1]++;
                letter[52+s.charAt(i)-'0'][0]=s.charAt(i);
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                letter[s.charAt(i)-'A'][1]++;
                letter[s.charAt(i)-'A'][0]=s.charAt(i);
            }
            else{
                letter[26+s.charAt(i)-'a'][1]++;
                letter[26+s.charAt(i)-'a'][0]=s.charAt(i);
            }
        }
        Arrays.sort(letter,Comparator.comparingInt(a -> a[1]));
        int j=61;
        StringBuilder ans=new StringBuilder();
        while(j>=0 && letter[j][1]!=0){
            for(int i=0;i<letter[j][1];i++){
                ans.append((char)(letter[j][0]));
            }
            j--;
        }
        return ans.toString();
    }
}
