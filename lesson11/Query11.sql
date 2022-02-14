create database superheroes;
use superheroes;
set charset utf8;

create	table heroes(
id int auto_increment primary key,
originalName varchar(255),
nickName varchar(255),
dateOfBirth date,
is_bad boolean
);

insert into heroes(originalName, nickName, dateOfBirth, is_bad) values
('Peter Parker', 'Spider man', '1986-07-24', false),
('Tony Stark', 'Iron Man', curdate(), false),
('Thanos', 'Thanos', '1900-01-01', true);