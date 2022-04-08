class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        
        int move =len - 1;//알파벳을 전체 이동하는 거리 A가 0번인덱스부터 시작하니깐 -1을 해준다.
        for(int i = 0; i<len; i++) {
        	if(name.charAt(i) > 'N') {
        		answer += 'Z' - name.charAt(i) + 1; // Z를 원래 알파벳 끝숫자 26으로 놓고 뺄셈을 한다
        	}
        	else {
        		answer += name.charAt(i) - 'A'; //A를 1로놓고 계산하면 N번째까지의 계산
        	}
        	int conA = i+1;//다음 인덱스에 중복된 알파벳이 있으면 되돌아가는게 빠른지 확인한다
        	while(conA < len && name.charAt(conA) =='A') {//중복된 A를 만나는 과정을 반복해주고
        		conA++;//A를 추가
        	}
        	move = Math.min(move, i+len-conA+i);//A를 하나로 포함해서 전체 인덱스의 개수가 움직인 개수가된다
        }
        answer+=move;//전체 움직인 개수를 더해주고 리턴해준다
        
        return answer;
    }
}

//참고자료 https://excited-hyun.tistory.com/207