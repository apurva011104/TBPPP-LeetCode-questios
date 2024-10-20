class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0,right=0;
        int len=0;
        while(right<nums.length){
            if(nums[left]==1){
                while(right<nums.length && nums[right]!=0){
                    right++;
                }
                len=Math.max(right-left,len);
                left=right;
            }
            left++;
            right++;
        }
        return len;
    }
}
