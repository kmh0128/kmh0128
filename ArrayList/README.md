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



참조 자료 https://psychoria.tistory.com/765

참조 자료 https://crazykim2.tistory.com/558
