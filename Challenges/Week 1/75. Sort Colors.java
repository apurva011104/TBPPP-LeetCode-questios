class Solution {
    public void sortColors(int[] nums) {
        int arr[]=new int[3];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=1;
        }
        int id=0;

        for(int i=0;i<nums.length;i++){
            if(arr[id]==0){
                id++;
                i--;
            }
            else{
                nums[i]=id;
                arr[id]--;
            }
        }
    }
}
