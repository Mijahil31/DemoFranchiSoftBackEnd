DROP TABLE IF EXISTS cliente;

CREATE TABLE cliente(
	id int auto_increment,
	nombre varchar(50),
	apellido varchar(50),
	direccion varchar(250),
	dni varchar(10),
	fecha date
);

INSERT INTO cliente(nombre, apellido, direccion, dni, fecha) VALUES ('Mijahil', 'Franchi', 'Venezuela', 'dni', '1995-03-31');