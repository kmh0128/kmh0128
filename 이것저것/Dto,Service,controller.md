Dto,Service,controller의 역할
===


DTO (Data Transfer Object)
=====

우선, DTO 의 정의를 간략하게 알아보겠습니다.

DTO는 프로세스 간에 데이터를 전달하는 용도의 객체입니다. 비즈니스 로직을 포함하지 않는 데이터를 전달하기 위한 단순한 객체 를 뜻합니다.

DTO는 즉 계층간의 데이터 전달 역할을 하며 클라이언트(사용자 or 고객)와 직접마주하는 대신 Dto를 사용해 전달합니다.

왜 Entity 계층이 직접적으로 교환하지 않는가에 대해서는 Entity의 값이 변하면 연관이있는 Repository 클래스에서 Entity Manager의 flush가호출 때

데이터베이스의 값이 반영되고, 이는 다른로직들에게도 영향을 미치게됩니다.

때문에 view와 통신하면서 필연적으로 많은 데이터의 수정이 필요한 DTO는 분리시켜주는게 좋습니다.



![다운로드 (11)](https://user-images.githubusercontent.com/100178951/230107798-b98e72a8-5f79-4f1f-8894-ef63b6bfecf5.png)

MVC 패턴에서는 주로 Client 와 Controller 사이에서 DTO 가 사용됩니다.

저는 보통 Controller 에서는 DTO 로 데이터를 전달받고, 애플리케이션 내부에서는 Domain(또는 Entity 또는 Model) 을 통해 데이터를 전달합니다.

 

예를 들면 Controller, Service, Repository, DataBase 는 서로 User 라는 도메인 객체를 통해 데이터를 전달하고,

Controller 에서 Client 로 리턴할 때는 UserDTO 에 매핑하여 리턴하는 것입니다.






출처 -> https://comdolidol-i.tistory.com/367

https://gmlwjd9405.github.io/2018/12/25/difference-dao-dto-entity.html

https://ttl-blog.tistory.com/112
