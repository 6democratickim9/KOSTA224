create table mvc_department(
	deptno number primary key,
	dname varchar2(100) not null,
	loc varchar2(100) not null,
	tel varchar2(100) not null
)

insert into mvc_department(deptno,dname,loc,tel) values(10,'전략기획','오리','031');
insert into mvc_department(deptno,dname,loc,tel) values(20,'공공사업','종로','02');
insert into mvc_department(deptno,dname,loc,tel) values(30,'연구개발','판교','033');

create table mvc_employee(
	empno number primary key,
	ename varchar2(100) not null,
	sal number not null,
	deptno number not null,
	constraint fk_mvc_deptno foreign key(deptno) references mvc_department(deptno)
)

insert into mvc_employee(empno, ename, sal, deptno) values(1,'IU',400,50);


insert into mvc_employee(empno, ename, sal, deptno) values(1,'IU',400,10);
insert into mvc_employee(empno, ename, sal, deptno) values(2,'박보검',300,10);
insert into mvc_employee(empno, ename, sal, deptno) values(3,'강하늘',600,20);

commit

select count(*) from mvc_employee;


select e.empno, e.ename, e.sal, d.dname, d.loc
from mvc_employee e, mvc_department d
where e.deptno=d.deptno
order by e.empno desc