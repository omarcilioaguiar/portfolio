# ⚡ Microsserviço com Quarkus e Kafka

Este projeto implementa um **microsserviço assíncrono** usando **Quarkus** e **Apache Kafka**.

## 🚀 Tecnologias Utilizadas:
- Java 17 + Quarkus
- Apache Kafka + Strimzi
- Docker + Docker Compose

## 📌 Como Rodar?
1️⃣ **Suba o ambiente kafka**
```sh
docker-compose up -d 

```
2️⃣ **Executar o microserviço**
````sh
./mvnw quarkus:dev

`````
3️⃣ **Testando envio de mensagens no Kafka**
```sh
curl -X POST http://localhost:8080/events -H "Content-Type: application/json" -d '{"id": 1, "mensagem": "Teste Kafka"}'

````
