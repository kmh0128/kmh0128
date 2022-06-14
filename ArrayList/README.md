ArrayList
====

ArrayList란?
----

ArrayList는 자바에서 기본적으로 많이 사용되는 클래스입니다.

ArrayList는 자바의 List 인터페이스를 상속받은 여러 클래스 중 하나입니다.

일반 배열과 동일하게 연속된 메모리 공간을 사용하며 인덱스는 0부터 시작합니다.
![다운로드 (1)](https://user-images.githubusercontent.com/100178951/172609248-ff7257d5-a75f-4f45-93d0-0e851d701767.png)

일반 배열과의 차이점 또한 존재합니다.

배열과의 차이점은 배열이 크기가 고정인 반면 ArrayList는 크기가 가변적으로 변합니다.

내부적으로 저장이 가능한 메모리 용량(Capacity)이 있으며 현재 사용 중인 공간의 크기(Size)가 있습니다.

만약 현재 가용량(Capacity) 이상을 저장하려고 할 때 더 큰 공간의 메모리를 새롭게 할당해주는 기능을 가지고 있습니다.

ArrayList 생성
===========

일반적으로 자바에서 ArrayList 사용하게 되면
 
import java.util.ArrayList;

위와 같은 구문을 선언해줘야됩니다.(ArrayList란 Collection 프레임워크의 일부이며 java.util 패키지에 소속되어 있습니다)

ArrayList<Integer> integers1 = new ArrayList<Integer>(); // 타입 지정 - int 타입으로 지정

ArrayList<Integer> integers2 = new ArrayList<>(); // 타입 생략 가능 
 
ArrayList<Integer> integers3 = new ArrayList<Integer>(10); // 초기 용량 세팅
 
ArrayList<Integer> integers4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)); // 초기 값 세팅

ArrayList<String> strings1 = new ArrayList<String>(); // String 타입 사용
 
ArrayList<Character> char1 = new ArrayList<Character>(); // char 타입 사용 
 
 생성시 위와 같이 new ArrayList의 선언방법의 예시입니다.
 
 보통은 integer형이 많이 쓰이지만 경우에 따라서는 String형과 char형으로도 쓰입니다.
 
ArrayList추가
================
 
 ArrayList의 추가하는 방법은  add() 메서드를 사용하게된다.
 
 1.add(Object) -> ArrayList의 마지막에 데이터를 추가
 
 2.add(int index, Object) : ArrayList의 index에 데이터를 추가합니다.

 ex) 예시
 
![alll-1](https://user-images.githubusercontent.com/100178951/173588817-9eacaedd-4ccf-4ff6-ab51-ee448cb3f196.jpg)

예시의 결과 Hello와 Hello 사이에 world가 출력 되었습니다.
 
ArrayList의값(원소)을 변경
===================
 
 ArrayList의 값을 변경할려면 set()메서드를 사용하게 된다.
 
set()을 사용하기 위해서는 바꾸려면 데이터가 자신의 Index위치를 알아야 변경이 가능하다
set(int index, Object)를 사용

![all-2](https://user-images.githubusercontent.com/100178951/173594211-d85a6c90-0924-4f5a-b6f1-c7c92452f9b1.jpg)

예시 처럼"Hello", 3개에서 가운데것이 Wolrd로 변경 -> "Hello", "World", "Hello"로 값이 변경
 
 ArrayList의 삭제
 =================
 ArrayList 값을 삭제하는 방법에는 remove()와 clear()가 있습니다

 clear()는 ArrayList의 모든 값을 삭제할 때 사용됩니다

 remove()는 값을 하나씩 제거할 때 사용됩니다

 remove()는 두 개의 사용법이 있는데

 remove(Object) : Object를 파라미터로 넘기는 경우 해당 ArrayList의 Object와 같은 값을 삭제합니다

 만약 같은 값이 두 개인 경우 첫 번째 같은 값을 제거합니다

 remove(int index) : ArrayList의 index에 해당하는 값을 삭제합니다.
 
 예시![asfasfas](https://user-images.githubusercontent.com/100178951/173600072-d4381ee4-1a91-4799-be93-b4ce2c8dddf4.jpg)


 


참조 자료 https://psychoria.tistory.com/765

참조 자료 https://crazykim2.tistory.com/558
