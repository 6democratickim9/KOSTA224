create table shares(
	customer_id varchar2(100),
	stock_id varchar2(100),
	quantity number not null,
	constraint pk_shares primary key(customer_id,stock_id)
)

insert into shares(customer_id, stock_id, quantity) values('java','삼성',10);
insert into shares(customer_id, stock_id, quantity) values('java','LG',20);
insert into shares(customer_id, stock_id, quantity) values('java','삼성',5);

update shares set quantity=quantity+5 where customer_id='java' and stock_id='삼성';

select * from shares;