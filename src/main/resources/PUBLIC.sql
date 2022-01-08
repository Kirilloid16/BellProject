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
CREATE TABLE if not exists DocumentType(id int,
userDocId int,
                                        docName varchar(50),
                                        docCode varchar(30)
);

CREATE TABLE if not exists Country(id int,
                                    userId int,
                                   citizenShipName varchar(30),
                                   citizenShipCode varchar(30));
CREATE TABLE if not exists UserDocument(
                                           id int,
                                           userId int,
                                           docTypeId int,
                                           foreign key (docTypeId) references DOCUMENTTYPE (id),
                                           docNumber varchar(12),
                                           docDate varchar(15));
CREATE TABLE if not exists User(
 offId  int,
foreign key (offId) references OFFICE (id),
id int primary key auto_increment,
firstName varchar(30),
lastName varchar(30),
middleName varchar(30),
position varchar(30),
phone varchar(20),
docId int,
foreign key (docId) references UserDocument(id),
countryId int,
foreign key(countryId) references COUNTRY(id)
);

