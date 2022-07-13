스프링부트 JPA란
======

>JPA란

현대 웹 어플리케이션에서 RDB(Relational Database, 관계형 데이터베이스) 는 필수적인 요소가 되었습니다. 
관계형 데이터베이스는 SQL 만 인식할 수 있기 때문에 SQL 은 필수적입니다. 하지만 객체지향 프로그래밍과 순수 SQL 이 만나면 패러다임 불일치 가 일어납니다.
RDB는 어떻게 데이터를 저장할지에 초점이 맞춰진 기술입니다.
객체지향 프로그래밍은 메시지를 기반으로 기능과 속성을 한곳에서 관리 하는 기술 입니다.

>코드예제
>   > 아래의 코드를 보면

User user = findUser();

Group group = user.getGroup();


코드는 객체지향 프로그래밍에서 부모 객체(User) 가 객체가 되는 객체(Group)를 가져오는 코드입니다.

누구나 명확하게 User가 본인이 속한 Group 을 가져오는 코드라는 걸 알 수 있습니다. 

하지만 DB가 추가되면 다음과 같이 변경 됩니다.

User user = userDao.findUser();

Group group = groupDao.findGroup(user.getGroupId());

User 따로, Group 따로 조회하게 됩니다. 즉, User 와 Group 이 어떤 관계를 맺고 있는지 알기 힘듭니다. 상속, 1:N 등 다양한 객체 모델링을 DB로는 구현할 수 없습니다.

이 패러다임 불일치 해결하기 위해(즉 DB가 추가되어도 객체 지향적인 프로그래밍이 가능할 수 있게) JPA 가 등장합니다.

JPA 를 사용함으로써 개발자는 객체지향적으로 프로그래밍을 하고, JPA 가 이를 데이터베이스에 맞게 SQL을 대신 생성해서 실행합니다.

Spring Data JPA
=====

JPA는 인터페이스로서 역할은 자바 표준명세서입니다.

대표적인 구현체로는 Hibernate, Eclipse Link 등이 있습니다.

 하지만 Spring 에서 JPA를 사용할 때 이 구현체를 사용하지 않고 Spring Data JPA 라는 구현체들을 더 쉽게 사용할 수 있게 추상화 시킨 모듈을 사용하여 JPA 를 다룹니다.
 
 JPA <- Hibernate <- Spring Data JPA

Hibernate와 Spring Data JPA는 큰 차이는 없지만 아래와 같은 이유로 등장했다고 볼수 있다.

-구현체 교체의 용이성
-저장소 교체의 용이성

1) 구현체 교체의 용이성

Hibernate 외에 다른 구현체로 쉽게 교체하기 위함이다. Hibernate가 언젠간 수명을 다해서 새로운 JPA 구현체가 대세로 떠오를때 Spring Data JPA를 쓰고 있다면 

매우 쉽게 교체 가능-> Spring Data JPA 내부에서 구현체 매핑을 지원해 주기 때문이다.

2) 저장소 교체의 용이성

1.RDB 외에 다른 저장소로 쉽게 교체하기 위함입니다.

2.추가적인 설명을 하자면 만약 트래픽이 너무 많아져 RDB 로 감당이 안되면 MongoDB와 같은 DB로 쉽게 교체할 수 있습니다.

(Spring Data JPA 에서 Spring Data MongoDB 로 의존성만 교체하면 됩니다.)

3.Spring Data의 하위 프로젝트는 기본적으로 CRUD의 인터페이스와 같기때문에

Spring Data JPA, Spring Data Redis, Spring Data MongoDB등으로 교체되어도 기본적인 기능은 변경할 것이 없다.



CRUD란
======
CRUD는 대부분의 컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능인 Create(생성), Read(읽기), Update(갱신), Delete(삭제)를 묶어서 일컫는 말이다. 

사용자 인터페이스가 갖추어야 할 기능(정보의 참조/검색/갱신)을 가리키는 용어로서도 사용된다.

참고 자료 ->https://ko.wikipedia.org/wiki/CRUD
RDB
====
RDB(Relational Database)란 관계형 데이타 모델에 기초를 둔 데이타베이스입니다. 

관계형 데이타 모델이란 데이타를 구성하는데 필요한 방법 중 하나로 모든 데이타를 2차원의 테이블 형태로 표현해줍니다. 

관계형 데이타 모델의 개념은 표현 개체의 외부개념 관례를 적용한 것으로, 데이타 간의 상관관계에서 개체간의 관계를 표현한 것이라고 할 수 있습니다.

RDB는 데이타의 독립성이 높고, 고수준의 데이타 조작언어(DML-Data Manipulation Language)을 사용하여 결합, 제약, 투영 등의 관계 조작에 의해 비약적으로 표현능력을 높일 수 있습니다. 

또한 이들의 관계 조작에 의해 자유롭게 구조를 변경할 수 있다는 것이 RDB의 특징입니다.

참고 자료: https://jwprogramming.tistory.com/52 



실무에서 JPA

JPA 를 사용하면 부모-자식 관계 표현, 1:N 관계표현, 상태와 행위를 한곳에서 관리하는 등 객체지향형 프로그래밍을 할 수 있습니다.

속도 이슈에 대해 걱정은 하지 않아도 됩니다. 잘 활용하면 Native Query 만큼의 속도를 낼 수 있습니다.



 
