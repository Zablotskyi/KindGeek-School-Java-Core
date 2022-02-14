drop database superheroes;
create database superheroes;
use superheroes;
set charset utf8;

create	table heroes(
id int auto_increment primary key,
originalName varchar(255),
nickname varchar(255),
dateOfBirth date,
is_bad boolean
);

insert into heroes(originalName, nickname, dateOfBirth, is_bad) values
('Peter Parker', 'Spider man', '1986-07-24', false),
('Tony Stark', 'Iron Man', curdate(), false),
('Thanos', 'Thanos', '1900-01-01', true);

create table weapon(
id int auto_increment primary key,
weaponName varchar(255),
damage int,
heroId int
);

alter table weapon add constraint foreign key(heroId) references heroes(id);

insert into weapon(weaponName, damage, heroId) values
('Iron Suit', 1000, 2),
('Spider web', 850, 1),
('Metten', 50000, 3);

# error. worong foreign key
#insert into weapon(weaponName, damage, heroId) values
#('new weapon', 1000000, 5);

create table film(
id int auto_increment primary key,
nameOfFilm varchar(300),
yearStart date
);

create table hero_to_film(
heroId int,
filmId int
);

alter table hero_to_film add constraint foreign key(heroId) references heroes(id);
alter table hero_to_film add constraint foreign key(filmId) references film(id);

insert into film(nameOfFilm, yearStart) values
('Iron Man', '2008-01-01'),
('Avengers', '2010-01-01'),
('Avengers 2', '2012-01-01'),
('Spider man', '2018-01-01');

insert into hero_to_film(heroId, filmId) values
(1, 4),
(1, 2),
(1, 3),
(2, 1),
(2, 2),
(2, 3),
(2, 4);