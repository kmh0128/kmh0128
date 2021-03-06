어노테이션이란?
=======

에노테이션은 주석이라는 의미를 가진다.

자바 소스 코드에 사이에 @ 기호를 앞에 붙여서 사용하는데,  JDK 1.5 버전 이상에서 사용 가능하다.

어노테이션의 용도
======
컴파일러에게 코드 작성 문법 에러를 체크하도록 정보를 제공

소프트웨어 개발툴이 빌드나 배치시 코드를 자동으로 생성할 수 있도록 정보 제공

실행시(런타임시)특정 기능을 실행하도록 정보를 제공
 
 내장 애너테이션
 ========
7개의 표준 어노테이션 중에 3개가 java.lang의 일부이며,

나머지 4개는 java.lang.annotation으로부터 가져온다.

어노테이션 종류
=======
 

자바 코드에 적용되는 내장 어노테이션
@Override

선언한 메서드가 오버라이드 되었다는 것을 나타냅니다.
만약 상위(부모) 클래스(또는 인터페이스)에서 해당 메서드를 찾을 수 없다면 컴파일 에러(오류)를 발생하게 됩니다

@Deprecated

해당 메서드가 더 이상 사용되고 있지 않음을 나타냅니다.

만약 사용할 경우 컴파일 경고가 나타납니다.

@SuppressWarnings

선언한 곳의 컴파일 경고를 무시하도록 하게됩니다.

@SafeVarargs

Java7 부터 지원하고있습니다. 

제너릭 같은 가변인자의 매개변수를 사용할 때의 경고를 무시합니다.

@FunctionalInterface

Java8 부터 지원 함수형 인터페이스를 지정하는 어노테이션(Annotation)입니다.

만약 메서드가 존재하지 않거나, 1개 이상의 메서드(default 메서드 제외)가 존재할 경우 컴파일 오류를 발생 시킵니다.

spring에서 어노테이션이란
============

Spring에서는 Annotation을 많이 사용한다.

JAVA에서 Annotation 이라는 기능이 있는거는 위에 작성해놨지만 사전상으로는 주석의 의미이지만 Java 에서는 주석 이상의 기능을 가지고 있습니다. 

Annotation은 자바 소스 코드에 추가하여 사용할 수 있는 메타데이터의 일종입니다. 

소스코드에 추가하면 단순 주석의 기능을 하는 것이 아니라 특별한 기능을 사용할 수 있습니다.

Annotation은 클래스와 메서드에 추가하여 다양한 기능을 부여하는 역할을 합니다. 

Annotation을 활용하여 Spring Framework는 해당 클래스가 어떤 역할인지 정하기도 하고, Bean을 주입하기도 하며, 자동으로 getter나 setter를 생성하기도 합니다. 

특별한 의미를 부여하거나 기능을 부여하는 등 다양한 역할을 수행할 수 있습니다.

여기서 Bean이란 의미를 알아보겠습니다.

스프링 빈(Spring Bean)
======

Spring IoC 컨테이너가 관리하는 자바 객체를 빈(Bean)이라고 부릅니다. 
이전 포스팅에서 제어의 역전 (IOC, Inversion Of Control)에 대하여 간략하게 알아보았는데요. 
IOC의 특징은 아래와 같습니다.

>일반적으로 처음에 배우는 자바 프로그램에서는 각 객체들이 프로그램의 흐름을 결정하고 각 객체를 직접 생성하고 조작하는 작업(객체를 직접 생성하여 메소드 호출)을 했습니다.
>
>  즉, 모든 작업을 사용자가 제어하는 구조였습니다. 
>  
>  예를 들어 A 객체에서 B 객체에 있는 메소드를 사용하고 싶으면, B 객체를 직접 A 객체 내에서 생성하고 메소드를 호출합니다.


>하지만 IOC가 적용된 경우, 객체의 생성을 특별한 관리 위임 주체에게 맡깁니다. 
>
>이 경우 사용자는 객체를 직접 생성하지 않고, 객체의 생명주기를 컨트롤하는 주체는 다른 주체가 됩니다. 
>
>즉, 사용자의 제어권을 다른 주체에게 넘기는 것을 IOC(제어의 역전) 라고 합니다.


Spring의 대표적인 Annotation과 역할
=============

@Component
개발자가 생성한 Class를 Spring의 Bean으로 등록할 때 사용하는 Annotation입니다. 

Spring은 해당 Annotation을 보고 Spring의 Bean으로 등록합니다.

@Component(value="myman")

public class Man {

    public Man() {
    
        System.out.println("hi");
    }
}


 참조 -> https://bangu4.tistory.com/199
 
https://melonicedlatte.com/2021/07/18/182600.html
