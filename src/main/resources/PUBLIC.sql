CREATE TABLE IF NOT EXISTS Organization
( id INTEGER PRIMARY KEY AUTO_INCREMENT,
 name varchar(40),
 fullName VARCHAR(40),
 inn varchar(10),
 kpp varchar(9),
 address varchar(130),
 phone varchar(30),
 ifActive boolean
);
CREATE TABLE IF NOT EXISTS Office
( orgId integer,
foreign key (orgId) references ORGANIZATiON(ID),
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name varchar(40),
  address varchar(130),
  phone varchar(30),
  ifActive boolean
);
CREATE TABLE IF NOT EXISTS User(
        officeId  int,
        foreign key (officeId) references OFFICE (id),
        id        int primary key auto_increment,
        firstName varchar(30),
        lastName varchar(30),
        middleName varchar(30),
        position varchar(30),
        phone varchar(20),
        docName varchar(50),
        docNumber varchar(30),
        docCode varchar(30),
        docDate varchar(30),
        citizenShipName varchar(30),
        citizenShipCode varchar(30),
        isIdentified boolean
        );

CREATE TABLE IF NOT EXISTS Countries(
id int primary key auto_increment,
name varchar(50),
code varchar(30)
);

CREATE TABLE IF NOT EXISTS Document(
id int primary key auto_increment,
docName varchar(50),
docCode varchar(30),
docNumber varchar(12),
docDate varchar(15)
);