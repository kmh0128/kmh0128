UTF8이란
===

sns 인스타그램 인강을 보면서 클론코딩 프로젝트를 하다가 UTF8을 접하게 되었는데 정확히 무엇인지 잘 이해하지 못하여 

메모겸 공부겸 작성하게 되었습니다.

UNICODE
===

UTF-8을 알기 위해서는 먼저 유니코드를 알아봐야겠네요.

유니코드는 전 세계의 모든 문자를 컴퓨터에서 일관되게 표현하고 다룰 수 있도록 설계된 산업 표준이다.

이것을 규율하는 단체는 유니코드 콘소시엄(Unicode Consortium)이라고 한다.

전 세계의 모든 문자를 담는 ISO/IEC 10646 코드표를 사용함으로써, 각 언어와 문자 체계에 따른 충돌 문제를 해결하였다. 

따라서 유니코드를 사용하면 한글과 신자체·간체자, 아랍 문자 등을 통일된 환경에서 깨뜨리지 않고 사용할 수 있다.

UTF-8
===

UTF-8은 유니코드를 위한 가변 길이 문자 인코딩 방식 중 하나로, 켄 톰프슨과 롭 파이크( GO언어를도 만드신분)가 만들었다.

풀네임은 Unicode Transformation Format - 8bit 8의미는 8비트 1바이트를 기준으로 인코딩한다는 의미이다.

코드 페이지는 65001로, UTF-8로 표현 가능한 길이는 최대 6바이트지만 다른 인코딩과의 호환을 위해 4바이트까지만 사용한다.

그래서 한 글자가 1~4바이트 중 하나로 인코딩될 수 있으며, 1바이트 영역은 아스키 코드와 하위 호환성을 가진다. 

아스키 코드의 0~127까지는 UTF-8로 완전히 동일하게 기록된다.

유니코드는 U+10FFFF까지만(10진법으로는 1,114,111) 이용하는데, UTF-8은 아래에 나와 있듯이 가변 바이트 길이를 선언하기 위해 꽤 많은 비트를 잡아먹고도 2,097,151까지 인코딩할 수 있기 때문에 4바이트만으로도 충분하고도 남는다.


참조 자료 -> https://velog.io/@ts6938/UTF-8%EC%9D%B4%EB%9E%80-%EB%AC%B4%EC%97%87%EC%9D%BC%EA%B9%8C

https://ko.wikipedia.org/wiki/UTF-8
