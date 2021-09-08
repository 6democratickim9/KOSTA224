create table account(
	account_no number primary key,
	name varchar2(100) not null,
	password varchar2(100) not null,
	balance number not null
)
create sequence account_seq;

-- sql 단위 테스트 

select * from account;
insert into account(account_no,name,password,balance) values(account_seq.nextval,'아이유','1234',1000 );

select password,balance
from account
where account_no=1

--입금
select*from account where account_no=1;

update account set balance=balance+50 where account_no=1;