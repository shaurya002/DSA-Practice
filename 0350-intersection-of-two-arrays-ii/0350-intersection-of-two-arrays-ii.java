class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<>();
        for(int ele: nums1){
            l1.add(ele);
        }
        List<Integer> l2 = new ArrayList<>();
        for(int ele: nums2){
            if(l1.contains(ele)){
                l2.add(ele);
                l1.remove(Integer.valueOf(ele));
            }
        }

        int [] arr = new int[l2.size()];
        int i=0;
        for(int ele: l2){
            arr[i]=ele;
            i++;
        }
        return arr;
        
    }
}