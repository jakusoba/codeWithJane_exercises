BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS seq_user_id;
DROP TABLE IF EXISTS home;
DROP TABLE IF EXISTS address;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');


CREATE TABLE address (
   addressId serial,
   addressLine varchar(64) not null,
   city varchar(50) not null,
   state varchar(50) not null,
   zip int not null,
   
   CONSTRAINT pk_address PRIMARY KEY (addressId) 

);

CREATE TABLE home (
  homeId serial,
  mlsNumber varchar(15) not null,
  imageName varchar(15) not null,
  addressId int not null,
  numberOfBathrooms int,
  numberOfBedrooms int,
  price decimal(12,2) not null,
  shortDescription varchar(255) not null,

  
  CONSTRAINT pk_home PRIMARY KEY (homeId),
  CONSTRAINT fk_home_address FOREIGN KEY (addressId) references address (addressId)

);


--House 1
INSERT INTO address (addressId, addressLine, city, state, zip) VALUES (1, '123 Elm Street', 'Columbus', 'Ohio', 43323);
INSERT INTO home ( mlsNumber, imageName, addressId, numberOfBathrooms, numberOfBedrooms, price, shortDescription) values('1001', '1001.jpg', 1, 4, 3, 30000.00,'Freddies Nightmare will come to your life in the classic home. Sweet dreams!');

--House 2
INSERT INTO address (addressId, addressLine, city, state, zip) VALUES (2, '125 Elm Street', 'Columbus', 'Ohio', 43323);
INSERT INTO home ( mlsNumber, imageName, addressId, numberOfBathrooms, numberOfBedrooms, price, shortDescription) values('1002', '1002.jpg', 2, 3, 3, 35000.00,'Nice house but the neighbor is a little strange');

-- UPDATING SEQUENCES SO THERE ARE NO CLASHES WHEN APP RUNS WITH EXISTING KEYS...
ALTER SEQUENCE address_addressid_seq RESTART WITH 100;
ALTER SEQUENCE home_homeid_seq RESTART WITH 100;

COMMIT TRANSACTION;
