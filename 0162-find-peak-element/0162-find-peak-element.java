class Solution {
    public int findPeakElement(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        if (arr.length == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[arr.length - 1] > arr[arr.length - 2]) return arr.length - 1;

        
        s = 1;
        e = arr.length - 2;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
                return m;
            } else if (arr[m] < arr[m + 1]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return -1; 
    }
}
