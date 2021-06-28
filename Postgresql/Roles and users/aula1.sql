	--- ROLES, USERS --
CREATE ROLE professores NOCREATEDB NOCREATEROLE INHERIT NOLOGIN NOBYPASSRLS CONNECTION LIMIT 10;
ALTER ROLE professores PASSWORD '123'; 
CREATE ROLE Cintia LOGIN PASSWORD '123'; 
--Excluindo a role cintia e recriando com outras configurações--
DROP ROLE cintia;
CREATE ROLE Cintia LOGIN PASSWORD '123' IN ROLE professores; --Cintia faz parte da role professores--
DROP ROLE Cintia; 
CREATE --ROLE Cintia LOGIN PASSWORD '123' ROLE professores; Agora, professores faz parte de Cintia--
DROP ROLE Cintia; 
--Trabalhando com revoke e grant--
CREATE TABLE teste (nome varchar); 
GRANT ALL ON TABLE teste to professores; 
CREATE ROLE Cintia LOGIN PASSWORD '123'; 
DROP ROLE Cintia; 
CREATE ROLE Cintia INHERIT LOGIN PASSWORD '123' IN ROLE professores;
REVOKE professores FROM cintia;

