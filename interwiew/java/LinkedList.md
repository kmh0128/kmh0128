 LinkedList
 ====
 
 LinkedList는 ArrayList와 함께 List를 구체화한 클래스입니다.
 
  LinkedList는 각각의 노드를 연결하는 방식을 사용합니다.
 
 ![다운로드 (8)](https://user-images.githubusercontent.com/100178951/216823826-bba5aebd-4ae3-49b7-8b67-6ef2ca7f8598.png)


LinkedList는 양방향 연결 리스트(Doubly Linked List)로 구현되어 있습니다.

각각의 데이터가 노드(Node)로 구성되어 연결이 되는 구조입니다.

각각의 노드는 데이터와 함께 next(다음 노드)와 prev(이전 노드) 값을 내부적으로 가지고 있습니다.

일반적으로 LinkedList의 장점은 데이터를 추가하거나 삭제하는 것이 원활하다는 점입니다.

어느 위치에서든 추가나 삭제를 할 경우 변경되는 노드만 다시 연결해주면 됩니다.

그래서 주로 ArrayList는 검색이 많은 경우에 사용하고 LinkedList는 잦은 삽입/삭제 시 사용합니다.
 
 
 public class LinkedList<N> {
      // 첫번째 노드를 가리키는 필드
      private Node head;
      private Node tail;
      private int size = 0;

      private class Node{
          // 데이터가 저장될 필드
          private Object data;
          // 다음 노드를 가리키는 필드
          private Node next;
          public Node(Object input) {
              this.data = input;
              this.next = null;
          }
          // 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능
          public String toString(){
              return String.valueOf(this.data);
          }
      }

참조 주소 https://ltk3934.tistory.com/84
  
  https://psychoria.tistory.com/767
