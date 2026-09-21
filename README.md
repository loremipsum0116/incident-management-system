# Incident Management System

인시던트를 등록하고 관리하기 위한 Java 애플리케이션입니다.

## Domain rules

- Incident severity is represented by `Severity`.
- Incident status is represented by `IncidentStatus`.
- Status transition: `OPEN -> IN_PROGRESS -> RESOLVED -> CLOSED`.
- Assignees can only be changed while an incident is `OPEN` or `IN_PROGRESS`.

## Incident operations

- `changeTitle()` — 제목 변경
- `changeSeverity()` — 심각도 변경
- `assignTo()` — 담당자 지정 및 변경
- `startProgress()` — 작업 시작
- `resolve()` — 인시던트 해결
- `close()` — 인시던트 종료

## Notification

알림 전송 방식은 `NotificationSender` 인터페이스로 추상화되어 있습니다.

- `EmailNotificationSender` — 이메일 알림 전송
- `SlackNotificationSender` — Slack 알림 전송
- 새로운 알림 채널은 `NotificationSender`를 구현해 추가할 수 있습니다.
- `Main`에서 `SlackNotificationSender`를 이용한 간단한 전송 예제를 확인할 수 있습니다.

## 프로젝트 구조

```text
src/
├── main/java/com/incidentmanagement/
│   ├── IncidentManagementApplication.java
│   └── domain/
│       ├── Incident.java
│       ├── IncidentStatus.java
│       ├── NotificationSender.java
│       ├── EmailNotificationSender.java
│       ├── SlackNotificationSender.java
│       ├── Severity.java
│       ├── User.java
│       └── Main.java
└── test/java/
```

## 실행

```bash
gradle run
```

## 최종 목표 기술 및 구현 범위

이 프로젝트는 30일 Java/Spring 백엔드 학습 과정에 맞춰 다음 범위까지 확장하는 것을 목표로 합니다.

### Language & Backend

- Java 21, Gradle
- Java OOP, Collection, Exception, Generic, Stream
- Spring Boot 기반 REST API
- Controller → Service → Repository 계층 구조
- Validation, 전역 예외 처리, Transaction, 인증

### Domain & API

- Incident 생성, 조회, 수정, 삭제
- Incident 상태 전이와 담당자 관리
- Severity, User, Comment, History 모델
- 알림 채널 추상화 및 Email/Slack 구현
- API 명세와 요청·응답 예시

### Database & Test

- PostgreSQL
- Spring Data JPA 또는 MyBatis
- DB schema/migration 및 ERD
- JUnit 기반 단위·통합 테스트

### Infrastructure & Delivery

- Linux 환경과 네트워크·포트·로그 진단
- Docker, Docker Compose
- Nginx 및 Cloud 배포
- GitHub Actions 기반 CI/CD
- 실행 방법, API 문서, 트러블슈팅 기록

## 현재 진행 상황

> 2026-09-21 저장소의 코드와 Git 이력을 기준으로 한 보수적 추정입니다.

- 판정: **Day 3 완료 / Day 4 진행**
- 전체 진도율: **10% (3/30)**
- 현재 주차: **1주차 — Java Core + Git 기반**
- 판정 신뢰도: **중간** — Day별 세부 산출물이 별도로 정의되어 있지 않아 실제 구현 증거를 기준으로 추정했습니다.

| 분야 | 상태 | 확인된 내용 / 다음 과제 |
|---|---|---|
| Java Core | 진행 중 | 도메인 객체, enum, 상태 전이, 예외, 인터페이스와 다형성 구현 완료. Collection, Generic, Stream 학습 증거 필요 |
| Git | 부분 완료 | 기능·문서 단위의 의미 있는 commit 이력 존재. branch, merge, 협업 workflow 실습 필요 |
| Spring Backend | 미착수 | 현재 Java 애플리케이션이며 Spring Boot, Controller, Service, Repository 미구현 |
| Database | 미착수 | PostgreSQL 연결, ORM, schema/migration, ERD 미구현 |
| Test | 미착수 | 테스트 소스와 JUnit 의존성·테스트 케이스 미구현 |
| Linux / Network | 미착수 | 실행 환경 및 장애 진단 기록 없음 |
| Docker / Cloud / CI-CD | 미착수 | Dockerfile, Compose, 배포 설정, GitHub Actions workflow 없음 |
| Documentation | 진행 중 | 도메인 규칙, 구조, 실행 방법 기록. 향후 API 명세·ERD·배포·트러블슈팅 문서 필요 |

### 다음 완료 기준

1. Collection, Generic, Stream을 실제 도메인 코드에 적용합니다.
2. 핵심 도메인 규칙을 JUnit 테스트로 검증합니다.
3. 1주차 학습 내용과 회고를 문서화합니다.
4. 이후 Spring Boot REST API와 PostgreSQL 연결 단계로 진행합니다.
