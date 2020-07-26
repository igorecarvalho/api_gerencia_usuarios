# API de Gerenciamento de Usuários

Esta é uma API em desenvolvimento construida com o proposito de desenvolver uma aplicação de controle de gerenciamento de usuarios. A API trata-de um projeto com base **Maven**, **SringBoot** para realização de persistencias e interface com banco de dados **MySQL**. No frontend foi utilizado o **HTML**, **Thymeleaf** e o **CSS Materializa**.
Esta API consiste em:
#### Criação de uma tabela Cargos:
[x] Implementação de inserção;
[x] Implementação de edição;
-- Porem a edição nao é atualizada no banco de dados.
[x] Implementação de exclusão;

#### Criação de uma tabela Perfis:
[x] Implementação de inserção;
[x] Implementação de edição;
-- Porem a edição nao é atualizada no banco de dados.
[x] Implementação de exclusão;

#### Criação de uma tabela Usuários:
[x] Implementação de inserção;
[x] Implementação de edição;
-- Porem a edição nao é atualizada no banco de dados.
[x] Implementação de exclusão;

#### Listemos alguns pontos na implementação:
- É possivel a inserção de usuários com campos em branco;
- Os tipos Data em, *data de nascimento* e *data de cadastro*, ocorrem erro e não são inseridos no banco de dados;
- Apesar de implementados ocorrem erros para inserir elementos que possuem conexões com mais de uma tabela;

#### Listemos alguns pontos na execução:
- É necessário a criação do banco de dados **gen_usuarios** previamente;
- 
