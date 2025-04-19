class Solution {
    public int singleNonDuplicate(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        if(arr.length==1){
            return arr[0];
        }
        if(arr[e]!=arr[e-1]){
            return arr[e];
        }
        if(arr[s]!=arr[s+1]){
            return arr[s];
        }
        while(s<=e){
            int m = s + (e-s)/2;
            if((arr[m]!=arr[m+1]) && (arr[m]!=arr[m-1])){
                return arr[m];
            }
            else if(((arr[m]==arr[m-1]) && (m%2==1)) || ((arr[m]==arr[m+1]) && (m%2==0))){
                s = m+1;
            }else{
                e = m-1;
            }
        }
        return -1;
    }
}