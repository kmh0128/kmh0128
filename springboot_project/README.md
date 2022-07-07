그레이들 프로젝트를 스프링부트 프로젝트로 변경
=======
>그레이들 프로젝트를 스프링부트 프로젝트로 변경(build.gradle의 기본설정에서 코드를 추가해서 변경한코드)
     
     buildscript{
        ext{ //ext는 build.gradle에서 사용하는 전역변수를 설정(전역 변수는 어떤 변수 영역 내에서도 접근할 수 있는 변수를 의미 반대의미의 지역변수가있음)
            springBootVersion = '2.1.7.RELEASE'//springBootVersion 전역변수를 생성하고 그 값을 '2.1.7.RELEASE'하겟다는 의미
     }//spring-boot-gradle-plugin 이라는 스프링 부트 그레이들 플러그인의 '2.1.7.RELEASE' 의존성으로 받겟다는 의미이다.
     
     respositories{// 각각의 의존성(라이브러리)들은 어떤 원격 저장소에서 받을지 정한다
          mavenCentral()//기본적으로 많이 사용
          jcenter()//라이브러리 업로드 난이도로 jcenter도 많이 사용된다 합니다(라이브러리 업로드를 최대한 간단히 하게 되어있음) 최근버전은 jcenter 사용중단
     }
     dependencies {//dependencies 프로젝트 개발에 의존성을 선택하는곳이지만 최신 버전에서는 업데이트가 있는지 오류가 발생했습니다
         classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
     }
     
     apply plugin: 'java' //plugin들은 스프링부트의 의존성을 관리해주는 플러그인이라 추가 필수
     apply plugin: 'eclipse'
     apply plugin: 'org.springframework.boot'
     apply plugin: 'io.spring.dependency-management'
     
     group 'org.example'
     version '1.0-SNAPSHOT'
     sourceCompatibility = 1.8
     
     repositories{
         mavenCentral()
     }
     
     dependencies {
         compile('org.springframework.boot:spring-boot-starter-web')
         testCompile('org.springframework.boot:spring-boot-starter-test')
     }



>최신 버전(2.7.1) build.gradle

>        >스프링이니셜라이저를 사용하여서 세팅 작업을 끝내놓은 상태에서 build.gradle
![2 7 1](https://user-images.githubusercontent.com/100178951/177762432-6652879b-fe67-4af1-a27b-2b797e2610e3.jpg)

          
참고서적-> 스프링 부트와 AWS로 혼자구현하는 웹서비스
스프링 이니셜라이저 -> https://start.spring.io/
