CREATE TABLE member(
id VARCHAR2(100) PRIMARY KEY,
password VARCHAR2(100) NOT NULL,
name VARCHAR2(100) NOT NULL,
address VARCHAR2(100)
);
SELECT * FROM member;

INSERT INTO member(id,password,name,address) VALUES('java','a','MINJU','ori');
INSERT INTO member(id,password,name,address) VALUES('angel','kind','이상순','애월읍');
SELECT id,password FROM member WHERE name='이상순' AND address='애월읍';

DROP table member;

UPDATE member SET address='오리' WHERE address='애월읍';
SELECT id,name FROM member where address='오리';

DELETE FROM member WHERE id='angel';
SELECT name FROM member WHERE id='angel';