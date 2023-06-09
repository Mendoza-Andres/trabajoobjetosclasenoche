drop database if exists CadenaSuministro;
create database CadenaSuministro;
use CadenaSuministro;
create table Mercado(
CodigoMercado varchar(15),
NombreLocal varchar(45) not null,
TotalPagadoAFabricasPorMes varchar(10),
UltimoMesDePago varchar(45) not null
);
create table AsalariadoMercado(
CodigoTrabajador varchar(15),
Nombre varchar(45) not null,
Apellido varchar(45) not null,
DNI varchar (8),
Turno varchar (45) not null
);
create table CamionTransporte(
CodigoCamionero varchar(15),
Nombre varchar(45) not null,
Apellido varchar(45) not null,
DNI varchar (8),
EnCarretera varchar(2)
);
create table Fabrica(
CodigoFabrica varchar(15),
nombreFabrica varchar(45) not null,
especializacion varchar (45) not null,
ListoParaEntregar varchar(2),
MesDeEntrega varchar(45) not null
);


insert into Mercado values(1234567890,'mercado en las afureas de la ciudad',8000000,'marzo');
insert into Mercado values(1231231231,'mercado en las afueras de la capital',10000000,'abril');
insert into Mercado values(1111112222,'mercado de barrio capital',15000000,'marzo');
insert into Mercado values(2363155560,'mercado de barrio ciudad',9000000,'abril');
insert into Mercado values(0000000001,'mercado central de capital',600500000,'marzo');

insert into AsalariadoMercado values(0987654321,'Jose','Martinez',46732941,'mañana');
insert into AsalariadoMercado values(2356784221,'Juan','Duranzo',84325572,'mañana');
insert into AsalariadoMercado values(2346876427,'Roberto','Roca',73563633,'tarde');
insert into AsalariadoMercado values(2222443286,'Esteban','Bautista',95643394,'noche');
insert into AsalariadoMercado values(8990600965,'Laura','marivella',89233155,'tarde');

insert into CamionTransporte values(0011705962,'Adryan','Hernán',95334653,'si');
insert into CamionTransporte values(0058635503,'Lucas','Enzo',65347751,'si');
insert into CamionTransporte values(0005905678,'León','Valentino',58445739,'no');
insert into CamionTransporte values(0904286800,'Samuel','Sebastián',95768334,'no');
insert into CamionTransporte values(0714236700,'Aiden','Santiago',46778940,'no');

insert into Fabrica values(0712136700,'fabrica general de enlatados','comida enlatada','si','abril');
insert into Fabrica values(0957953893,'carniceria nacional','carnes curadas','si','abril');
insert into Fabrica values(0046755827,'bebidas de importe','vinos y liquores','no','marzo');
insert into Fabrica values(0855235162,'comida refrigerada S.A.','comida congelada','no','marzo');
insert into Fabrica values(0179195185,'lecheria regional','lacteos','si','abril');

show tables;
describe mercado;
select * from mercado;
describe asalariadomercado;
select * from asalariadomercado;
describe camiontransporte;
select * from camiontransporte;
describe fabrica;
select * from fabrica;