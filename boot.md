# SpringBoot-
스프링 부트 맛보기 (백기선 강의)

# 6. 스프링 부트 프로젝트 구조 
 
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-structuring-y our-code 
 
메이븐 기본 프로젝트 구조와 동일
● 소스 코드 (src\main\java)

● 소스 리소스 (src\main\resource)

● 테스트 코드 (src\test\java) 

● 테스트 리소스 (src\test\resource) 
 
# 메인 애플리케이션 위치
● 기본 패키지
3부: 스프링 부트 원리 
 
2부에서는 스프링 부트의 핵심 원리를 학습합니다.
스프링 부트가 제공하는 ‘의존성 관리', ‘자동 설정' 그리고 ‘내장 서블릿 컨테이너'에 대해 학습합니다. 

# 7. 의존성 관리 이해 
 
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-dependency -management 
# 8. 의존성 관리 응용 
 
● 버전 관리 해주는 의존성 추가

● 버전 관리 안해주는 의존성 추가

● 기존 의존성 버전 변경하기

● https://mvnrepository.com/ 
 
# 9. 자동 설정 이해 
 
● @EnableAutoConfiguration (@SpringBootApplication 안에 숨어 있음)

● 빈은 사실 두 단계로 나눠서 읽힘 ○ 1단계: @ComponentScan

○ 2단계: @EnableAutoConfiguration ● @ComponentScan

○ @Component

○ @Configuration @Repository @Service @Controller @RestController 


● @EnableAutoConfiguration

○ spring.factories 

■ org.springframework.boot.autoconfigure.EnableAutoConfigu ration ○


@Configuration ○ @ConditionalOnXxxYyyZzz 
