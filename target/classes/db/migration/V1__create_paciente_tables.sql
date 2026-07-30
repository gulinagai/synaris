CREATE TABLE paciente (
                          id BIGINT NOT NULL AUTO_INCREMENT,
                          nome VARCHAR(150) NOT NULL,
                          cpf CHAR(11) NOT NULL,
                          email VARCHAR(255) NOT NULL,
                          data_nascimento DATE NOT NULL,
                          sexo CHAR(1) NOT NULL,
                          criado_em TIMESTAMP NOT NULL,
                          atualizado_em TIMESTAMP NOT NULL,

                          PRIMARY KEY (id),
                          UNIQUE (cpf),
                          UNIQUE (email)
);

CREATE TABLE telefone (
                          id BIGINT NOT NULL AUTO_INCREMENT,
                          paciente_id BIGINT NOT NULL,
                          numero VARCHAR(20) NOT NULL,

                          PRIMARY KEY (id),

                          CONSTRAINT fk_telefone_paciente
                              FOREIGN KEY (paciente_id)
                                  REFERENCES paciente(id)
);