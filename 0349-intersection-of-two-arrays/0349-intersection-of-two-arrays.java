class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int ele: nums1){
            set1.add(ele);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int ele: nums2){
            if(set1.contains(ele)){
                set2.add(ele);
                set1.remove(ele);
            }
        }
        int [] res = new int[set2.size()];
        int i =0;
        for(int ele: set2){
            res[i] = ele;
            i++;
        }
        return res;
    }
}