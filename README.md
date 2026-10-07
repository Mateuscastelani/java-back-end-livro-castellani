# java-back-end-livro-castellani

Este repositório contém o código de acompanhamento do livro Java Back-End, adaptado e atualizado para as tecnologias mais recentes.


## Serviços


* **user-api:** Possui os serviços para gerenciar os usuários da aplicação.
* **product-api:** Possui os serviços para gerenciar os produtos disponíveis para compra.
* **shopping-api:** Possui os serviços para que os usuários realizem compras.



## Banco de Dados

As aplicações criam as tabelas automaticamente quando são executadas pela primeira vez, no entanto, o banco de dados deve ser criado previamente no PostgreSQL.


As aplicações estão configuradas para se conectarem ao banco de dados `dev`. Por isso, antes de rodar as aplicações, certifique-se de criar este banco de dados. Se quiser alterar o nome do banco de dados, modifique o arquivo `application.properties` de cada projeto. Utilizando o `docker-compose`, esse banco de dados já é criado automaticamente.
Todos os projetos acessam o mesmo banco de dados, apenas criam schemas diferentes.


## Insomnia


O arquivo `insomnia_collection.json` (disponível na raiz do projeto) é um workspace exportado do Insomnia que possui as requisições configuradas para os serviços da aplicação. A coleção está estruturada para chamar os serviços já no Kubernetes. Para chamar na execução local, basta trocar o domínio base (por exemplo, de `shopping.com` para `localhost:808x`).


## Execução


A maneira mais simples de executar a aplicação é utilizando o `docker-compose`. Para isso, basta executar o comando `docker-compose up` depois que as imagens Docker dos microsserviços forem criadas.


## Versões

As aplicações foram atualizadas e configuradas para utilizar as seguintes tecnologias:


* **Java:** Versão 25
* **Spring Boot:** Versão mais recente e atualizada (compatível com Java 25)
