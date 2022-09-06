class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		 int j = 0; // m 인덱스 부터 nums2의 값을 j를 0으로 놓고  순서대로 추가해준뒤에 정렬
		for(int i = m; i<nums1.length;i++) {
			nums1[i] = nums2[j];
			j++;
		}
		Arrays.sort(nums1);
	 }
}

//문제: https://leetcode.com/problems/merge-sorted-array/
//참고:https://leetcode.com/problems/merge-sorted-array/discuss/2509371/Merge-Sorted-Array
