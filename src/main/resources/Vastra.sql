--Creating the database
Create database vastra_db;

--using the database
use  vastra_db;

--Creating the table
create table vastra(
id int primary key AUTO_INCREMENT,
name varchar(50),
category varchar(50),
brand varchar(50),
price varchar(50),
size varchar(50));

--checking the database
select * from vastra;

--Describing the database
DESCRIBE vastra;