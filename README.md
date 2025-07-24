# DesafioBTG
Desafio de Código usando Java com Spring Boot, RabbitMq e MongoDB

Nesse projeto foi construido um microserviço que tem como objetivo processar pedidos a partir de uma fila usando RabbitMQ, Criando uma API que permita consultar o valor de um pedido, quantidade de pedidos por cliente e listar os pedidos realizados por cliente

Através de uma API RestFull foi utilizado a Linguagem Java com Spring Boot e o banco de dados foi estruturado usando MongoDB
As escolhas se dão pela facilidade de uso da dependencia do MongoDB no Java Spring Boot.

A mensagem consumida da fila RabbitMQ consiste em um Json e a partir desta mensagem foi estruturada a modelagem do banco de dados e da API.

A API teve como objetivo informar

- Valor total de um pedido
- Quantidade de pedidos por cliente
- Lista de pedidos realizados por cliente

Concluindo Foi criado um Microserviço para consumir uma Fila do RabbitMQ e enviando a informação da Fila para o banco de Dados MongoDB via docker, mapeando a coleção do MongoDB dentro do Spring. Foram feitas aggregations no MongoDB através do Spring e a criação de Logs usando o SLF4J. Criando um endpoint para estruturar um DTO de retorno, foi realizado a criação do serviço de listagem de pedidos por cliente e por fim, foi criado a regra que calcula o valor total de todos os pedidos do cliente.
