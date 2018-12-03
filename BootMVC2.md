# 정적 리소스 지원

### 기본 리소스 위치들

* classpath:/static
* classpath:/public
* classpath:/resources/
* classpath:/META-INF/resources

spring.mvc.static-path-pattern: 맵핑 설정 변경 가능

spring.mvc.static-locations : 리소스 찾을 위치 변경 가능

WebMvcConfigurer의 addResourceHandlers로 커스터 마이징 할 수 있음

### 스프링부트에서 JSP 를 내장 톰캣과 함께 사용하기위해서는 War파일로 패키징을 해준다음 사용할 수 있다.

mvn clean package

java -jar target/spring-boot-web-jsp-1.0.war

### index.html 을 부트가 제공하는resources 기본 루트에 넣어주면 초기 페이지로 등록

#### Thymeleaf 스프링 부트가 자동 설정을 지원하는 템플릿 엔진


