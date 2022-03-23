class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];//행과 열 2개라서?
        
        int area = brown + yellow;//전체 타일의 개수
        
      //행과수는 3이상이여야 합니다.
        //행은 최소 열이랑 같아야 된다
        for(int i =3; i<=area; i++) {
        	int col = i; //열
        	int row = area / col;//행
        	
        	if(row<3) {//행은 문제 보기에서 3개 미만일경우는 없엇음
        		continue;
        	}
        	
        	if(row>=col) {//행은 열보다 크거나 같고
        		
        		if((row -2 )*(col -2) == yellow) {//노란색 타일의 개수 구하기
        			answer[0] = row;
                    answer[1] = col;
                    return answer;
        		}
        	}
        }
 
        return answer;
    }
}

//참조 자료 https://hak0205.tistory.com/145
// 프로그래머스 문제 https://programmers.co.kr/learn/courses/30/lessons/42842?language=java