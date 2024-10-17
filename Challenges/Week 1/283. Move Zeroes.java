class Solution {
    public void moveZeroes(int[] nums) {
        int idx=0,pt=0;
        while(idx<nums.length){
            if(nums[pt]==0){
                while(idx<nums.length && nums[idx]==0){
                    idx++;
                }
                if(idx!=nums.length){
                    nums[pt]=nums[idx];
                    nums[idx]=0;
                }
            }
            pt++;
            idx++;
        }
    }
}
