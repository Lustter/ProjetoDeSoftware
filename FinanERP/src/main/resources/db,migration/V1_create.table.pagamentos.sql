CREATE TABLE pagamentos(
    id int auto_increment primary key,
    tipo varchar(100) not null,
    nomeCliente varchar(100) not null,
    valor double not null,
    descricao varchar(255) not null,
    dataPagamento date not null
);
