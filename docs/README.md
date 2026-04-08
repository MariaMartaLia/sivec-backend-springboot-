# 🚀 SIVEC - Backend de Gestão de Estoque com Spring Boot
Sistema backend desenvolvido com foco em controle de estoque, concorrência e arquitetura profissional.

---

## 🧠 Sobre o projeto

O SIVEC é um sistema backend que simula um ambiente real de gestão de estoque, permitindo operações simultâneas com consistência de dados.

Este projeto foi desenvolvido com foco em boas práticas de backend, organização de código e integração com banco de dados.

---

## 📌 Objetivo do projeto

Simular um sistema real de controle de estoque, garantindo consistência de dados em cenários com múltiplas operações simultâneas.

---

## 🏗️ Arquitetura

- API REST com Spring Boot
- Camada de persistência com Spring Data JPA
- Banco de dados PostgreSQL
- Containerização com Docker

---

## 🛠️ Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL
- Docker
- Maven

---

## ⚙️ Como rodar o projeto

### 🔧 Pré-requisitos

- Java 17
- Docker
- Maven

---

### 🔹 1. Subir o banco com Docker

```bash
docker run --name postgres-sivec \
-e POSTGRES_DB=sivec \
-e POSTGRES_USER=admin \
-e POSTGRES_PASSWORD=admin \
-p 5432:5432 \
-d postgres

▶️ 2. Rodar a aplicação

./mvnw spring-boot:run

🌐 3. Teste da API

Após iniciar a aplicação, acesse no navegador:

http://localhost:8080/hello

Ou via terminal:

curl http://localhost:8080/hello

Resposta esperada:

Sivec rodando!
