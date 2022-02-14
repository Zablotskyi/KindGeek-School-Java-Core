drop database authorsbooks;
create database authorsbooks;
use authorsbooks;
set charset utf8;

create table authors(
id int auto_increment primary key,
name varchar(100),
lastName varchar(100)
);

create table books(
id int auto_increment primary key,
name varchar(100),
yearOfPrinting int
);
