# desafio-todolist
---

## Índice
- [Descrição](#descrição)
- [Instalação](#instalação)
- [Uso](#uso)
- [Funcionalidades](#funcionalidades)
- [Tecnologias](#tecnologias)
- [Contato](#contato)

---

## Descrição

> Este é um aplicativo para gerenciar tarefas (Todo List), permitindo que os usuários criem, atualizem e excluam tarefas de forma simples e organizada.

---

## Instalação

### Pré-requisitos
- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- Banco de dados (ex.: MySQL/h2)

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/usuario/projeto.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd projeto
   ```
3. Instale as dependências:
   ```bash
   mvn install
   ```
4. Configure o arquivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
   spring.datasource.username=usuario
   spring.datasource.password=senha
   ```
5. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

---

## Uso

### Exemplos de uso
- **Criar uma tarefa:**
  ```bash
  curl -X POST http://localhost:8080/todos -H "Content-Type: application/json" -d '{"name":"Nova Tarefa","descricao":"Descrição da tarefa","realizado":false}'
  ```
- Acesse a interface Swagger para testar os endpoints: `http://localhost:8080/swagger-ui.html`.

---

## Funcionalidades

- [x] Criar tarefas
- [x] Atualizar tarefas
- [x] Excluir tarefas
- [ ] Gerar relatórios

---

## Tecnologias

- **Linguagem**: Java
- **Framework**: Spring Boot
- **Banco de Dados**: MySQL
- **Documentação de API**: Swagger/OpenAPI
- **Build Tool**: Maven

---

---

---

## Contato
Forneça informações de contato para quem quiser tirar dúvidas ou colaborar.

- **Nome**: Vitor Lopes Barreto
- **Email**: vitorbarreto1990@outlook.com
- **LinkedIn**: https://www.linkedin.com/in/vitor-lopes-574855279/
- **GitHub**: https://github.com/vitor06-git
