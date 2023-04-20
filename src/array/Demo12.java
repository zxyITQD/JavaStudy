package array;

public class Demo12 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        String str = "[";
        int[] arr2 = twoSum(nums, target);
        for (int i = 0; i < arr2.length; i++) {
            str += arr2[i];
            if (i < arr2.length - 1) {
                str += ",";
            }
        }
        str += "]";
        System.out.println(str);
    }

    public static int[] twoSum(int[] nums, int target) {
        System.out.println(-2 + 3);
        int[] arr = new int[2];
        if (nums == null || nums.length < 2) {
            System.out.println("您输入的数据不合法!");
            return null;
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
            }


        }
        return arr;
    }
//    class Solution {
//        public int[] twoSum(int[] nums, int target) {
//            if(nums == null || nums.length < 2) {
//                return new int[] {};
//            }
//            Map<Integer, Integer> map = new HashMap<>();
//            int left = 0;
//            int right = nums.length - 1;
//            while(left <= right) {
//                int ln0 = nums[left];
//                int rn0 = nums[right];
//                int ln1 = target - ln0;
//                int rn1 = target - rn0;
//                if(map.containsKey(ln1)) {
//                    return new int[] {left, map.get(ln1)};
//                }
//                else {
//                    map.put(ln0, left++);
//                }
//                if(map.containsKey(rn1)) {
//                    return new int[] {right, map.get(rn1)};
//                }
//                else {
//                    map.put(rn0, right--);
//                }
//            }
//            return new int[] {};
//        }
//    }
}
