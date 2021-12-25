INSERT INTO ORGANIZATION values
    (NULL,'BI','BellIntegrator',1234567890,123456789,
    'Московский бульвар,дом 94 корп 3','84993214915',true);
INSERT INTO ORGANIZATION values
    (NULL,'BP','BritishPetrolium',7766554433,123456700,
     'Улица Пушкина,дом 144 строение 12','84995556677',true);
INSERT INTO OFFICE values
    ((select id from ORGANIZATION where ORGANIZATION.ID = 1),NULL,'MainOffice','Улица Пушкина,дом 144 строение 12',84999325871,true);
INSERT INTO OFFICE values
    ((select id from ORGANIZATION where ORGANIZATION.ID = 2),NULL,'FirstOffice','Улица Пушкина,дом 14 строение 1',89095557866,true);
INSERT INTO DOCUMENT values ((select id from USER where ID = 1),'34564532342','12.12.12');
INSERT INTO COUNTRY values ((select id from USER where ID = 1),'Russia','643');
INSERT INTO DOCUMENTTYPE values ((select id from USER where ID = 1),'Паспорт','6431234567');
INSERT INTO USER values (1,null,'kirill','lukash','antonov','java junior','89998207818')