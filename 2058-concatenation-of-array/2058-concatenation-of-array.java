class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
        }
        int j=nums.length;
        for(int i=0; i<nums.length; i++){
            arr[j]=nums[i];
            j++;
        }
        return arr;
    }
}