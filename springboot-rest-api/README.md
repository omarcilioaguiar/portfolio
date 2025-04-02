# 🏗 API REST com Spring Boot e PostgreSQL

Este projeto é uma API REST desenvolvida com **Spring Boot**, **PostgreSQL** e **Docker**.

## 🚀 Tecnologias Utilizadas:
- Java 17 + Spring Boot
- PostgreSQL + JPA/Hibernate
- Docker + Docker Compose

## 📌 Como Rodar?
1️⃣ **Suba o banco de dados**  
```sh
docker-compose up -d 

```
2️⃣ **Executar uma aplicação**
````sh
mvn spring-boot:run

`````
3️⃣ Testar a API
```sh
curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d '{"name": "João", "email": "joao@email.com"}'

````
Listar usuários:
```sh
curl -X GET http://localhost:8080/users
