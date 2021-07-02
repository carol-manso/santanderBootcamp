CREATE TABLE IF NOT EXISTS funcionarios(
	id SERIAL, 
	nome VARCHAR(50), 
	gerente INTEGER, 
	PRIMARY KEY(id), 
	FOREIGN KEY (gerente) REFERENCES funcionarios(id)
); --RECURSIVE--

INSERT INTO funcionarios (nome, gerente) VALUES ('Carla', null);
INSERT INTO funcionarios (nome, gerente) VALUES ('Ricardo', 1);
INSERT INTO funcionarios (nome, gerente) VALUES ('Débora', 1);
INSERT INTO funcionarios (nome, gerente) VALUES ('Gabriel', 2);
INSERT INTO funcionarios (nome, gerente) VALUES ('Wilson', 4);

SELECT id, nome, gerente FROM funcionarios WHERE gerente IS null
UNION ALL 
SELECT id, nome, gerente FROM funcionarios WHERE id = 255; --por conta do union all traz a info- apenas exemplo--

CREATE OR REPLACE RECURSIVE VIEW vw_func (id,gerente,funcionario) AS (
	SELECT id, gerente, nome 
	FROM funcionarios 
	WHERE gerente IS null
	
	UNION ALL
	
	SELECT funcionarios.id, funcionarios.gerente, funcionarios.nome
	FROM funcionarios
	JOIN vw_func ON vw_func.id = funcionarios.gerente
);


--primeira vez da consulta- resultado nulo. Nas próximas, entra em um loop e se chama até acabar as opções--
SELECT id, gerente, funcionario
FROM vw_func; 





