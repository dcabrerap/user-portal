DROP TABLE IF EXISTS USERDEMO;
CREATE TABLE USERDEMO(ID INT auto_increment  PRIMARY KEY, first_name VARCHAR(255), last_name VARCHAR(255),email VARCHAR(255));

select * from USERDEMO

insert into USERDEMO values(null, 'juan', 'perez', 'test')