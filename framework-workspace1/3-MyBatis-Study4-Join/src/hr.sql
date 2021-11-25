drop table spring_department;
create table spring_department(
	deptno number primary key,
	dname varchar2(100) not null,
	loc varchar2(100) not null
)
create table spring_employment(
	empno number primary key,
	ename varchar2(100) not null,
	sal number not null,
	deptno number not null,
	constraint fk_spring_deptno foreign key(deptno) references spring_department(deptno)
)
-- 부서 테이블에는 40번 부서가 없으므로 error , 참조 무결성 제약조건 위배 
-- insert into spring_employment values(1,'아이유',300,40);
insert into spring_employment values(1,'아이유',300,10);
insert into spring_employment values(2,'조승우',500,10);
insert into spring_employment values(3,'배두나',400,20);

insert into spring_department values(10,'전략기획','판교');
insert into spring_department values(20,'해양수산','부산');
insert into spring_department values(30,'공공사업','판교');
commit
select * from spring_department;

select e.ename,d.dname,d.loc
from spring_employment e, spring_department d
where e.empno=1 and e.deptno=d.deptno

select e.empno,e.ename,e.deptno,d.dname
from spring_employment e, spring_department d
where e.deptno(+)=d.deptno

--LEFT OUTER JOIN으로 표현
select e.empno, e.ename, d.deptno, d.dname
from spring_department d, spring_employment e
left outer join spring_department e
on e.deptno=d.deptno

--조회 결과가 null인 값을 다른 값으로 치환하는 함수 nvl(컬럼,치환값)
select nvl()

