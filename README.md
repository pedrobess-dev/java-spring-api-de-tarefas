# Java Spring API de Tarefas

Simples API de tarefas desenvolvida com Java e Spring Boot, permitindo a criação, listagem, atualização e exclusão de tarefas.

## Funcionalidades

- **Criação de Tarefas**: Permite adicionar novas tarefas.
- **Listagem de Tarefas**: Exibe todas as tarefas cadastradas.
- **Atualização de Tarefas**: Possibilita a edição de tarefas existentes.
- **Exclusão de Tarefas**: Permite remover tarefas do sistema.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Maven**

## Pré-requisitos

- **Java 17** instalado
- **Maven** instalado

## Instalação

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/pedrobess-dev/java-spring-api-de-tarefas.git
   ```

2. **Instale as dependências e compile o projeto**:

   ```bash
   mvn clean install
   ```

3. **Execute a aplicação**:

   ```bash
   mvn spring-boot:run
   ```

   A aplicação estará disponível em `http://localhost:8080/tarefas`.

## Endpoints Principais

- **GET /tarefas**: Lista todas as tarefas.
- **POST /tarefas**: Cria uma nova tarefa.
- **PUT /tarefas/{tarefa_id}**: Atualiza uma tarefa existente.
- **DELETE /tarefas/{tarefa_id}**: Remove uma tarefa.

Para mais detalhes sobre os endpoints e suas funcionalidades, consulte a documentação da API.

## Contribuição

Contribuições são bem-vindas! Siga os passos abaixo:

1. **Fork** o repositório.
2. Crie uma **branch** para sua feature (`git checkout -b feature/nova-feature`).
3. Faça o **commit** das suas alterações (`git commit -m 'Adiciona nova feature'`).
4. Dê **push** na sua branch (`git push origin feature/nova-feature`).
5. Abra um **Pull Request**.

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais informações.

## Autor

Pedro Bessão - [pedrobess-dev](https://github.com/pedrobess-dev)