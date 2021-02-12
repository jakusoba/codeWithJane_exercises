
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS art;
DROP TABLE IF EXISTS artist;
DROP TABLE IF EXISTS customer;




CREATE TABLE customer (

  customerId serial,
  firstName varchar(50) not null,
  lastName varchar(50) not null,
  phone varchar(11), 
  
  constraint pk_customer primary key (customerId)

);


CREATE TABLE artist (
  artistId serial,
  firstName varchar(50) not null,
  lastName varchar(50) not null,
  
  constraint pk_artist primary key (artistId)
 
);

CREATE TABLE art (

  artId serial,
  title varchar(64) not null,
  artistId int not null,
  
  constraint pk_art primary key (artId),
  constraint fk_art_artist foreign key (artistId) references artist (artistId)
  
);


CREATE TABLE orders (
     
     orderId serial,
     orderDate timestamp not null,
     price money not null,
     customerId int not null,
     artId int not null,
     
     constraint pk_orders primary key (orderId),
     constraint fk_orders_customer foreign key (customerId) references customer (customerId),
     constraint fk_orders_art foreign key (artId) references art (artId)
   
);


-- lOAD SAMPLE DATA

-- SEQUENCE EXAMPLE
-- SELECT nextval('art_artid_seq');


