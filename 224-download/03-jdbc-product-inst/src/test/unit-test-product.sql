-- select 
select * from product;
-- 총 상품수 조회 
select count(*) from product;

-- id 에 대한 상품 존재 유무 
select count(*) from product where id=1;-- 존재하면 1 
select count(*) from product where id=8;-- 존재x 0 