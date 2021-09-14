



테이블 생성 순서는 부모 테이블(참조 대상 테이블)부터 자식테이블(참조하는테이블) 순으로 생성

CREATE TABLE department(
	deptno NUMBER PRIMARY KEY,
	dname VARCHAR2(100) NOT NULL,
	loc VARCHAR2(100) NOT NULL,
	tel VARCHAR2(100) NOT NULL
)

CREATE TABLE k_employee(
	empno NUMBER PRIMARY KEY,
	ename VARCHAR2(100) NOT NULL,
	sal NUMBER NOT NULL,
	deptno NUMBER NOT NULL,
	CONSTRAINT fk_deptno FOREIGN KEY(deptno) REFERENCES department(deptno)
)

FOREIGN KEY: CONTRAINT 제약조건명 FOREIGN KEY(컬럼명) REFERENCES 참조테이블명(컬럼명)
참조대상이 되는 테이블(부서 DEPARTMENT)

INSERT INTO k_employee(empno,ename,sal,deptno) VALUES(1,'아이유',500,10);

INSERT INTO department(deptno,dname,loc,tel) VALUES(10,'전략기획','오리','031');
INSERT INTO department(deptno,dname,loc,tel) VALUES(20,'공공사업','종로','02');
INSERT INTO department(deptno,dname,loc,tel) VALUES(30,'염구개발','판교','032');

INSERT INTO K_EMPLOYEE(empno,ename,sal,deptno) values(1,'아이유',500,10);
INSERT INTO K_EMPLOYEE(empno,ename,sal,deptno) values(2,'박보검',700,10);
INSERT INTO K_EMPLOYEE(empno,ename,sal,deptno) values(3,'강하늘',800,20);

commit

select e.ename,e.sal,d.deptno,d.dname,d.loc
from k_employee e, department d
where e.deptno = d.deptno
and e.empno=1

select e.ename,e.sal,d.deptno,d.dname,d.loc
from k_employee e
inner join department d on e.deptno = d.deptno
where e.empno=1