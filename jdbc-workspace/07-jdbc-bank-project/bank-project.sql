create table account(
	account_no number primary key,
	name varchar2(100) not null,
	password varchar2(100) not null,
	balance number not null
)
create sequence account_seq;

--sql 단위 테스트