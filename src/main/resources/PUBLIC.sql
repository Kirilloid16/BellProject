CREATE TABLE IF NOT EXISTS Organization
( id int primary key auto_increment,
 name varchar(40),
 fullName varchar(40),
 inn varchar(10),
 kpp varchar(9),
 address varchar(130),
 phone varchar(30),
 ifActive boolean
);
CREATE TABLE IF NOT EXISTS Office
( orgId integer,
foreign key (orgId) references ORGANIZATiON(ID),
  id int primary key auto_increment,
  name varchar(40),
  address varchar(130),
  phone varchar(30),
  ifActive boolean
);
CREATE TABLE IF NOT EXISTS User(
        officeId  int,
        foreign key (officeId) references OFFICE (id),
        id int primary key auto_increment,
        firstName varchar(30),
        lastName varchar(30),
        middleName varchar(30),
        position varchar(30),
        phone varchar(20)
        );


CREATE TABLE IF NOT EXISTS DocumentType(
    userId int,
    foreign key (userId) references USER(id),
docName varchar(50),
docCode varchar(30)
);
CREATE TABLE IF NOT EXISTS Document(
    userId int,
    foreign key (userId) references USER(id),
docNumber varchar(12),
docDate varchar(15)
);
CREATE TABLE IF NOT EXISTS Country(
    userId int,
    foreign key (userId) references USER(id),
citizenShipName varchar(30),
citizenShipCode varchar(30)
);
