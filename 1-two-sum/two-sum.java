class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int digit = target - nums[i];
            if(map.containsKey(digit)) {
                return new int[]{i, map.get(digit)};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}