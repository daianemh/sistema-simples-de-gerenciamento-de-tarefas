📝 Sistema Simples de Gerenciamento de Tarefas

📌 Descrição
Este é um projeto back-end desenvolvido em Java usando Spring Boot, que permite o gerenciamento de tarefas com operações CRUD (Criar, Ler, Atualizar e Excluir). Ele utiliza um banco de dados H2 embutido para facilitar testes e execução no IntelliJ IDEA.

🔧 Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- Banco de dados H2
- Maven
- JUnit para testes

Como Rodar o Projeto
 Pré-requisitos
Antes de iniciar, certifique-se de ter:
✅ Java instalado (JDK 17)
✅ IntelliJ IDEA configurado
✅ Maven instalado

Compilar e Rodar
Use os comandos:
mvn clean install
mvn spring-boot:run


 Acessar os endpoints
Após rodar o servidor, os seguintes endpoints estarão disponíveis:
- Listar tarefas: GET http://localhost:8080/tarefas
- Criar tarefa: POST http://localhost:8080/tarefas
- Atualizar tarefa: PUT http://localhost:8080/tarefas/{id}
- Deletar tarefa: DELETE http://localhost:8080/tarefas/{id}

 Banco de dados
Você pode visualizar e gerenciar os dados pelo H2 Console, acessando:
➡️ http://localhost:8080/h2-console

🧪 Testes
Para rodar testes unitários, execute:
mvn test

