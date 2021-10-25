/*
	JOIN SQL - 여러 테이블을 결합하여 정보를 조회하기 위한 SQL 
	
	1. INNER JOIN - 일반적으로 조인이라고 하는 SQL을 의미 
						  조인 조건에 부합되는 행에 대해서만 조회 
						  1) Equi Join - 조인 대상 테이블 간의 상응하는 컬럼 정보가 정확하게 일치하는 경우의 JOIN 
						  					( 부서 테이블과 사원 테이블간의 부서번호가 일치할 때 조인 ) 
						  2) Non Equi Join - 조인 대상 테이블 간의 상응하는 컬럼 정보가 없을 때 사용하는 JOIN 
						  						 테이블 간의 컬럼 값들이 정확하기 일치하지 않을 때 사용하는 JOIN 
						  					( 사원 테이블과 월급 등급 테이블간의 일치하는 컬럼은 없지만 사원의 월급 등급을 
						  					  알기 위해 월급 등급 테이블의 hisal , losal 과 사원 테이블의 sal 을 비교 ) 	 

	2. Outer JOIN - JOIN 조건에 부합되지 않더라도 다른 행을 조회하기 위해 
						( 부서 테이블과 사원 테이블 조인시 INNER JOIN은 사원이 없는 부서는 제외 
						  Outer JOIN 은 사원이 없는 부서라도 모두 조회 ) 

    3. Self JOIN - 동일 테이블 상에서의 조인 ( 사원 테이블의 매니저 컬럼의 정보는 또 다른 사원 정보이다. 이를 이용해 
    													사원의 매니저의 사원번호, 사원명 등을 조회할 때 Self JOIN 을 사용 ) 

*/
-- 1. Inner Join 
-- 1)  equi join 
-- 사원 정보 조회시 사원이 속한 부서 정보까지 함께 조회 
select e.empno, e.ename, e.job, d.deptno, d.dname,d.loc
from emp e, dept d 
where e.deptno=d.deptno 
-- 위의 sql 을 아래와 같이 표현할 수도 있다 
select e.empno, e.ename, e.job, d.deptno, d.dname,d.loc
from emp e
inner join dept d on e.deptno=d.deptno

-- 2) non equi join 
-- 사원 테이블(emp) , 월급등급 테이블(salgrade)
--   sal				  hisal , losal  
-- 두 테이블간의 연관성은 사원 테이블의 sal 과 월급등급 테이블의  hisal 최고액 , losal 최저액 사이에 있다 
select * from emp where ename='SMITH';-- sal 이 800

-- Inner Join ( non equi join ) 
select e.empno, e.ename, s.grade , e.sal , s.losal , s.hisal
from emp e, salgrade s 
where e.sal>=s.losal and e.sal<=s.hisal 
and e.ename='SMITH'


/*
 		2. Outer Join : 일반적인 조인 ( Inner Join ) 조건에 만족하지 않는 경우에도 조회하기 위해 사용
 						  ( 부서와 사원 테이블 조인시 사원이 존재하지 않는 부서정보도 조회하기 위해 Outer Join을 이용 ) 
 						  
 						  JOIN 조건에 (+) 를 명시 -> 조인 시킬 값이 없는 측에 표기 
 						  
 						  select column,column
 						  from table1 , table 2 
 						  where table1.컬럼(+)=table2.컬럼	
 						  
 						  select column,column
 						  from table1 
 						  left outer join table2 on 컬럼=컬럼  
 */
select distinct deptno from dept;-- 10 20 30 40 번 부서가 존재 
select distinct deptno from emp; -- 10 20 30 번 부서가 존재 

-- inner join : 조인하는 테이블 간의 컬럼값이 일치되지 않는 경우는 조회되지 않는다 
--				 즉 사원이 존재하지 않는 40번 부서는 정보가 조회되지 않는다 
select e.empno,e.ename,e.deptno,d.deptno,d.dname
from dept d, emp e 
where d.deptno=e.deptno


-- outer join : (+) outer join 기호는 데이터가 없는 측에 명시 
-- 40번 부서 정보는 부서 테이블에 존재 , 40번 부서에 속한 사원이 없으므로 사원테이블에 outer join 연산기호를 표시 
-- outer join을 실행한 결과를 보면 사원이 존재하지 않는 40번 부서 정보까지 모두 조회가 된다 
select e.empno,e.ename,e.deptno,d.deptno,d.dname,d.loc
from dept d, emp e 
where d.deptno=e.deptno(+)

-- 아래와 같이 Outer Join을 표현할 수 있다 
select e.empno,e.ename,e.deptno,d.deptno,d.dname
from dept d
left outer join emp e on d.deptno=e.deptno

select e.empno,e.ename,e.deptno,d.deptno,d.dname
from emp e
right outer join dept d on d.deptno=e.deptno


/*
 		3. Self Join : 테이블 자체에서 조인 
 						 동일한 테이블이지만 개념적으로 다른 정보를 결합 
 						 사례 - 사원 테이블의 매니저 번호는 또 다른 사원의 사원번호이다 
 */

select e.empno,e.ename,e.mgr,m.empno as 매니저번호,m.ename as 매니저명
from emp e, emp m
where e.mgr=m.empno(+)

--join sql 연습
--empno 가 7369인 사원의 ename, dname, grade, mgr의 ename을 조회한다
--SMITH, RESEARCH,FORD,1
select e.ename, d.dname, s.grade, m.ename as mgr_name
from emp e, dept d, salgrade s, emp m
where e.deptno=d.deptno
and e.sal>=s.losal
and e.sal<=s.hisal
and e.mgr=m.empno
and e.empno=7369

select e.ename, d.dname, s.grade, m.ename as mgr_name
from emp e, dept d, salgrade s, emp m
where e.deptno=d.deptno
and e.sal>=s.losal
and e.sal<=s.hisal
and e.mgr=m.empno(+)






