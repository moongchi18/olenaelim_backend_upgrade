# 오르내림
> 중고 경매 사이트 사이드 프로젝트
> 기간 : 2022년 10월 ~ 11월

> MyBatis To JPA Migration
> 기간 : 2024년 9월 ~ 진행 중

## 스택
> SpringBoot 2.7, Java 17, react, MySQL

## 역할
| 구분 | MyPart |
|----------|----------|
| 인프라    | CI/CD(Github Actions), AWS(EC2, Route53, S3), https 적용 |
| BackEnd   | 인증/인가(Security), 채팅서버 구성(Websocket, Stomp), 상품 정보 조회 API | 
| FrontEnd  | 상품 관련 페이지 |  

# 개선방향
| 완료 | 구분 | AS-IS | TO-BE |
|----------|----------|----------|----------|
| ✓ | 설정 | properties | yaml |
| ✕ | OM/ORM | Mybatis | JPA |
| ✕ | Java | 17 | 21 |
| ✕ | Spring Boot | 2.7 | 3.2 |
| ✕ | Build | Maven | Gradle |
| ✕ | Test | - | coverage 80%↑ |
