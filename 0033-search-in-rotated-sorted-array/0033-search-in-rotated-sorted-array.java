class Solution {
    public int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==target){
                return m;
            } //left sorted check....
            if(arr[s]<=arr[m]){
                if(target>=arr[s] && target<=arr[m]){
                    e = m - 1;
                }else{
                    s = m+1;
                }
                //if not left sorted then its definately right sorted... 
            }else{
                if(arr[e]>=target && target>=arr[m]){
                    s = m+1;
                }else{
                    e = m-1;
                }
            }
        }
        return -1;
    }
}
