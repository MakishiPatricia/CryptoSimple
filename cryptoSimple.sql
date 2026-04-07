CREATE DATABASE IF NOT EXISTS cryptoSimple;
use cryptoSimple;

create table favoritos(
    id int primary key auto_increment,
    nome_moeda varchar(50) not null,
    preco_atual decimal(20, 2) not null,
    data_registro timestamp DEFAULT CURRENT_TIMESTAMP /* O uso do DEFAULT CURRENT_TIMESTAMP é importante  para preencher automaticamente uma coluna com a data e hora atuais no momento da inserção (INSERT) de um novo registro */

);