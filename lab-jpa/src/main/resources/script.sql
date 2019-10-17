create table departamento
(
    dnome   text    not null,
    dnumero integer not null
        constraint departamento_pkey
            primary key
);

alter table departamento
    owner to postgres;

create table funcionario
(
    pnome           text        not null,
    minicial        text,
    unome           text        not null,
    cpf             varchar(11) not null
        constraint funcionario_pkey
            primary key,
    datanasc        date,
    endereco        text,
    sexo            text,
    salario         double precision default 0,
    dnr             integer
        constraint numerodepto
            references departamento,
    dnumero_dnumero integer
        constraint dnr_fk
            references departamento
);

alter table funcionario
    owner to postgres;




