# Incident Management System

인시던트를 등록하고 관리하기 위한 Java 애플리케이션입니다.

## Incident domain model

- Incident는 `OPEN` 상태로 생성됩니다.
- 심각도는 1부터 5 사이여야 합니다.
- 제목은 `null`이거나 공백일 수 없습니다.
- 이미 종료된 Incident는 다시 종료할 수 없습니다.

## 프로젝트 구조

```text
src/
├── main/java/com/incidentmanagement/
│   ├── IncidentManagementApplication.java
│   └── domain/Incident.java
└── test/java/
```

## 실행

```bash
gradle run
```
