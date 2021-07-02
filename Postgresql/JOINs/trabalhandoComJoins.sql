SELECT count(1) FROM banco;  --contar numero de registros que ele vai retornar= 251--
SELECT count(1) FROM agencia; --296--

SELECT banco.numero, banco.nome, agencia.numero, agencia.nome_agencia 
FROM banco 
JOIN agencia ON agencia.banco_numero = banco.numero; --agencias que possuem bancos=296--

SELECT count (distinct banco.numero)
FROM banco 
JOIN agencia ON agencia.banco_numero = banco.numero;

SELECT banco.numero, banco.nome, agencia.numero, agencia.nome_agencia
FROM banco 
LEFT JOIN agencia
ON agencia.banco_numero = banco.numero;

SELECT agencia.numero, agencia.nome_agencia, banco.numero, banco.nome
FROM agencia
LEFT JOIN banco ON banco.numero=agencia.banco_numero;

SELECT banco.numero, banco.nome, agencia.numero, agencia.nome_agencia 
FROM banco 
FULL JOIN agencia ON banco.numero= agencia.banco_numero;

CREATE TABLE IF NOT EXISTS teste_a (
	id serial PRIMARY KEY, 
	valor varchar(10)
);
CREATE TABLE IF NOT EXISTS teste_b (
	id serial PRIMARY KEY, 
	valor varchar(10)
);

INSERT INTO teste_a (valor) VALUES ('teste1');
INSERT INTO teste_a (valor) VALUES ('teste2');
INSERT INTO teste_a (valor) VALUES ('teste3');
INSERT INTO teste_a (valor) VALUES ('teste4');

INSERT INTO teste_b (valor) VALUES ('teste_a');
INSERT INTO teste_b (valor) VALUES ('teste_b');
INSERT INTO teste_b (valor) VALUES ('teste_c');
INSERT INTO teste_b (valor) VALUES ('teste_d');

SELECT tbla.valor, tblb.valor
FROM teste_a  tbla
CROSS JOIN teste_b tblb; 

DROP TABLE IF EXISTS teste_a; DROP TABLE IF EXISTS teste_b;

SELECT banco.nome, agencia.nome_agencia, 
	conta_corrente.numero, 
	conta_corrente.digito, cliente.nome
FROM banco 
JOIN agencia ON agencia.banco_numero=banco.numero 
JOIN conta_corrente ON conta_corrente.banco_numero = agencia.banco_numero --ou = banco.numero--
	AND conta_corrente.agencia_numero = agencia.numero
JOIN cliente ON cliente.numero =  conta_corrente.cliente_numero;
	
	
SELECT banco.nome, agencia.nome_agencia, 
	conta_corrente.numero, 
	conta_corrente.digito, cliente.nome,
	tipo_transacao.nome,
	cliente_transacoes.valor
FROM banco 
JOIN agencia ON agencia.banco_numero=banco.numero 
JOIN conta_corrente ON conta_corrente.banco_numero = agencia.banco_numero --ou = banco.numero--
	AND conta_corrente.agencia_numero = agencia.numero
JOIN cliente ON cliente.numero =  conta_corrente.cliente_numero
JOIN cliente_transacoes ON  banco.numero = cliente_transacoes.banco_numero 
JOIN tipo_transacao ON cliente_transacoes.tipo_transacao_id = tipo_transacao.id;	
