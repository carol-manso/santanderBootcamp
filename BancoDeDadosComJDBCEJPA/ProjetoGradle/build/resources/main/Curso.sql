CREATE TABLE IF NOT EXISTS curso (
	id SERIAL PRIMARY KEY, 
	nome VARCHAR(80), 
	duracao_horas INTEGER, 
	data_criacao  TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	ativo BOOLEAN
);

INSERT INTO curso (nome, duracao_horas,ativo) VALUES ('Desenvolvimento WEB',120, TRUE );
INSERT INTO curso (nome, duracao_horas,ativo) VALUES ('Angular',60, TRUE );
INSERT INTO curso (nome, duracao_horas,ativo) VALUES ('JAva Development',150, TRUE ) ON CONFLICT(nome) DO NOTHING;

SELECT * FROM curso;


