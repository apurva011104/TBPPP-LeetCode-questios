class Solution {
    public long minimumSteps(String s) {
        int r=s.length()-1;
        int l=0;
        long count=0;
        long answer=0;
        while(r>=0 && s.charAt(r)!='0')   r--;
        for(int i=r;i>=0;i--){
            if(s.charAt(i)=='0'){
                count++;
            }
            else{
                answer+=count;
            }
        }
        return answer;
    }
}
