CREATE TABLE card(
	id VARCHAR2(100) PRIMARY KEY,
	name VARCHAR2(100) NOT NULL
)
CREATE TABLE point(
	id VARCHAR2(100) PRIMARY KEY,
	point_type VARCHAR2(100) NOT NULL,
	point NUMBER NOT NULL
)
SELECT * FROM card;
SELECT * FROM point;

DELETE FROM card;
DELETE FROM point;

commit