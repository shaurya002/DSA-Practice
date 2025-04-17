/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        int res = 0;
        while(s<=e){
            int m = s + (e-s)/2;
            if(isBadVersion(m)){
                res = m;
                e = m - 1; 
            }else{
                s = m + 1;
            }
        }
        return res;
    }
}