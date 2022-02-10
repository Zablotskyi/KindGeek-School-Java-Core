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

create table author_to_book(
id_author int,
id_book int
);

alter table author_to_book add constraint foreign key(id_author) references authors(id);
alter table author_to_book add constraint foreign key(id_book) references books(id);


