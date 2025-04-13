# Spring Boot Sample 專案

這是一個 Spring Boot 範例專案，展示了基本的 Spring Boot WebFlux 應用程式結構和設定。

## 環境需求

- Java 17
- Maven 3.9.9 (已包含 Maven Wrapper)
- Spring Boot 3.3.10

## 專案結構

```
spring-boot-sample/
├── modules/
│   └── webapi/          # Web API 模組
├── src/
│   └── main/
│       └── resources/   # 共用配置文件
└── pom.xml             # 父專案 POM
```

## 快速開始

1. 複製專案
```bash
git clone https://github.com/oscar0524/spring-boot-sample.git
cd spring-boot-sample
```

2. 執行專案（使用 Maven Wrapper）
```bash
./mvnw clean install
./mvnw spring-boot:run -pl modules/webapi
```

專案預設會使用 dev 設定檔啟動。

## API 端點

- `GET /hello`: 返回應用程式名稱與測試屬性值的組合

## 設定檔

專案支援多環境設定：

- `application.properties`: 基本設定
- `application-dev.properties`: 開發環境設定
- `parent.properties`: 父層基本設定
- `parent-dev.properties`: 父層開發環境設定

可用的設定檔：
- dev (預設)
- prod
- test

切換環境：
```bash
./mvnw spring-boot:run -pl modules/webapi -Dspring.profiles.active=prod
```

## 建置與測試

```bash
# 運行測試
./mvnw test

# 建置專案
./mvnw clean package
```

## 依賴套件

- Spring Boot WebFlux
- Spring Boot DevTools
- Lombok
- Reactor Test (用於測試)