CREATE TABLE produto (
    ID produto SERIAL PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    quantidade INT,
    preco NUMERIC
    );