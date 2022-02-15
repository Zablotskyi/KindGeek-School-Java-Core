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

create table authorToBook(
idAuthor int,
idBook int
);

insert into authors (name, lastName) values
('Christian', 'Bauer'),
('Gavin', 'King'),
('Gary', 'Gregory'),
('Bruce', 'Eckel'),
('Brain', 'Goetz'),
('Tim', 'Peierls'),
('Joshua', 'Bloch'),
('Joseph', 'Bowbeer'),
('David', 'Holmes'),
('Doug', 'Lea'),
('Raoul-Gabriel', 'Urma'),
('Mario', 'Fusco'),
('Alan', 'Mycroft'),
('Scott', 'Oaks');

insert into books(name, yearOfPrinting) values
('Java Persistence with Hibernate. 2-end edition', '2016'),
('Thinking in Java (4th Edition)', '2006'),
('Java Concurrency in Practice', '2006'),
('Effective Java. 3rd Edition', '2018'),
('Java 8 in Action. Lambdas, Streams, and functional-style programming', '2015'),
('Java Performance: In-Depth Advice for Tuning and Programming Java 8', '2020'),
('Java Performance: The Definitive Guide: Getting the Most Out of Your Code 1st Edition', '2014');

alter table authorToBook add constraint foreign key(idAuthor) references authors(id);
alter table authorToBook add constraint foreign key(idBook) references books(id);

insert into authorToBook(idAuthor, idBook) values
(1, 1),
(2, 2),
(3, 3),
(3, 4),
(1, 5),
(4, 6),
(4, 7);

