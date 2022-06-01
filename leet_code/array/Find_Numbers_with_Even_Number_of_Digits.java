class Solution {
    public int findNumbers(int[] nums) {
    	int dight = 0;
    	
    	for(int n : nums) {
    		if(Integer.toString(n).length % 2== 0){//정수형을 문자형으로 바꿔서 전체길이가 2로 나누어 떨어지면
    			dight++;//짝수이므로 카운트
    		}
    	}
    	return dight;
    }
}

//릿코드 문제 https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/

//참조 https://jungkeung.tistory.com/112

//처음에 혼자 풀이할때 문장 전체의 길이를 짝수가 아닌 주어진 수안에 짝수가 있는걸로 잘못 이해함
