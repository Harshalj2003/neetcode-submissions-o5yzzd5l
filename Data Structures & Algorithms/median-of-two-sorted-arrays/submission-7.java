class Solution {
    // use binary search, find an index where:
    // 1. every number on the left <= every numbers on the right
    // 2. amount of numbers on the left = amount of numbers on the right or one more

    // nums1: [1, 3 | 5, 7]
    // nums2: [2, 4 | 6, 7, 8]
    // [1, 2, 3, 4 | 5, 6, 7, 7, 8]

    // nums1: [..., A | B, ...]
    // nums2: [..., C | D, ...]

    // valid: A ≤ D and C ≤ B

    // if A > D → nums1 is cut too far right → high = i - 1
    // if C > B → nums1 is cut too far left → low = i + 1

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1); // making sure nums1 is the shorter one
        }

        int m = nums1.length, n = nums2.length;
        int total = m + n;
        int half = total / 2;

        int low = 0, high = m;

        while (true) {
            int i = (low + high) / 2; // cut for nums1
            int j = half - i; // cut for nums2

            // handling boundaries
            int nums1left = i > 0 ? nums1[i - 1] : Integer.MIN_VALUE;
            int nums1right = i < m ? nums1[i] : Integer.MAX_VALUE;
            int nums2left = j > 0 ? nums2[j - 1] : Integer.MIN_VALUE;
            int nums2right = j < n ? nums2[j] : Integer.MAX_VALUE;

            if (nums1left <= nums2right && nums2left <= nums1right) {
                // if odd
                if (total % 2 == 1) {
                    return Math.min(nums1right, nums2right);
                    // if even
                } else {
                    return (Math.max(nums1left, nums2left) + Math.min(nums1right, nums2right))
                        / 2.0;
                }
                // cut is too far right on nums1
            } else if (nums1left > nums2right) {
                high = i - 1;
                // cut is too far left on nums1
            } else {
                low = i + 1;
            }
        }
    }
}
