Documentação do Projeto: CryptoSimple 

-Visão Geral
O CryptoSimple é uma aplicação Java desenvolvida para auxiliar investidores de criptomoedas a monitorar preços em tempo real e organizar uma lista de ativos favoritos para acompanhamento de mercado.

-Requisitos Funcionais
ID: RF01 - Consultar Preços
O sistema deve buscar o preço atualizado do Bitcoin (BTC) Reais (BRL) via API AwesomeAPI.

ID: RF02 - Salvar Favorito
O usuário poderá escolher uma moeda e salvar o preço atual no banco de dados.

ID: RF03 - Listar Histórico
O sistema deve exibir todos os registros salvos no banco de dados MySQL.

ID: RF04 - Excluir Registro

O sistema deve permitir que o usuário remova um item da sua lista de favoritos.

- Requisitos Não Funcionais

Linguagem: Java 17+.

Banco de Dados: MySQL 8.0.

API Externa: CoinGecko (REST API).

Biblioteca de JSON: GSON da Google.

IDE Recomendada: VS Code.

Modelagem de Dados

O sistema utilizará uma tabela única chamada favoritos:

id (INT, Primary Key, Auto-increment)

nome_moeda (VARCHAR)

preco_brl (DECIMAL 18,2)

data_registro (TIMESTAMP)


- Tecnologias Utilizadas

Java HTTP Client: Para realizar as requisições à API.

JDBC: Para a conexão com o banco de dados.

GSON: Para converter a resposta da API (JSON) em objetos Java.

