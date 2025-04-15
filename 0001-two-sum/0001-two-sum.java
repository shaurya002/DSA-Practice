class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                int j = map.get(req);
                return new int[] {i, j};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}