class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int left = -1;
        int right = -1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m]==target){
                if (m == 0 || nums[m - 1] != target) {
                    left = m;
                } else {
                    left = leftBinarySearch(nums, s, m - 1, target);
                }
                if (m == nums.length - 1 || nums[m + 1] != target) {
                    right = m;
                } else {
                    right = rightBinarySearch(nums, m + 1, e, target);
                }
                break;

            }else if(nums[m]<target){
                s = m+1;
            }else{
                e = m -1;
            }
        }
        return new int[] {left, right};  
    }

    public int leftBinarySearch(int[]arr,int s, int e, int target){
        while(s<=e){
            int m = s +(e-s)/2;
            if(arr[m]==target){
                if (m == 0 || arr[m - 1] != target) {
                    return m;
                }else{
                    e = m - 1;
                }
            }else if(arr[m]>target){
                e = m - 1;
            }else{
                s = m +1;
            }
        }
        return -1;

    }

    public int rightBinarySearch(int[]arr,int s, int e, int target){
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m]==target){
                if (m == arr.length - 1 || arr[m + 1] != target) {
                    return m;
                }else{
                    s = m+1;
                }
            }else if(arr[m]>target){
                e = m - 1;
            }else{
                s = m +1;
            }
        }
        return -1;

    }

}
