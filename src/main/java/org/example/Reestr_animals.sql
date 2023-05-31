# Создать базу данных “Друзья человека”

CREATE DATABASE IF NOT EXISTS Друзья_человека;
USE Друзья_человека;

# Создать таблицы с иерархией из диаграммы в БД

CREATE TABLE IF NOT EXISTS Верблюды
(
	id INT,
	nickname VARCHAR(50),
	comands VARCHAR(50),
	birthday DATE
);


CREATE TABLE IF NOT EXISTS Лошади
(
	id INT,
	nickname VARCHAR(50),
	comands VARCHAR(50),
	birthday DATE
);

CREATE TABLE IF NOT EXISTS Ослы
(
	id INT,
	nickname VARCHAR(50),
	comands VARCHAR(50),
	birthday DATE
);

CREATE TABLE IF NOT EXISTS Собаки
(
	id INT,
	nickname VARCHAR(50),
	comands VARCHAR(50),
	birthday DATE
);

CREATE TABLE IF NOT EXISTS Кошки
(
	id INT,
	nickname VARCHAR(50),
	comands VARCHAR(50),
	birthday DATE
);

CREATE TABLE IF NOT EXISTS Хомячки
(
	id INT,
	nickname VARCHAR(50),
	comands VARCHAR(50),
	birthday DATE
);

# Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения

INSERT INTO Верблюды (id, nickname, comands, birthday)
VALUES(1, "Sandy", "sit", '01.08.2010'),
(2, "Amira", "stand", '12.12.2013'),
(3, "Ali", "walk", '23.05.2015'),
(4, "Adam", "run", '07.02.2012'),
(5, "Zara", "jump", '28.11.2017');

INSERT INTO Лошади (id, nickname, comands, birthday)
VALUES(6, "Eeyore", "sit", '01.08.2010'),
(7, "Donkey", "walk", '13.12.2013'),
(8, "Shrack", "pull", '24.05.2015'),
(9, "Burro", "carry", '08.02.2012'),
(10, "Hotei", "gallop", '27.11.2017');

INSERT INTO Ослы (id, nickname, comands, birthday)
VALUES(11, "Prince", "trot", '01.08.2013'),
(12, "Dancer", "canter", '12.12.2014'),
(13, "Shadow", "gallop", '23.05.2016'),
(14, "Storme", "walk", '07.02.2014'),
(15, "Spirit", "jump", '28.11.2018');

INSERT INTO Кошки (id, nickname, comands, birthday)
VALUES(16, "Barsic", "trot", '01.08.2013'),
(17, "Murka", "canter", '12.12.2014'),
(18, "Vasia", "gallop", '23.05.2016'),
(19, "Mursic", "walk", '07.02.2014'),
(20, "Malish", "jump", '28.11.2018');

INSERT INTO Собаки (id, nickname, comands, birthday)
VALUES(21, "Guerra", "trot", '01.08.2013'),
(22, "Rigic", "canter", '12.12.2014'),
(23, "Koner", "gallop", '23.05.2016'),
(24, "Punktic", "walk", '07.02.2014'),
(25, "Tailer", "jump", '28.11.2018');

INSERT INTO Хомячки (id, nickname, comands, birthday)
VALUES(26, "Mause", "trot", '01.08.2013'),
(27, "Pieter", "canter", '12.12.2014'),
(28, "Smally", "gallop", '23.05.2016'),
(29, "Ret", "walk", '07.02.2014'),
(30, "kot", "jump", '28.11.2018');

# Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

TRUNCATE TABLE Верблюды;

SELECT * FROM Лошади 
UNION SELECT * FROM Ослы
AS Вьючные_животные;

CREATE TABLE IF NOT EXISTS Молодые_животные
SELECT id, nickname, comands, birthday,
(YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) AS Возраст
FROM Собаки
WHERE (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) < 3 
AND (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) > 1
UNION 
SELECT id, nickname, comands, birthday,
(YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) AS Возраст
FROM Кошки
WHERE (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) < 3 
AND (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) > 1
UNION 
SELECT id, nickname, comands, birthday,
(YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) AS Возраст
FROM Хомячки
WHERE (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) < 3 
AND (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) > 1
UNION 
SELECT id, nickname, comands, birthday,
(YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) AS Возраст
FROM Ослы
WHERE (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) < 3 
AND (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) > 1
UNION 
SELECT id, nickname, comands, birthday,
(YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) AS Возраст
FROM Лошади
WHERE (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) < 3 
AND (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) > 1
UNION 
SELECT id, nickname, comands, birthday,
(YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) AS Возраст
FROM Верблюды
WHERE (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) < 3 
AND (YEAR(CURRENT_DATE)-YEAR(birthday)) - (RIGHT(CURRENT_DATE,5)<RIGHT(birthday,5)) > 1
ORDER by id;

# Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

CREATE TABLE IF NOT EXISTS Все_животные (
	id INT,
	nickname VARCHAR(50),
	comands VARCHAR(50),
	birthday DATE, 
	table_name ENUM('Кошки','Собаки','Хомячки', 'Лошади', 'Ослы', 'Верблюды')
);

INSERT INTO Все_животные (id, nickname, comands, birthday, table_name)
SELECT id, nickname, comands, birthday, "Кошки"
FROM Кошки;

INSERT INTO Все_животные (id, nickname, comands, birthday, table_name)
SELECT id, nickname, comands, birthday, "Собаки"
FROM Собаки;

INSERT INTO Все_животные (id, nickname, comands, birthday, table_name)
SELECT id, nickname, comands, birthday, "Хомячки"
FROM Хомячки;

INSERT INTO Все_животные (id, nickname, comands, birthday, table_name)
SELECT id, nickname, comands, birthday, "Верблюды"
FROM Верблюды;

INSERT INTO Все_животные (id, nickname, comands, birthday, table_name)
SELECT id, nickname, comands, birthday, "Ослы"
FROM Ослы;

INSERT INTO Все_животные (id, nickname, comands, birthday, table_name)
SELECT id, nickname, comands, birthday, "Лошади"
FROM Лошади;






