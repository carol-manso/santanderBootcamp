SELECT numero, nome FROM banco;
SELECT banco_numero, numero, nome_agencia FROM agencia;
SELECT numero, nome, email FROM cliente;
SELECT banco_numero, agencia_numero, cliente_numero FROM cliente_transacoes;
SELECT * FROM conta_corrente;
SELECT * FROM information_schema.columns WHERE table_name='agencia';
SELECT column_name, data_type FROM information_schema.columns WHERE table_name='agencia';
--=================Trbalhando com funções=================================================--
SELECT AVG (valor) FROM cliente_transacoes WHERE valor <= 300;
SELECT COUNT (numero) FROM cliente;
SELECT COUNT (numero), email FROM cliente WHERE email ILIKE '%gmail.com'
GROUP BY email;
SELECT MAX (valor), tipo_transacao_id FROM cliente_transacoes GROUP BY tipo_transacao_id; 
SELECT MIN (valor) , tipo_transacao_id FROM cliente_transacoes GROUP BY tipo_transacao_id; 
SELECT COUNT(id), tipo_transacao_id FROM cliente_transacoes GROUP BY tipo_transacao_id
HAVING COUNT(id) >150; 
SELECT SUM(valor) FROM cliente_transacoes; 
SELECT SUM(valor), tipo_transacao_id FROM cliente_transacoes 
GROUP BY tipo_transacao_id
ORDER BY sum ASC; 
SELECT SUM(valor), tipo_transacao_id FROM cliente_transacoes 
GROUP BY tipo_transacao_id
ORDER BY tipo_transacao_id DESC; 