class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) return new int[]{-1};

        Map<Integer, Integer> sheet = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(sheet.get(nums[i]) == null){
                sheet.put(target - nums[i], i);
            }else{
                return new int[] { sheet.get(nums[i]), i };
            }
        }return null;
    }
}
