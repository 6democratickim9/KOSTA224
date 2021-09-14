-- join sql test
/*
 *  사원번호가 1인 사원의 사원명ename,월급sal,
 *  부서번호deptno,부서명dname,근무지loc,전화번호tel 를 조회하여 출력한다 
 *  즉 사원테이블과 부서테이블의 정보를 결합해서(  join ) 조회 
 */
select	e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel
from k_employee e, department d
where e.deptno=d.deptno and e.empno=1