class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int crctIdx = nums[i]-1;
            if(nums[crctIdx]!=nums[i]){
                swap(nums, crctIdx, i);
            }else{
                i++;
            }
        }

        int missingNumber = 0;
        int duplicateNumber = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                missingNumber = j+1;
                duplicateNumber = nums[j];
                break;
            }
        }
        return new int[]{duplicateNumber, missingNumber};

    }

    public void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}