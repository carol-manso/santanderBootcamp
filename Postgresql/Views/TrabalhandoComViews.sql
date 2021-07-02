SELECT numero, nome, ativo 
FROM banco;
CREATE OR REPLACE VIEW vw_bancos AS (
	SELECT numero, nome, ativo 
	FROM banco
);

SELECT numero, nome, ativo 
FROM  vw_bancos;

CREATE OR REPLACE VIEW vw_bancos_2 (banco_numero,banco_nome,banco_ativo) AS (
	SELECT numero, nome, ativo 
	FROM banco
);

SELECT banco_numero, banco_nome, banco_ativo 
FROM vw_bancos_2;

INSERT INTO vw_bancos_2 (banco_numero, banco_nome, banco_ativo)
VALUES (57, 'Banco Pegasus', TRUE); 

SELECT banco_numero, banco_nome, banco_ativo FROM vw_bancos_2 
WHERE banco_numero=57;
SELECT numero, nome, ativo FROM banco WHERE numero=57; ---banco existe e foi criado por meio da view-

UPDATE vw_bancos_2 SET banco_ativo = FALSE WHERE banco_numero=57;

DELETE FROM vw_bancos_2 WHERE banco_numero = 57; 

CREATE OR REPLACE TEMPORARY VIEW vw_agencia (nome) AS (
	SELECT nome_agencia FROM agencia
);
SELECT nome FROM vw_agencia;

CREATE OR REPLACE VIEW vw_bancos_ativos AS (
	SELECT numero, nome, ativo
	FROM banco 
	WHERE ativo IS TRUE
);

INSERT INTO vw_bancos_ativos (numero, nome, ativo) VALUES (58, 'Banco Pegasus', FALSE);

CREATE OR REPLACE VIEW vw_bancos_com_a AS (
	SELECT numero, nome, ativo
	FROM vw_bancos_ativos
	WHERE nome ILIKE 'a%'
)WITH CASCADED CHECK OPTION;
SELECT numero, nome,ativo FROM vw_bancos_com_a;
INSERT INTO vw_bancos_com_a (numero, nome, ativo) VALUES (733, 'Afrodite', TRUE); 
INSERT INTO vw_bancos_com_a (numero, nome, ativo) VALUES (723, 'Persefone', TRUE); --ERROR--
INSERT INTO vw_bancos_com_a (numero, nome, ativo) VALUES (773, 'Ares', TRUE); 
INSERT INTO vw_bancos_com_a (numero, nome, ativo) VALUES (783, 'Atena', FALSE); 
INSERT INTO vw_bancos_com_a (numero, nome, ativo) VALUES (793, 'Apolo', FALSE); --ERROR- valida infos das 2 views com o CASCADED--







