SELECT * FROM PRODUCT;

--상품 정보 중 가장 비싼 가격의 상품명은?
--1) 상품 최고가를 조회
select max(price) from product;
select name from product where price=2200;

-- 위의 1)2) sql을 subquery를 이용해 한번에 조회
select name from product where price=(select max(price) from product);

--전체 상품의 평균가격보다 높은 가격의 상품들 중 가장 낮은 가격의 name,maker,price를 조회
--1) 전체 상푼의 평균가:1600

select avg(price) from product;

--2) 상품 평귱가보다 높은 가격의 상품들 중 가장 낮은 가격은?
select min(price) from product where price>1800;
--3) 상품 평균가보다 높은 가격의 상품들 중 가장 낮은 가격의 상품 정보를 조회
select name,maker,price from product where price=1800;
--1,2,3을 서브쿼리를 이용해 하나의 sql로 표현

select min(price) from product where price>(select avg(price) from product);
select name, maker, price from product where price=(select avg(price) from product);


--123
select maker from product where price=(select min(price) from product);

--사원 테이블
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