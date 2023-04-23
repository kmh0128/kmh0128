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

참조: https://whitepro.tistory.com/265

https://velog.io/@leyuri/Spring-boot-JPA-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98-Entity-Table-Column-Id-Lombok

https://gmlwjd9405.github.io/2018/12/25/difference-dao-dto-entity.html
