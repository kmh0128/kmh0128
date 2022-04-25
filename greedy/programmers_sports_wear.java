import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> rs = new HashSet<>();//reserve로 HashSet을 선언
        HashSet<Integer> ls = new HashSet<>();//lostfh HashSet을 선언 
        
        for(int i : reserve) 
        	rs.add(i);//체육복을 잃어버리지않은 사람은 rs 해쉬셋에 추가
        for(int i : lost) {
        	if(rs.contains(i)) //체육복을 잃어 버린 사람을 ls해쉬셋에 추가 
        		rs.remove(i);//이때 여벌 체육복을 가진사람이 잃어버렸으면 rs 해쉬셋에서 삭제
        	else
        		ls.add(i)//그리고 ls에 추가해준다
        }
        for(int i : reserve) {
        	if(ls.contains(i-1))//여벌을 가지고 있는 사람이 앞에 사람이 체육복 없는지 확인
        		ls.remove(i-1);//빌려줬으면 체육복을 도난당한 케이스에서 제거
        	else if(ls.contains(i+1))//여벌을 가지고있는 사람이 뒤에있는지 확인 앞에 없을때
        		ls.remove(i+1);//빌려주고 제거
        }
        return n - ls.size();//전체학생에서 잃어버린 사람들을 빼준다 반복해주고 종료
    }
}

//프로그래머스 주소 https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
//참고자료 https://coding-grandpa.tistory.com/99