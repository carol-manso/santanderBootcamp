DROP TABLE IF EXISTS aluno;
DROP TABLE IF EXISTS estado;
CREATE TABLE IF NOT EXISTS estado(
	id SERIAL PRIMARY KEY, 
	nome VARCHAR(80), 
	sigla CHARACTER(2), 
	data_criacao  TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
	
);
CREATE TABLE IF NOT EXISTS aluno (
	id SERIAL PRIMARY KEY,
	nome VARCHAR(80),
	idade INTEGER, 	
	estado_id INTEGER, 
	FOREIGN KEY (estado_id) REFERENCES estado (id)
);
SELECT * FROM estado;
SELECT * FROM aluno;