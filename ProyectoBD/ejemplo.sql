create database Empleados
go

use Empleados
go

CREATE TABLE empleados (
IDEMPLEADO INT PRIMARY KEY NOT NULL,
NOMBRE VARCHAR(35) NOT NULL,
APPAT VARCHAR(35) NOT NULL,
APMAT VARCHAR(35) NOT NULL,
DIREC VARCHAR(35) NOT NULL,
SUELDO decimal(18,2) NOT NULL,
EDAD int NOT NULL,
FECNAC date NOT NULL,
DULCERIA VARCHAR(35) NOT NULL)
go

----------------------------------------------------
CREATE TABLE empleados (
IDEMPLEADO INT PRIMARY KEY IDENTITY NOT NULL,
NOMBRE VARCHAR(35) NOT NULL,
APPAT VARCHAR(35) NOT NULL,
APMAT VARCHAR(35) NOT NULL,
DIREC VARCHAR(35) NOT NULL,
SUELDO decimal(18,2) NOT NULL,
EDAD int NOT NULL,
FECNAC date NOT NULL,
DULCERIA VARCHAR(35) NOT NULL,)
go

drop table empleados
go 

delete empleados 
delete from empleados where IDEMPLEADO =2

insert into empleados values('Karla','Garcia','Gonzalez','Epitacio',1500.12,21,'2015-12-12','DULCERIAJJ')
go

insert into empleados values('Jose Juan' , 'Garcia' , 'Anaya' , 'Cuautitlan' , '25072021' , '20' , '2000-12-22','DULCERIAJJ')
go


select * from empleados
go

select * from empleados Where idempleado= 1 and appat='Garcia' and apmat='Gonzalez' and fecnac='2015-12-12'

select * from empleados Where nombre='Karla' and appat='Garcia' and apmat='Gonzalez' and fecnac='2015-12-12'
GO

delete from empleados Where idempleado= 9
GO
-------------------------------------------------------
DROP TABLE USUARIOS

CREATE TABLE USUARIOS (
IDUSUARIOS VARCHAR(15) PRIMARY KEY NOT NULL,
IDEMPLEADO INT NOT NULL,
NOMBRE VARCHAR(35) NOT NULL,
CONTRA VARCHAR(35) NOT NULL,
FECVENTO DATE NOT NULL,
ESTATUS VARCHAR(1) NOT NULL,
CONSTRAINT fk_USUARIOEMPLEADOS FOREIGN KEY (IDEMPLEADO) REFERENCES empleados (IDEMPLEADO))
go

delete USUARIOS

insert into USUARIOS values('karla27',1,'karla','1234','2022-10-09','S')

insert into USUARIOS values('jj22',2,'jj','1234','2020-10-09','S')

delete from usuarios where IDEMPLEADO =2

select * from usuarios
where IDUSUARIOS='jj22' OR CONTRA=''

select * from empleados Where idempleado='' OR IDUSUARIOS='jj22'

update usuarios set  IDUsuarios='root',NOMBRE='adminitracion',CONTRA='1234',FECVENTO='2022-12-12',ESTATUS='N' Where IDEMPLEADO='7'

 go