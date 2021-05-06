# uhaha.me
uhaha.me 의 전신은 2020.11월 혼자 진행했던 프로젝트인 spring-Stock-Asset입니다.  
당시 Legacy Spring(Spring 5.0.7, xml Configutation)& jsp로 작업하였던 내용을 그대로 버려두기가 아까워서  
SpringBoot(SpringBoot2.4.4)& Mustache 환경으로 옮겨서 AWS 서버에 배포하고 있는 프로젝트 입니다.

프로젝트에 사용된 기술의 변화는 다음과 같습니다.
|분류|spring-Stock-Asset|uhaha.me|
|---|---|---|
|IDE|eclipse|IntelliJ|
|Deploy|localhost|AWS Cloud|
|Framework|Spring|SpringBoot|
|View Library|.jsp|.mustache|
|Auth Logic|단순 로그인처리|Spring Security|
|Configuration|xml config|java config|
|DataAccess|Mybatis|JPA|
|DataBase|MySQL / local|MariaDB / AWS Cloud|

## 단축키 메모

Ctrl Shift T -> 테스트로 이동 (없는 경우 Create 가능)  
(리팩토링)  
Ctrl Alt V -> 변수로 선언
Ctrl Alt M -> 블록 선언한 부분을 method 로 선언
