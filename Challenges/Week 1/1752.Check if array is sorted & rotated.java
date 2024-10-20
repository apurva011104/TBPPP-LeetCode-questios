class Solution {
    public boolean check(int[] nums) {
        boolean flag=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                if(!flag)   return false;
                flag=false;
            }
        }
        if(nums[0]<nums[nums.length-1] && !flag)    return false;
        return true;
    }
}
