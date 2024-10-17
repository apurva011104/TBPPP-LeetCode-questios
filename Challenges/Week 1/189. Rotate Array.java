class Solution {
    public void rotate(int[] nums, int k) {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=nums.length-1;i>=0;i--){
            queue.add(nums[i]);
        }
        k%=nums.length;
        while(k!=0){
            k--;
            queue.add(queue.remove());
        }
        for(int i=nums.length-1;i>=0;i--)
            nums[i]=queue.remove();
    }
}
