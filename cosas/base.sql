drop database if exists CadenaSuministro;
create database CadenaSuministro;
use CadenaSuministro;

create table mercado(
codigoID int auto_increment,
nombre varchar(45) not null,
codigoIDCamion int not null,
totalPagadoAFabricasPorMes varchar(10),
ultimoMesDePago varchar(45) not null,
primary key(codigoID,nombre,codigoIDCamion,totalPagadoAFabricasPorMes,ultimoMesDePago)
);
create table asalariadomercado(
codigoID int auto_increment primary key,
codigoIDMercado int not null,
nombre varchar(45) not null,
apellido varchar(45) not null,
dni varchar (8),
turno varchar (45) not null
);
create table camiontransporte(
codigoID int auto_increment,
numeroCamion int(5) not null,
nombreChofer varchar(45) not null,
apellidoChofer varchar(45) not null,
dniChofer varchar (8),
enCarretera varchar(2),
primary key(codigoID,numeroCamion,nombreChofer,apellidoChofer,dniChofer,enCarretera)
);
create table fabrica(
codigoID int auto_increment primary key,
codigoIDCamion int not null,
nombreFabrica varchar(45) not null,
especializacion varchar (45) not null,
listoParaEnviar varchar(2),
mesDeEnvio varchar(45) not null
);

alter table mercado 
 add constraint foreign key (codigoIDCamion) references camiontransporte(codigoID);
alter table fabrica
 add constraint foreign key (codigoIDCamion) references camiontransporte(codigoID);
alter table asalariadomercado
 add constraint foreign key (codigoIDMercado) references mercado(codigoID);

 


show tables;
describe fabrica;
describe camiontransporte;