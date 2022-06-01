class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;//연속되는 1을 카운트
        int max =0;//최대값
        
        for(int n : nums) {
        	if(n==1) {
        		cnt ++;//배열을 돌면서 1이 나오면 카운트
        		if(max < cnt) =cnt;//이전에 1을 카운트한값 max가 이후에 카운트한것보다 적으면 max =count값을 해준다
        	}
        	else cnt = 0;//다른경우 1과 0밖에 없습니까 0으로 카운트 해준다
        }
        
        return max;//맥스값 리턴
    }
}

//문제자료 밑 참고 자료 :https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
