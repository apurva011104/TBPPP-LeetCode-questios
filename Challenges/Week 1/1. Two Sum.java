class Solution {
    public static int [] twoSum(int[]arr, int target){
        int []ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{i,map.get(target-arr[i])};
            }
            else
                map.put(arr[i],i);
        }
        return ans;
    }
}
