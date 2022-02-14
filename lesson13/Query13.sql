use superheroes;
select * from heroes;
select originalName, nickname from heroes;

-- перейменування таблички heroes в h (працює тільки для селекту, сама назва таблиці не міняється)
select h.originalName, h.nickname from heroes h;

-- перейменування стовпчика originalName в heroName (працює тільки для селекту, сама назва таблиці не міняється)
select h.originalName as heroName, h.nickname from heroes h;

-- вибираємо з усієї таблиці heroes де originalName у нас є 'Peter Parker'
select * from heroes where originalName = 'Peter Parker';

-- вибираємо всі значення з таблиці heroes де у нас поле is_bad = true
select * from heroes where is_bad = true;

-- вибираємо всі значення з таблиці heroes де у нас поле originalName не дорівнює 'Thanos' (повернуться всі окрім 'Thanos')
select * from heroes where originalName <> 'Thanos';

-- вибираємо всі значення з таблиці weapon де у нас поле damage відповідає умові після where
select * from weapon where damage >= 1000 and damage <= 2000;

-- вибираємо всі значення з таблиці weapon де у нас поле damage відповідає умові після where 
select * from weapon where damage between 1000 and 2000;

-- вибираємо всі значення з таблиці weapon де у нас поле damage відповідає умові після where які відповідають Sui (% - 
-- будь яка кількість символів перед Sui та після
select * from weapon where weaponName like '%Sui%';

select * from weapon;
-- поверне всі записи з таблиці weapon де у нас в будьякомі місці зустрічається 'i'
select * from weapon where weaponName like '%i%';

-- СабСелект вибираємо зброю де в нас nickname = 'Spider Man' (Спочатку виконується сабСелект вираз котрий в дужках)
select * from weapon where heroId = (select id from heroes where nickname = 'Spider Man');

-- додаємо в табличку ще одного героя, але без зброї
insert into heroes(originalName, nickname, dateOfBirth, is_bad) values
('Panter', 'Black Panter', '2006-01-01', false);

select * from heroes h join weapon w on h.id = w.heroId;
insert into weapon(weaponName, damage) values
('Panter Suit', 10000);

-- різні варіанти операції join
select * from heroes h join weapon w on h.id = w.heroId;
select * from heroes h left join weapon w on h.id = w.heroId;
select * from heroes h right join weapon w on h.id = w.heroId;

-- join з умовою котра написана після where
select * from heroes h join weapon w on h.id = w.heroId
where w.damage >= 1000;

-- 
select * from heroes h 
	join hero_to_film htf on h.id = htf.heroId
	join film f on f.id = htf.filmId;

-- всі герої та всі фільми
select h.originalName, h.nickname, f.nameOfFilm from heroes h 
	join hero_to_film htf on h.id = htf.heroId
    join film f on f.id = htf.filmId;
    
-- сума по столбцю damage
select sum(damage) from weapon;
-- кількість рядків в нашій таблиці
select count(id) from weapon;
-- середнє значення по столбцю damage
select avg(damage) from weapon;
-- максимальне значення по столбцю damage
select max(damage) from weapon;
-- мінімальне значення по столбцю damage
select min(damage) from weapon;
