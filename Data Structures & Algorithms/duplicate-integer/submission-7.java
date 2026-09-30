class Solution {
    public boolean hasDuplicate(int[] nums) {
        int[] arr = new int[256];
        Arrays.fill(arr,-1);

        for(int i : nums){
            char c = (char)i;
            if(arr[c] == -1){
                arr[c] = i + 1;
            }else{
                return true;
            }
             
        }
        return false;


        // HashMap <Integer, Integer> ele = new HashMap<>();
        // if(nums.length < 2 || nums == null){
        //     return false;
        // }

        // for(int val : nums){
        //     if(ele.put(val,-1) != null){
        //         return true;
        //     }
        // }
        // return false;
    }
}