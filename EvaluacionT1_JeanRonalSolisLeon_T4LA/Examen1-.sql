create database bd_medicamentos;
use bd_medicamentos

 create table Medicamentos 
 (
 idMedicamento int not null,
 nombre varchar (255) not null,
 descripcion text not null,
 categoria varchar (50) not null,
 precio decimal not null,
 stock int not null,
 fechavencimiento date not null,
 proveedor varchar (100) not null
 )

insert into Medicamentos values
    (1,'Paracetamol','Analgesico comun','Analgesico',5,'100','2024-12-31','Generico Pharma')
insert into Medicamentos values
    (2,'Amoxicilina','Antibiotico','Antibiotico',10.5,'50','2023-11-15','Farmacia A')
insert into Medicamentos values
    (3,'Vitamina C','Suplemento Vitaminico','Vitaminas',8.75,'75','2024-08-01','Proveedor B')
insert into Medicamentos values
    (4,'Ibuprofeno','Antiflamatorio','Analgesico',6.25,'60','2023-10-20','Generico Pharma')
insert into Medicamentos values
    (5,'Omeprazol','Medicamento GI','GI',12.3,'40','2023-12-10','Farmacia A')