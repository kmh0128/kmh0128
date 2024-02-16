#Stack Queue
![Alt text](/path/to![다운로드 (4)](https://user-images.githubusercontent.com/100178951/155239925-2327d206-2d3b-47aa-b3e6-e33a2173dd47.png)
/img.jpg)


##스택의 기본적 정의
 - 스택은 기본적으로 LIFO(Last in First Out)의 구조이다.
 - 이것은 마지막에 들어간것이 첫번째로 나온다는 뜻이며, 예를들면 트럭 짐칸에 물건을 차례대로 4개 넣으면 뺄때는 가장뒤에 있는 짐을 빼는거와 같은 원리입니다.
 - 컴퓨터는 함수를 호출하면 그 기능을 마치면  돌아가야되는데 이때 스택이 돌아가야할 주소를 찾는데 주로 사용됩니다.
 - 이때또한 스택을 더이상 저장 할수없으면 stack overflow가 발생하게되고, 반대로 꺼낼게 없어지면 stack underflow가 발생합니다.
 
 ###스택의 메서드
 - stack의 연산자로 push,pop,size,empty,top
 - push(x):정수 x를 스택에 넣는 연산
 - pop은 가장 위에 있는값을 출력하고 값이 없으면 -1을 출력합니다.
 - size는 스택에 들어있는 정수를 출력합니다.
 - peek은 가장위에 있는 값을 반환할때 사용
 - empty는 스택이 비어있으면 1을 출력 없으면 0을 출력합니다.
 - top은 스택 맨위에 있는 정수를 출력합니다 만약 정수가 없으면 -1을 출력합니다.


##큐(Queue)의 기본적 정의
  
  -큐는 스택과는 다르게 FIFO(First In First Out)의 구조입니다.
  -큐는 먼저들어간것이 먼저 나오는 선입선출의 구조입니다.
  -또한 스택과의 다른점은 Queue자체는 인터페이스라서 스택은 클래스가 있어서 직접 생성이 되지만 Queue는 직접 큐를 구현한 클래스를 사용해야합니다(ex)LinkedList)
  
  ###큐의 메서드
  -add(a) a를 끝부분에 추가합니다.
  -remove() 첫번째항목을 제거합니다.
  -peek() 큐에서 가장 위의 항목을 반환합니다.
  -isempty() 큐가 비어있을때 반환합니다
  -offer()-큐에 객체를 저장 성공시 ture 실패시 false반환
  -poll() 큐에서 객체를 꺼내와서 반환합니다 없으면 null을 대신 반환
  -peek() 요소를 읽어옵니다 없으면 null을 반환
  
  ####참조
   -https://minosaekki.tistory.com/8
   -http://www.tcpschool.com/java/java_collectionFramework_stackQueue
   -https://tychejin.tistory.com/158
