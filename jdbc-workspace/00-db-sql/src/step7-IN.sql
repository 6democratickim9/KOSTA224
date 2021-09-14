create table food(
	id number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number not null
)

drop table food;

create sequence food_seq;

insert into food(id,name,maker,price) values(food_seq.nextval,'후라이드','또래오래',15000);
insert into food(id,name,maker,price) values(food_seq.nextval,'소곱창','대한곱창',20000);
insert into food(id,name,maker,price) values(food_seq.nextval,'양념치킨','또래오래',16000);
insert into food(id,name,maker,price) values(food_seq.nextval,'참치회','이춘복참치',35000);
insert into food(id,name,maker,price) values(food_seq.nextval,'파닭','또래오래',17000);
insert into food(id,name,maker,price) values(food_seq.nextval,'미니전골','대한곱창',18000);

commit

select count(*) from food;

select round(avg(price)) from food;

select maker,round(avg(price)) as avgprice
from food
group by maker
order by avgprice desc

select id,name,maker,price
from FOOD
where maker in('대한곱창','이춘복참치');


select maker
from food
group by maker
having avg(price)<(select avg(price) from food)

select name,price,maker
from food
where maker in(select maker
from food
group by maker
having avg(price)<(select avg(price) from food))

select name,price,maker,round(avg(price)) as avgprice
from FOOD
having round
group by maker



---------------
select * from s_employee

select job
from s_employee
group by job
having count(*)>=3

select name,job
from s_employee
where job in(
	select job
	from s_employee
	group by job
	having count(*)>=3
)