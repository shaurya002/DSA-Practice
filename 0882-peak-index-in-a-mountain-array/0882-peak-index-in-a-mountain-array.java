class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 1;
        int e = arr.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if((arr[m]>arr[m-1]) && (arr[m+1]<arr[m])){
                return m;
            }else if((arr[m-1]<arr[m]) && (arr[m+1]>arr[m])){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;
    }
}