CREATE SEQUENCE test_seq; --시퀀스 생성 test_seq
SELECT * FROM DUAL; --오라클에서 제공하는 dual 테이블 조회
SELECT 2*5 FROM DUAL; --연산시 사용
SELECT SYSDATE FROM DUAL; --현재시간 SYSDATE
SELECT test_seq.nextval FROM DUAL;--DUAL 테이블을 이용해 시퀀스 값을 확인/시퀀스명.NEXTVAL -> 시퀀스 다음 값을 생성


--DROP한 test_seq 시퀀스명으로 다시 시퀀스를 생성해본다(옵션을 start with 7적용해서 생성)
CREATE SEQUENCE test_seq START WITH 7;

--CAR TABLE을 생성해서 SEQUENCE 를 이용해 본다
CREATE TABLE car(
	car_no number primary key,
	model varchar2(200) not null
)

CREATE sequence car_seq; 
--insert 시에 sequence 를 이용해 car_no를 등록한다
insert into car(car_no,model) values(car_seq.nextval,'테슬라');
insert into car(car_no,model) values(car_seq.nextval,'포르쉐');
select * from car;

CREATE TABLE guestbook(
	guestbook_no NUMBER PRIMARY KEY,
	title VARCHAR2(100)NOT NULL,
	content VARCHAR2(1000) NOT NULL 
)

CREATE SEQUENCE guestbook_seq;

select * from guestbook;


--시퀀스명.nextval
SELECT guestbook_seq.nextval from dual;
--시퀀스명.curval:단독으로 사용될 수 없고 nextval한 커넥션 내에서 currval을 사용할 수 있다(동일한 세션 내에서만 사용 가능)
SELECT guestbook_seq.currval FROM dual;
--