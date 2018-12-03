
use miranda;

show tables;

select * from reserva;
select * from cliente;
select * from destino;
desc reserva;
desc cliente;

insert into cliente (cli_dni, cli_nombre, cli_apellido, cli_razon_social)
values (23456898, 'Julio Mario', 'Saavedra Polo', 'Familiar');


insert into reserva (res_id, cli_id, des_id, precio, res_asiento, res_fecha, res_fecha_reserva, res_hora)
values ('R005', 1, 4, 1200, 6, sysdate(), '2019-03-18', '12:00 p.m');

alter table reserva modify res_id int (5) auto_increment;