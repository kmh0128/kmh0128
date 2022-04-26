class Solution {
	int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(0, 0, numbers, target);//dfs함수로 재귀함수를 호출 해준다 
        return answer;
    }
    void dfs(int n, int sum, int[] numbers, int target) {
    	if(n == numbers.length) {//numbers 길이만큼 int n을 반복 n은 인덱스번쨰이고
    		if(sum == target)//int sum이 타겟넘버와 같아질때까지 반복
    			answer++;//카운트 해주고
    		return;//리턴
    	}
    	
    	dfs(n + 1, sum + numbers[n], numbers, target);//인덱스는 계속 뒤로 진행하면서 더해주는 숫자인경우와 -가되는 경우도 있으니깐 두가지를 추가
    	dfs(n + 1, sum - numbers[n], numbers, target);
    }
}

//참고자료 https://coding-grandpa.tistory.com/108
//프로그래머스 문제 https://programmers.co.kr/learn/courses/30/lessons/43165?language=java