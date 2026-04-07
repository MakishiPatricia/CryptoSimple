# 🪙 CryptoSimple

O **CryptoSimple** é um projeto de estudo desenvolvido em Java para praticar o consumo de APIs externas e a persistência de dados em bancos de dados relacionais (MySQL). A aplicação realiza a captura da cotação atual do Bitcoin e permite o armazenamento desses dados para consulta.

---

## 🎯 Requisitos Funcionais
* **ID: RF01 - Consultar Preços:** O sistema busca o preço atualizado do Bitcoin (BTC) em Reais (BRL) via **AwesomeAPI**.
* **ID: RF02 - Salvar Favorito:** O sistema permite salvar o preço atual capturado no banco de dados.
* **ID: RF03 - Listar Histórico:** O sistema exibe os registros salvos no banco de dados MySQL.


## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java 17+ (JDK 23)
* **Biblioteca de JSON:** GSON da Google
* **Banco de Dados:** MySQL 8.0
* **Java HTTP Client:** Para realizar as requisições à API.
* **JDBC:** Para a conexão e persistência com o banco de dados.

## 🗄️ Modelagem de Dados
O sistema utiliza uma tabela chamada `favoritos`:
* `id`: (INT, Primary Key, Auto-increment)
* `nome_moeda`: (VARCHAR)
* `preco_atual`: (DECIMAL 20,2)
* `data_registro`: (TIMESTAMP)

---
*Projeto desenvolvido como parte do meu portfólio de estudos em Análise e Desenvolvimento de Sistemas (ADS).*
