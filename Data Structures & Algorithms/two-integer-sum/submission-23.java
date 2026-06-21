class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) return new int[]{nums[0]};

        Map<Integer, Integer> sheet = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(sheet.get(nums[i]) == null){
                sheet.put(target - nums[i], i);
            }else{
                return new int[] { sheet.get(nums[i]), i };
            }
        } return null;
    }
}  //7-3 = 4 {4,0}, next: 4 already in sheet with index 0 so it would return 0 with curr index of 4 = {0,1}
