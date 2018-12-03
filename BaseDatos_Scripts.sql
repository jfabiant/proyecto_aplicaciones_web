#Creacion base de datos:
create database miranda;

#Usando la base de datos:
use miranda;

#Creando la tabla cliente:
create table cliente (
	cli_id int(5) primary key AUTO_INCREMENT,
	cli_dni int(8),
	cli_nombre varchar(45),
	cli_apellido varchar(45),
	cli_razon_social varchar(255)
	
	);

#Creando la tabla destino:
create table destino (
	des_id int (5) primary key auto_increment,
	des_nombre varchar(45),
	des_precio double(10,2)
);

#Creando la tabla reserva:
create table reserva (
	res_id int(5) primary key auto_increment,
	cli_id int(5),
	des_id int(5),
	precio double,
	res_asiento int(2),
	res_hora varchar(45),
	res_fecha varchar(45),
	res_fecha_reserva varchar(45)
);

alter table reserva ADD FOREIGN KEY (cli_id) REFERENCES cliente(cli_id);
alter table reserva ADD FOREIGN KEY (des_id) REFERENCES destino(des_id);


