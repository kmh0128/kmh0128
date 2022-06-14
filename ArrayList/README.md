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





참조 자료 https://psychoria.tistory.com/765

참조 자료 https://crazykim2.tistory.com/558
