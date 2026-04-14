# SIVEC - Sistema de Controle de Estoque

API REST desenvolvida com Java e Spring Boot para gerenciamento de produtos.

## Tecnologias utilizadas

- Java
- Spring Boot
- PostgreSQL
- JPA / Hibernate
- Maven
- Git

## Funcionalidades

- Criar produtos (POST)
- Listar produtos (GET)

## Arquitetura

O projeto segue arquitetura em camadas:

- Controller → entrada da API
- Service → lógica de negócio
- Repository → acesso ao banco
- Model → entidade

## Endpoints

### POST /produtos
Cria um novo produto

### GET /produtos
Lista todos os produtos

## Como rodar o projeto

```bash
./mvnw spring-boot:run
---

## Tecnologias utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- PostgreSQL  
- Docker  
- Maven  

---

## Como rodar o projeto

### Pré-requisitos

- Java 17  
- Docker  
- Maven  

---

### 1. Subir o banco com Docker

```bash
docker run --name postgres-sivec \
-e POSTGRES_DB=sivec \
-e POSTGRES_USER=admin \
-e POSTGRES_PASSWORD=admin \
-p 5432:5432 \
-d postgres

### 2. Rodar a aplicação

```bash
./mvnw spring-boot:run

### 3. Teste da API

Após iniciar a aplicação, acesse no navegador:

http://localhost:8080/hello

Ou via terminal:

```bash
curl http://localhost:8080/hello

Resposta esperada:

Sivec rodando
