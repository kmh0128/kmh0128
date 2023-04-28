Entity(엔티티)
===

JPA에서 엔티티란 쉽게 생각하면, DB 테이블에 대응하는 하나의 클래스라고 생각할 수 있습니다.

 @Entity가 붙은 클래스는 JPA가 관리해주며, JPA를 사용해서 DB 테이블과 매핑할 클래스는 @Entity를 꼭 붙여야만 매핑이 가능합니다.

 @Entity를 사용할 때는 몇가지 주의사항이 있습니다. 
 
 domain package

실제 DB의 테이블과 매칭될 클래스

즉, 테이블과 링크될 클래스임을 나타낸다.

Entity 클래스 또는 가장 Core한 클래스라고 부른다.

@Entity, @Column, @Id 등을 이용

Entity Classs는 자바 클래스에 @Entity 어노테이션을 붙여, 테이블과 매핑한다고 JPA에게 알려주는 클래스다.
그리고 엔티티 클래스에서 만들어진 객체를 엔티티라고 한다.

@Entity
===

@Entity 어노테이션을 클래스에 선언하면 그 클래스는 JPA가 관리한다. 그러므로 DB의 테이블과 Class(VO, DTO)와 맵핑한다면 반드시 @Entity를 붙여주어야 한다.

@Entity가 붙은 클래스에는 다음 제약사항이 필요하다.

필드에 final, enum, interface, class를 사용할 수 없다.

생성자중 기본 생성자가 반드시 필요하다.

@Entity의 속성

1. name : 엔티티 이름을 지정합니다. 기본값으로 클래스 이름을 그대로 사용한다.

참조: https://whitepro.tistory.com/265

https://velog.io/@leyuri/Spring-boot-JPA-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98-Entity-Table-Column-Id-Lombok

https://gmlwjd9405.github.io/2018/12/25/difference-dao-dto-entity.html

https://velog.io/@modsiw/JPAJava-Persistence-API%EC%9D%98-%EA%B0%9C%EB%85%90
