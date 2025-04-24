class Solution {
    public boolean containsDuplicate(int[] arr) {
        java.util.Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            int j=i+1;
            if(arr[i]==arr[j]){
                return true;
            }
        }
        return false;
    }
}