# 🚀 SIVEC - Sistema de Gestão de Estoque

Sistema backend desenvolvido com foco em controle de estoque, concorrência e arquitetura profissional.

---

## 🧠 Sobre o projeto

O SIVEC é um sistema backend que simula um ambiente real de gestão de estoque, permitindo operações simultâneas com consistência de dados.

Este projeto foi desenvolvido com foco em boas práticas de backend, organização de código e integração com banco de dados.

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

### 🔹 1. Subir o banco com Docker

```bash
docker run --name postgres-sivec \
-e POSTGRES_DB=sivec \
-e POSTGRES_USER=admin \
-e POSTGRES_PASSWORD=admin \
-p 5432:5432 \
-d postgres 