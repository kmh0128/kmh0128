class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1;//x의 인덱스 배열 선언
        int y = n - 1;//y의 인덱스 배열 선언
        int z = m + n - 1;//두개의 포인터를 전부 담을 z 의 배열 선언
        while(y >= 0) {//while문 y가0보다 크거나 같고
        	if(x >= 0 && nums1[x] >= nums2[y]) {//x의 배열이 더 클경우
        		nums1[z--] = nums1[x--];//z배열 담아주고 배열을 하나 줄여준다
        	}
        	else {nums1[z--] = nums2[y--];//y가 더 클경우는 y를 담아주고 배열을 줄여준다
        	}
        }
    }
}

// 참조자료 https://leetcode.com/problems/merge-sorted-array/discuss/1189409/My-Java-Solution
// 비슷한 풀이 참조 https://sanghoo.tistory.com/24?category=1035633
// 릿코드 문제 https://leetcode.com/problems/merge-sorted-array/submissions/