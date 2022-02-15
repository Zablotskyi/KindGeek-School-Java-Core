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

-- всі автори
select * from authors;
-- всі книги
select * from books;
-- книги після 2010 року випуску 
select * from books where yearOfPrinting > 2010;
-- книги з 2005 по 2011 рік випуску
select * from books where yearOfPrinting > 2005 and yearOfPrinting < 2011;
-- книги котрі містять у назві слово Java
select * from books where name like '%Java%';
-- всі автори по алфавіту
select * from authors order by name asc;
-- всі книги по року випуску
select * from books order by yearOfPrinting desc;
-- знайти автора
select * from authors where name like 'Gary' and lastName like 'Gregory';
-- знайти книгу
select * from books where name like 'Java Concurrency in Practice';
-- всі книги де немає слова Java
select * from books where name <> 'Java'; -- ??????????
-- скільки книг у автора Gary Gregory
-- -------------------------------------------------------------------------------
-- скільки всого авторів у базі
select count(id) from authors;
-- скільки всього книг у базі
select count(id) from books;
-- найстаріша книга у базі
select * from books order by yearOfPrinting limit 1;
-- нові книги (2020 рік)
select * from books where yearOfPrinting = 2020;
-- показати перших трьох авторів
select * from authors limit 2;

-- всі книги автора
-- автори у котрих немає книг у базі
select * from authors a left join books b on a.id = b.id where b.name = null;
-- автор котрий написав найстарішу книгу у базі
-- join
select * from authors a join books b on a.id = b.id;
-- left join
select * from authors a left join books b on a.id = b.id;
-- right join
select * from authors a right join books b on a.id = b.id;
-- автори котрі писали книги після 2015 року
-- автори котри писали книги по Java
-- автори нових книг
-- всі автори та всі книги
