CREATE TABLE projeto (
nome_Projeto VARCHAR(20) PRIMARY KEY
);

CREATE TABLE pessoa (
nome_Pessoa VARCHAR(20) PRIMARY KEY,
e_mail VARCHAR(20),
nome_Tarefa VARCHAR(20)
);

CREATE TABLE requer (
nome_tarefa VARCHAR(20),
tarefa_requerida VARCHAR(20),
PRIMARY KEY(nome_tarefa,tarefa_requerida)
);

CREATE TABLE tarefa (
nome_Projeto VARCHAR(20),
nome_Tarefa VARCHAR(20) PRIMARY KEY,
estado VARCHAR(20),
data_inicio TIMESTAMP,
data_fim TIMESTAMP,
percentual_de_andamento INTEGER,
duracao_esperada INTEGER
);

ALTER TABLE tarefa ADD FOREIGN KEY(nome_Projeto) REFERENCES projeto (nome_Projeto);
ALTER TABLE pessoa ADD FOREIGN KEY(nome_Tarefa) REFERENCES tarefa (nome_Tarefa);
ALTER TABLE requer ADD FOREIGN KEY(nome_tarefa) REFERENCES tarefa (nome_Tarefa);
ALTER TABLE requer ADD FOREIGN KEY(tarefa_requerida) REFERENCES tarefa (nome_Tarefa);
