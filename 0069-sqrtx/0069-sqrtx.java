class Solution {
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        int s = 1;
        int e = x;
        int res = 0;
        while(s<=e){
            int m = s + (e-s)/2;
            long sq = (long) m* m;
            if(sq<=x){
                res = m;
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return res;
    }
}