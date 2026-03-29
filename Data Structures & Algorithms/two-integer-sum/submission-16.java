class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null){
                map.put(target - nums[i], i);
            }else{
                return new int[] {map.get(nums[i]), i};
            }
        }
        return null;
        
        // int n = nums.length;

        // if (n < 2) return new int[]{-1};
        
        // for(int i = 0; i < n; i++){
        //     for(int j = i+1; j < n; ){
        //         if (nums[i] + nums[j] != target){
        //             j++;
        //         }else{
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {-1};
    }
}
