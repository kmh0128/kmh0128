완전탐색( (Exhaustive Search)
=======

-모든 경우의 수를 시도해 보는 방법
 --Exhaustive search, Brute force
-상대적으로 구현이 간단하면서 해가 존재한다면 항상 찾게된다.
-경우의 수에 따라 실행시간이 비례하기 때문에 입력의 값이 적은 값을 찾을때 유용합니다.
 --입력의 값이 커지면 찾아야 하는 값이 증가하기 때문에 시간이 오래걸린다.
-종류
브루트 포스 : for문을 이용하여 처음부터 끝까지 탐색하는 방법
비트 마스크 : 이진수 표현을 자료구조로 쓰는 기법 (AND, OR, XOR, SHIFT, NOT)
백트래킹 : 분할정복을 이용한 기법, 재귀함수를 이용, 해를 찾아가는 도중에 해가 될 것 같지 않은 경로가 있다면 더 이상 가지 않고 되돌아간다.
재귀함수 : 함수 내에서 함수 자기 자신을 계속해서 호출하는 것
순열 : 서로 다른 n개의 원소에서 r개의 중복을 허용하지 않고 순서대로 늘어 놓은 수
BFS(너비 우선 탐색)
DFS(깊이 우선 탐색)
 
 
 브루트포스(brute force)
 =======
 Brute:짐승,동물 Force: 힘  난폭한 힘 이런 뜻이며, 모든 경우의 수를 완전 탐색으로 구하는 알고리즘이다.
 구하는 방법으로는 for문을 이용한 탐색 재귀 함수를 이용한 탐색이 존재합니다.
 ![img](https://user-images.githubusercontent.com/100178951/159477474-2d8f7ef9-aed4-4294-9bbf-56c83757822f.gif)
 브루트 포스도 완전탐색 알고리즘이기때문에 전체를 탐색하는 알고리즘이므로 해가 많을수록 효율적인 알고리즘은 아닙니다
 사용되는 기법은 단순히 for문과 if문 등으로 모든 경우의수를 구한다
 재귀함수
 =======
 
 함수가 직접적으로 or 간접적으로 자기자신의 호출하는 함수를 재귀 함수라고 합니다.
 반복문과 마찬가지로 종료지점을 생각하지않고 구현하면 스택오버플로우가 일어날수있다
 
 비트마스크(Bitmask)
 ========
 2진수를 이용하는 컴퓨터의 연산방법을 이용한 방식이다.
 완전탐색부분에서는 각각의 원소가 포함되거나, 포함되지 않는 두 가지 선택으로 구성되는 경우에 유용하게 사용이 가능하다
![다운로드 (4)](https://user-images.githubusercontent.com/100178951/159893814-48bf0f44-3e42-403c-a6fa-816e8d17d0ae.png)

출처: https://rebro.kr/59 [Rebro의 코딩 일기장]
 참고 자료 https://cano721.tistory.com/64
 https://developmentnotepad.tistory.com/entry/Algorithm-%EC%99%84%EC%A0%84%ED%83%90%EC%83%89-%EB%B8%8C%EB%A3%A8%ED%8A%B8-%ED%8F%AC%EC%8A%A4-Exhaustive-Search
 https://rebro.kr/59
 https://crazykim2.tistory.com/591
 https://jeonggi.tistory.com/entry/JAVA-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%A4%80%EB%B9%84%ED%95%98%EA%B8%B0-%EC%99%84%EC%A0%84-%ED%83%90%EC%83%89
