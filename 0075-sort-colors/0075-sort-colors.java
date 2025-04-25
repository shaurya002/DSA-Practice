class Solution {
    public void sortColors(int[] nums) {
        int cZero = 0;
        int cOne = 0;
        int cTwo = 0;
        for(int i = 0; i < nums.length; i++){  
            if(nums[i] == 0) {
                cZero++;
            } else if(nums[i] == 1) {
                cOne++;
            } else {
                cTwo++;
            }
        }
        int i = 0;
        while(i < nums.length){
            if(i < cZero){
                nums[i] = 0;
            } else if(i < (cZero + cOne)){
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
            i++;
        }
    }
}
