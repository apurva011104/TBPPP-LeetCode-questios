class Solution {
    public int singleNumber(int[] arr) {
        int xor=arr[0];
        for(int i=1;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
    }
}
