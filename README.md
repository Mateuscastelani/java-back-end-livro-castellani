java-back-end-livro
Este repositório contém o código de acompanhamento do livro Java Back-End, adaptado e atualizado para as tecnologias mais recentes.

Serviços
A aplicação é composta por três microsserviços: user-api, product-api e shopping-api.

user-api: Possui os serviços para gerir os utilizadores da aplicação.

product-api: Possui os serviços para gerir os produtos disponíveis para compra.

shopping-api: Possui os serviços para que os utilizadores realizem compras.

Base de Dados
As aplicações criam as tabelas automaticamente quando são executadas pela primeira vez, no entanto, a base de dados tem de ser criada previamente no PostgreSQL.
As aplicações estão configuradas para se ligarem à base de dados dev. Por isso, antes de correr as aplicações, certifique-se de que cria esta base de dados. Se pretender alterar o nome, modifique o ficheiro application.properties de cada projeto. Se utilizar o docker-compose, esta base de dados já é criada automaticamente.
Todos os projetos acedem à mesma base de dados, criando apenas schemas distintos.

Insomnia
O ficheiro insomnia_collection.json (disponível na raiz do projeto) é um espaço de trabalho exportado do Insomnia que possui as requisições configuradas para os serviços da aplicação. A coleção está estruturada para aceder aos serviços já no Kubernetes. Para realizar as chamadas na sua execução local, basta alterar o domínio base (por exemplo, de shopping.com para localhost:808x).

Execução
A forma mais simples de executar a aplicação é através do docker-compose. Para tal, basta executar o comando docker-compose up após a criação das imagens Docker dos respetivos microsserviços.

Versões
As aplicações foram atualizadas e configuradas para utilizar as seguintes tecnologias:

Java: Versão 25

Spring Boot: Versão mais recente e atualizada (compatível com Java 25)
