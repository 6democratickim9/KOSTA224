create table s_employee(
	empno number primary key,
	name varchar2(100) not null,
	job varchar2(100) not null,
	salary number not null
)
create sequence s_employee_seq;

insert into S_EMPLOYEE(empno,name,job,salary) values(s_employee_seq.nextval,'아이유','개발',700);
insert into S_EMPLOYEE(empno,name,job,salary) values(s_employee_seq.nextval,'강하늘','개발',700);
insert into S_EMPLOYEE(empno,name,job,salary) values(s_employee_seq.nextval,'김민주','기획',900);
insert into S_EMPLOYEE(empno,name,job,salary) values(s_employee_seq.nextval,'강인솔','영업',850);
insert into S_EMPLOYEE(empno,name,job,salary) values(s_employee_seq.nextval,'최우혁','총무',600);

select * from S_EMPLOYEE;

--sql 단위 테스트

commit

select empno,name,job,salary
from s_employee
where job='개발' and salary=(select max(salary) from s_employee where job='개발')