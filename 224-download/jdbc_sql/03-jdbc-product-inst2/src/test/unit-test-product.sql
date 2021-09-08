-- select 
select * from product;
-- 총 상품수 조회 
select count(*) from product;

-- id 에 대한 상품 존재 유무 
select count(*) from product where id=1;-- 존재하면 1 
select count(*) from product where id=8;-- 존재x 0 

-- maker 종류 조회
select distinct maker from product;

-- lowPrice, highPrice
select id,name,maker,price 
from product
where price>=1300 and price<=1700
order by price desc

select id,name,maker,price 
from product
where price between 1300 and 1700
order by price desc


-- DAO에 적용할 SQL 
select id,name,maker,price 
from product
where price>=? and price<=?
order by price desc

















