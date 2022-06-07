class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = m; i<nums1.length; i++){//nums1 길이만큼 반복 선언
            nums1[i] = nums2[i - m];//nums1의 상수 m의뒤에 nums2의상수들은 담아준다
        }
        Arrays.sort(nums1);//오름차순 선언
    }
}


//릿코드 문제 https://leetcode.com/problemset/all/?difficulty=EASY&page=1&topicSlugs=graph