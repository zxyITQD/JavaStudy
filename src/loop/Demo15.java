package loop;

import java.util.Arrays;

/**
 * 求两个正序数组的中位数
 */
public class Demo15 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] arr2 = {3, 4};
        System.out.println(findMedianSortedArrays(arr, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        while (n1 < nums1.length && n2 < nums2.length) {
            nums3[n3++] = nums1[n1] < nums2[n2] ? nums1[n1++] : nums2[n2++];
        }
        while (n1 < nums1.length) {
            nums3[n3++] = nums1[n1++];
        }
        while (n2 < nums2.length) {
            nums3[n3++] = nums2[n2++];
        }
        System.out.println(Arrays.toString(nums3));
        int index = nums3.length / 2;
        if (nums3.length % 2 == 0) {
            double res = (nums3[index] + nums3[index - 1]) * 1.0 / 2;
            return res;
        } else {
            double res = nums3[index];
            return res;
        }
    }
}

