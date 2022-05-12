class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;//가로의 길이를 0초기화
        int height = 0;//세로의 길이를 0으로 초기화
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] >= sizes[i][1]) {//앞에 인덱스가 더 크거나 같으면
                width = Math.max(sizes[i][0], width);//가로가 더 큰 인덱스를
                height = Math.max(sizes[i][1], height);//세로가 더 작은 뒤에 인덱스를
            } else {
                width = Math.max(sizes[i][1], width);//반대로 뒤에 인덱스가 더 크면 가로가 더큰 인덱스를
                height = Math.max(sizes[i][0], height);
            }
        }
        
        answer = width * height;//가로 곱하기 세로
        
        return answer;
    }
}

//참고자료 https://discover.tistory.com/47
//프로그래머스 문제 https://programmers.co.kr/learn/courses/30/lessons/86491?language=java