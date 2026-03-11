# Challenge-Forum-Hub
Projeto obrigatório de um curso.

## Descrição

API backend em Java + Spring Boot para gerenciamento de tópicos de discussão, com CRUD e autenticação JWT.

## Tecnologias

- Java 21+ 
- Spring Boot 
- Spring Data JPA 
- Spring Security 
- Flyway 
- MySQL 
- Maven

## Banco de Dados

MySQL: forumhub

Tabela topicos com campos: id, titulo, mensagem, data_criacao, status, autor, curso

## Testes no Postman

- Login: POST /login → retorna token JWT (requer ajuste)
- CRUD de tópicos: enviar token no header Authorization: Bearer <token>
- Endpoints:
  - POST /topicos
  - GET /topicos
  - GET /topicos/{id}
  - PUT /topicos/{id}
  - DELETE /topicos/{id}
