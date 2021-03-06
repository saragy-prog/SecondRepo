CREATE DATABASE IF NOT EXISTS AllService DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE AllService;

CREATE TABLE IF NOT EXISTS Barista(
	id int AUTO_INCREMENT NOT NULL,
	Login varchar(10) NOT NULL,
	FirstName varchar(10) NOT NULL,
	LastName varchar(10) NOT NULL,
	WorkDays varchar(128) NULL,
	MakesWell int NOT NULL,
	Brand int NOT NULL,
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `Barista` ADD UNIQUE (`Login`);

DROP TABLE IF EXISTS Drink;
CREATE TABLE IF NOT EXISTS Drink(
	id int AUTO_INCREMENT NOT NULL,
	Name varchar(20) NOT NULL,
	Type varchar(20) NOT NULL,
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS Places; 
CREATE TABLE IF NOT EXISTS Places(
	id int AUTO_INCREMENT NOT NULL,
	Name varchar(20) NOT NULL,
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS PlaceBarista;
CREATE TABLE IF NOT EXISTS PlaceBarista(
	id int AUTO_INCREMENT NOT NULL,
	BaristaId int NOT NULL,
	PlaceId int NOT NULL,
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS DrinkBarista;
CREATE TABLE IF NOT EXISTS DrinkBarista(
	id int AUTO_INCREMENT NOT NULL,
	DrinkId int NOT NULL,
	BaristaId int NOT NULL,
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
 

CREATE TABLE IF NOT EXISTS Users(
	id int AUTO_INCREMENT NOT NULL,
	Login varchar(10) NOT NULL,
	FirstName varchar(10) NOT NULL,
	LastName varchar(10) NOT NULL,
	DateOfRegistration date NOT NULL,
	Email varchar(10) NOT NULL,
	NumberOfVisits int NULL,
	Role varchar(10) NOT NULL,
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `Users` ADD UNIQUE (`Login`);

DROP TABLE IF EXISTS Visits;
CREATE TABLE IF NOT EXISTS Visits(
	id int AUTO_INCREMENT NOT NULL,
	Date date NULL,
	BaristaId int NOT NULL,
	UserId int NOT NULL,
	PlaceName int NOT NULL,
	Checked boolean,
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
ALTER TABLE `PlaceBarista` ADD CONSTRAINT `FK_Barista_PlaceBarista` FOREIGN KEY (`BaristaId`) REFERENCES 
`Barista` (`id`)
	ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `DrinkBarista` ADD CONSTRAINT `FK_Barista_DrinkBarista` FOREIGN KEY (`BaristaId`) REFERENCES 
`Barista` (`id`)
	ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `Visits` ADD CONSTRAINT `FK_Barista_Visits` FOREIGN KEY (`BaristaId`) REFERENCES 
`Barista` (`id`)
	ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `Visits` ADD CONSTRAINT `FK_Users_Visits` FOREIGN KEY (`UserId`) REFERENCES 
`Users` (`id`)
	ON DELETE RESTRICT ON UPDATE RESTRICT;