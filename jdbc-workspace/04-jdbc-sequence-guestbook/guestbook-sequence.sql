CREATE TABLE guestbook(
	guestbook_no NUMBER PRIMARY KEY,
	title VARCHAR2(100)NOT NULL,
	content VARCHAR2(1000) NOT NULL 
)

CREATE SEQUENCE guestbook_seq;

select * from guestbook;