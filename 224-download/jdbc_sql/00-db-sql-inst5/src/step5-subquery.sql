/*
	SubQuery : 서브쿼리 , 부쿼리 , 하위쿼리 
    			   SQL 내의 SQL 
*/
SELECT * FROM PRODUCT;

-- 상품 정보 중 가장 비싼 가격의 상품명은 ? 
-- 1) 상품 최고가를 조회 , 2200
select max(price) from product;
-- 2) 최고가인 2200 price를 가진 상품명을 조회 
select name from product where price=2200;

-- 위의 1) 2) sql을 subquery를 이용해 한번에 조회 
select name from product where price=(select max(price) from product);

-- 전체 상품의 평균가격보다 높은 가격의 상품들 중 가장 낮은 가격의 name,maker,price를 조회 
-- 1) 전체 상품 평균가 : 1600
select avg(price) from product;
-- 2) 상품 평균가보다 높은 가격의 상품들 중 가장 낮은 가격은? 1700
select min(price) from product where price>1600;
-- 3) 상품 평균가보다 높은 가격의 상품들 중 가장 낮은 가격의 상품 정보를 조회 
select name,maker,price from product where price=1700;

-- 1, 2 번 sql을 subquery로 표현 
select min(price) from product where price>(select avg(price) from product);

-- 1,2,3 을 subquery를 이용해 하나의 sql로 표현 
select name,maker,price from product where price=(
	select min(price) from product where price>(select avg(price) from product)
)


select maker from product where price=(select min(price) from product);






