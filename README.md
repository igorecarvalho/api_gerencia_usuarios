# Sistema de Gerenciamento de Usuários

Esta é um sistema em desenvolvimento construida com o proposito de desenvolver uma aplicação de controle de gerenciamento de usuarios. O sistema trata-de um projeto com base **Maven**, **SringBoot** para realização de persistencias e interface com banco de dados **MySQL**. No frontend foi utilizado o **HTML**, **Thymeleaf** e o **CSS Materializa**.
Este sistema consiste em:
#### Criação de uma tabela Cargos:
- [x] Implementação de inserção;
- [x] Implementação de listagem de cargos;
- [x] Implementação de exclusão;
- [x] Implementação de edição;
- -- Porem a edição nao é atualizada no banco de dados.


#### Criação de uma tabela Perfis:
- [x] Implementação de inserção;
- [x] Implementação de listagem de perfis;
- [x] Implementação de exclusão;
- [x] Implementação de edição;
- -- Porem a edição nao é atualizada no banco de dados.


#### Criação de uma tabela Usuários:
- [x] Implementação de inserção;
- [x] Implementação de listagem de usuários;
- [x] Implementação de exclusão;
- [x] Implementação de edição;
- -- Porem a edição nao é atualizada no banco de dados.


#### Listemos alguns pontos na implementação:
- É possivel a inserção de usuários com campos em branco;
- Os tipos Data em, *data de nascimento* e *data de cadastro*, ocorrem erro e não são inseridos no banco de dados;
- Apesar de implementados ocorrem erros para inserir elementos que possuem conexões com mais de uma tabela;

### Para importação do sistema
- Faça o **clone** deste repositório;
- Utilziando **Eclipse IDE for JEE**
**Importar -> Maven -> Existing Maven Project**;
- Selecione a pasta deste repositório e **Finish**.

#### Listemos alguns pontos na execução:
- É necessário a criação do banco de dados **gen_usuarios** previamente;
- No arquivo **application.properties**, na pasta **resources** é necessário settar o **spring.datasource.username=** e **spring.datasource.password=** caso sejam diferentes de **root** e **1234** respectivamente.
- Caso as tabelas nao sejam criadas, em uma primeira execução é necessaria crialas settando o **spring.jpa.hibernate.ddl-auto =** como **create**;

### Para executar

- Clique com o botão direito no arquivo **GenUsuarioApplication.java** em **src/main/java** -> **Run as -> Java Application**;
- No seu navegador de web preferencial entre com **http://localhost:8090**;

### Tecnologias Utilizadas
- Springboot  JPA
- Springboot Thymeleaf
- Springboot Web
- Springboot DevTools
- MySQL
- Maven
