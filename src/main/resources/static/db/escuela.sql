/*

	Script de creación de las tablas sobre el esquema Escuela

*/

CREATE TABLE TB_PROFESOR (
	id VARCHAR(36) NOT NULL,
	nif VARCHAR(9) NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	primerApellido VARCHAR(50) NOT NULL,
	segundoApellido VARCHAR(50),
	fechaAlta DATE NOT NULL DEFAULT CURRENT_DATE,
	fechaBaja TIMESTAMP,
	fechaNacimiento DATE,
	PRIMARY KEY (id)	
);

CREATE TABLE TB_ASIGNATURA (
	id VARCHAR(36) NOT NULL,
	nombre VARCHAR(100) NOT NULL UNIQUE,
	descripcion VARCHAR(500),
	PRIMARY KEY(id)
);

CREATE TABLE TB_PROFESOR_ASIGNATURA (
	id_profesor VARCHAR(36) NOT NULL,
	id_asignatura VARCHAR(36) NOT NULL,
	PRIMARY KEY (id_profesor, id_asignatura),
	CONSTRAINT fk_id_profesor FOREIGN KEY(id_profesor) REFERENCES TB_PROFESOR(id),
	CONSTRAINT fk_id_asignatura FOREIGN KEY(id_asignatura) REFERENCES TB_ASIGNATURA(id)
);