class Solution {
    public int search(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        System.out.println(index);
        return index >= 0 ? index : -1;
    }
}