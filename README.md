🚀 Desenvolvimento de API com Arquitetura Limpa!

## 🚀 Tecnologias
- [Java](https://www.java.com/pt-BR/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Maven](https://maven.apache.org/)
- [Lombok](https://projectlombok.org/)


## 🚀 Arquitetura
- [Arquitetura Limpa](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)
- [Padrão de Projeto Repository](https://martinfowler.com/eaaCatalog/repository.html)
- [Padrão de Projeto DTO](https://martinfowler.com/eaaCatalog/dataTransferObject.html)


## 🚀 Execução

- Clone o projeto
- Criar um banco de dados MySQL
- Alterar as configurações do banco de dados no arquivo `application.properties`
- Acesse a pasta do projeto
- Execute o comando `mvn clean install`
- Execute o comando `mvn spring-boot:run`


## 🚀 Endpoints

- ` POST /api/v1/todo ` - Cria uma Todo

```json

{
  "title": "Primeira TODO",
  "description": "essa é uma descrição",
  "status": "PENDING"
}
```
or

```json

{
  "title": "Primeira TODO",
  "description": "essa é uma descrição",
  "status": "DONE"
}
```

- ` GET /api/v1/todo/1 ` - Lista uma Todo
- ` GET /api/v1/todo `   - Lista todas as Todo
- ` PUT /api/v1/todo/1 `  - Edita o Status da Todo

```json

{
  "status": "DONE"
}


