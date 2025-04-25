class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i<n){
            int crctIdx = nums[i];
            if(crctIdx<n && nums[i]!=nums[crctIdx]){
                int temp = nums[i];
                nums[i] = nums[crctIdx];
                nums[crctIdx] = temp;
            }else{
                i++;
            }
        }

        for(int j=0; j<n; j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return n;
    }
}

