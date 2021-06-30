CREATE TABLE IF NOT EXISTS emprestimo (
		id SERIAL PRIMARY KEY,
		valor NUMERIC(25, 2) NOT NULL, 
		cliente_numero BIGINT NOT NULL,
		agencia_numero INTEGER NOT NULL,
		banco_numero INTEGER NOT NULL, 
		porcentagem_juros DOUBLE PRECISION, 
		data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
		FOREIGN KEY (cliente_numero) REFERENCES cliente (numero),
		FOREIGN KEY (agencia_numero, banco_numero) REFERENCES agencia (numero, banco_numero)
);
	
--DROP TABLE IF EXISTS emprestimo;--
INSERT INTO emprestimo (id, valor, porcentagem_juros, cliente_numero, agencia_numero, banco_numero) VALUES (1,500000,2.1,205,2,33) ON CONFLICT (id) DO NOTHING;
UPDATE emprestimo SET valor = 300.000 WHERE cliente_numero=205 ;
SELECT * FROM emprestimo;