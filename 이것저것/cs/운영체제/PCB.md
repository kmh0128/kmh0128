PCB
===

참조자료
---

https://uiop5809.tistory.com/350#1.%20%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4%EC%99%80%20%EC%8A%A4%EB%A0%88%EB%93%9C%20%E2%AD%90%E2%AD%90%E2%AD%90-1-6

https://junsangkwon.tistory.com/45

PCB란?
---

Process Control Block의 약자이다.

운영체제가 프로세스를 제어하기 위해 프로세스 정보 저장  

프로세스 현재 상태, 프로세스를 나타내는 고유의 PID, 부모 프로세스 PID, 자식 프로세스 PID, 다음 실행할 명령어의 주소 PC(Program Counter), 프로세스 우선순위, 메모리 제한 등을 저장

프로세스의 상태 관리와 문맥 교환(Context Switching)을 위해서 필요합니다.

PCB는 운영체제가 프로세스를 표현한 것입니다.

프로세스가 생성될 때마다 고유의 PCB 가 생성되며, 프로세스가 완료되면 PCB는 제거됩니다.
