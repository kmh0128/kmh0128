import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            nums[i] = (int) Math.pow(nums[i], 2);//제곱을 2해준다
        }
        Arrays.sort(nums);//오름차순 정렬해준다
        
        return nums;
    }
}

//제곱근 참조 자료 https://codechacha.com/ko/java-math-pow/

//릿코드 문제 https://leetcode.com/problems/squares-of-a-sorted-array/