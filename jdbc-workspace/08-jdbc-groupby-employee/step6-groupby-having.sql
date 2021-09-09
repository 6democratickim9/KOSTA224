--group by ~having
--
--group by:테이블에서 특정 컬럼을 기준으로 그룹화하여 검색할 때 사용 데이터를 원하는 그룹으로 나눌 수 있다
--
--having: group by 와 함께 사용하는 조건절(그룹에 대한 조건을 지정)
--예) 상품 테이블에서 제조사별 상품수, 평균가
--사원 테이블에서 부서별 사원수, 평균월급

select * from product;

select maker, count(*) as 상품수
from product
group by maker
having count(*)>1
order by 상품수 desc

--maker 별 상품 평균가 avg() 를 조회하되 평균가 내림차순으로 정렬(maker, 평균가 가 조회)
select maker,round(avg(price)) as 평균가
from product
group by maker
order by 평균가 desc

--maker 별 상품 평균가(소수점이하 반올림) 가 1540원을 초과하는 제조사 maker를 조회하되
--maker별 상품수, 평균가를 조회한다(maker, 상품수, 평균가)
--상품수 오름차순으로 조회
select maker,count(*) as 상품수,round(avg(price)) as 평균가
from product
group by maker
having round(avg(price))>1540
order by 상품수 asc;

select*from S_EMPLOYEE;
--job별 사원(job,사원수)를 조회하되 사원수 내림차순 정렬

select job,count(*) as 사원수
from s_employee
group by job
order by 사원수 desc;

--job별 평균월급을 조회하되 평균월급 내림차순으로 정렬(job,평균월급)

select job,round(avg(salary)) as 평균월급
from S_EMPLOYEE
group by job
having avg(salary)>700
order by 평균월급 desc

select job,count(*), max(salary) as highestsal
from S_EMPLOYEE
group by job
order by highestsal desc

select avg(salary) from S_EMPLOYEE;

select salary
group by job
having avg(salary))
from S_EMPLOYEE
group by job
having
