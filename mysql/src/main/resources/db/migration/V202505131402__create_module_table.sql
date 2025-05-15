CREATE TABLE modules(
    id BIGINT not null auto_increment,
    nome VARCHAR(150) not null,
    PRIMARY KEY (id)
) engine=innoDB default charset=utf8;