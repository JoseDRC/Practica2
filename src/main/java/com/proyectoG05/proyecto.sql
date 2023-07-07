/*Se crea la base de datos */
drop schema if exists usuarios;
drop user if exists usuario_proyecto;
CREATE SCHEMA usuarios ;

create user 'usuario_proyecto'@'%' identified by 'la_Clave';

grant all privileges on usuarios.* to 'usuario_proyecto'@'%';
flush privileges;

create table usuarios.usuarios (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(30) NOT NULL,
  apellido VARCHAR(30),
  email VARCHAR(30) NOT NULL,
  contrasena VARCHAR(30),
  roles VARCHAR(30),
  PRIMARY KEY (id_usuario))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table usuarios.rol (
  id_rol INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(30) NOT NULL,
  PRIMARY KEY (id_rol))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table usuarios.roles_usuario (
  usuario_id INT,
  rol_id INT)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table usuarios.tiquetes (
  id_tiquete INT NOT NULL AUTO_INCREMENT,
  titulo VARCHAR(30) NOT NULL,
  descripcion VARCHAR(256),
  estado VARCHAR(30) NOT NULL,
  edad INT,
  PRIMARY KEY (id_tiquete))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;