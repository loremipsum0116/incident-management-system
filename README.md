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

## 프로젝트 구조

```text
src/
├── main/java/com/incidentmanagement/
│   ├── IncidentManagementApplication.java
│   └── domain/
│       ├── Incident.java
│       ├── IncidentStatus.java
│       ├── Severity.java
│       └── User.java
└── test/java/
```

## 실행

```bash
gradle run
```
