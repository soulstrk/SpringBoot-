# 38. 스프링 웹 MVC 10부: Spring HATEOAS H​ypermedia ​A​s ​T​he ​E​ngine ​O​f ​A​pplication ​S​tate
● 서버: 현재 리소스와 ​연관된 링크 정보​를 클라이언트에게 제공한다

. ● 클라이언트: ​연관된 링크 정보​를 바탕으로 리소스에 접근한다.

● 연관된 링크 정보 ○ Rel​ation ○ H​ypertext ​Ref​erence)

● spring-boot-starter-hateoas 의존성 추가

● https://spring.io/understanding/HATEOAS 

● https://spring.io/guides/gs/rest-hateoas

● https://docs.spring.io/spring-hateoas/docs/current/reference/html/ 
 
# ObjectMapper 제공

● spring.jackson.*

● Jackson2ObjectMapperBuilder 
 
# LinkDiscovers 제공

● 클라이언트 쪽에서 링크 정보를 Rel 이름으로 찾을때 사용할 수 있는 XPath 확장 클래스 


## SOP과 CORS 

● Single-Origin Policy

● Cross-Origin Resource Sharing

● Origin? ○ URI 스키마 (http, https)

○ hostname (whiteship.me, localhost)

○ 포트 (8080, 18080) 
 
## 스프링 MVC @CrossOrigin 

● https://docs.spring.io/spring/docs/5.0.7.RELEASE/spring-framework-reference/web.ht ml#mvc-cors

● @Controller나 @RequestMapping에 추가하거나

● WebMvcConfigurer 사용해서 글로벌 설정  
 
