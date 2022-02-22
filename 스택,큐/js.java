public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {//i부터 금액 전부를 반복한다
            for (int j = i + 1; j < prices.length; j++) {//변화된 금액과 비교를 하기 위해 +1
            	answer[i]++;//카운트 해주는 입력을 if문 후에 입력해줘서 오류가 났는데 참고자료보고수정
            	if (prices[i] > prices[j])//만약 i번째가 j보다 크면 가격이 떨어진 구간이브로 break
                    break;
                
            }
        }
        return answer;
    }
}


//프로그래머스 문제:https://programmers.co.kr/learn/courses/30/lessons/42584?language=java
//참고자료:https://velog.io/@hong-brother/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%A3%BC%EC%8B%9D%EA%B0%80%EA%B2%A9java-%EA%B3%A0%EB%93%9D%EC%A0%90-kit