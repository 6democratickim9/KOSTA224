drop table spring_item;
drop sequence spring_item_seq;
create table spring_item(
	item_no number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number not null
)
create sequence spring_item_seq;
insert into spring_item values(spring_item_seq.nextval,'참이슬','진로',100);
commit

select item_no,name,maker,price from spring_item
where item_no=1;