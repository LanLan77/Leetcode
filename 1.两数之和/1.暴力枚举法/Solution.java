import java.util.Arrays;

// 暴力枚举法

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j < nums.length;j++){
                if(nums[i]+nums[j]==target && i != j){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
 

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum(arr, target);
        System.out.print(Arrays.toString(result));
    }
}
