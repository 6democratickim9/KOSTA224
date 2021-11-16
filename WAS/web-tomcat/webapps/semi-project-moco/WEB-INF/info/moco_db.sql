-- create member table
create table moco_member(
	email varchar2(100) primary key,
	password varchar2(100) not null,
	nickname varchar2(100) not null,
	thumbs number default 0,
	github varchar2(100) not null
)
select * from moco_member;

--file

create table upload_file(
	fileName varchar2(200),
	fileRealName varchar2(200)
)

select * from upload_file;
insert into upload_file (fileName, fileRealName) values ('sopho.png','so.png')

create table moco_scrap (
scrap_no number primary key,
email varchar2(100) not null,
post_no number not null,
scrap_date date not null,
constraint fk_email foreign key(email) references moco_member(email),
constraint fk_post_no foreign key(post_no) references moco_qna_board(post_no)
);

create sequence moco_scrap_seq;


select v.rnum,v.scrap_no, v.post_no, b.post_title, to_char(b.post_regdate, 'yyyy-mm-dd') as post_regdate, v.nickname, b.hits 
from(select row_number() over(order by s.scrap_date desc) as rnum, s.scrap_no, m.email, m.nickname, s.post_no, s.scrap_date
from moco_member m, moco_scrap s 
where m.email=s.email
) v, moco_qna_board b
where v.post_no=b.post_no
and v.rnum between 1 and 5
order by v.scrap_no desc

select v.rnum,v.scrap_no, v.post_no, b.post_title, to_char(b.post_regdate, 'yyyy-mm-dd') as post_regdate, v.nickname, b.hits
from(
select row_number() over(order by s.scrap_date desc) as rnum, s.scrap_no, m.email, m.nickname, s.post_no, s.scrap_date
from moco_member m, moco_scrap s
where m.email=s.email and m.email='test@naver.com'
) v, moco_qna_board b 
where v.post_no=b.post_no
and v.rnum between 1 and 5
order by v.scrap_no desc



delete from moco_scrap where scrap_no=1

drop table moco_scrap;
drop sequence moco_scrap_seq;
-- insert moco_qna_board
insert into moco_qna_board(post_no, post_title, post_content, post_code, post_regdate, email, language_code)
values(moco_qna_board_seq.nextval, 'java error', '이 코드 에러 왜 나는지 모르겠네요', 'String s = 1;', sysdate, 'test@naver.com', 1);

delete from moco_scrap where post_no=1;
select * from moco_scrap;
select * from moco_qna_board;
insert into moco_scrap values(moco_scrap_seq.nextval,'test@naver.com', 1, sysdate);
--insert into moco_scrap values('test@naver.com', 2, sysdate);

commit


-- create moco_qna_board table
create table moco_qna_board(
	post_no number primary key,
	post_title varchar2(100) not null,
	post_content clob not null,
	post_code clob not null,
	post_regdate date not null,
	hits number default 0,
	email varchar2(100) not null,
	language_code number not null,
	
	constraint fk_board_email foreign key(email) references moco_member(email),
	constraint fk_board_language_code foreign key(language_code) references moco_service_language(language_code)
)
select * from moco_qna_board;
drop table moco_qna_board;
​
-- create sequence
create sequence moco_qna_board_seq;
drop sequence moco_qna_board_seq;




drop table moco_member;
​
-- create moco_rank
create table moco_rank (
	grade varchar2(100) primary key,
	min_thumbs number not null,
	max_thumbs number not null
)
select * from moco_rank


drop table moco_rank
​
-- create moco_service_language table
create table moco_service_language(
	language_code number primary key,
	language varchar2(100) not null
)
select * from moco_service_language;
drop table moco_service_language;
​

​
​
-- create comment table
create table moco_comment (
	comment_no number primary key,
	comment_content clob not null,
	comment_regdate date not null,
	email varchar2(100) not null,
	post_no number not null,
	
	constraint fk_comment_email foreign key(email) references moco_member(email),
	constraint fk_comment_post_no foreign key(post_no) references moco_qna_board(post_no) on delete cascade
)
select * from moco_comment
drop table moco_comment
​
-- create sequence
create sequence moco_comment_seq;
drop sequence moco_comment_seq;
​
-- insert service_language
insert into moco_service_language(language_code, language) values(1, 'java');
insert into moco_service_language(language_code, language) values(2, 'python');
insert into moco_service_language(language_code, language) values(3, 'c');
insert into moco_service_language(language_code, language) values(4, 'etc');
​
-- insert rank
insert into moco_rank values('새내기', 0, 10);
insert into moco_rank values('헌내기', 11, 25);
insert into moco_rank values('사망년', 26, 40);
insert into moco_rank values('고인물', 41, 60);
insert into moco_rank values('졸업자', 61, 9999);
​
-- insert moco_member
insert into moco_member(email, password, nickname, github) values('test@naver.com', 'a', 'test', 'www.github.com/test');
insert into moco_member(email, password, nickname, github) values('java@naver.com', 'a', 'java', 'www.github.com/java');
insert into moco_member(email, password, nickname, github) values('jsp@naver.com', 'a', 'jsp', 'www.github.com/jsp');
​
-- insert moco_qna_board
insert into moco_qna_board(post_no, post_title, post_content, post_code, post_regdate, email, language_code)
values(moco_qna_board_seq.nextval, 'java error', '이 코드 에러 왜 나는지 모르겠네요', 'String s = 1;', sysdate, 'test@naver.com', 1);


insert into moco_qna_board(post_no, post_title, post_content, post_code, post_regdate, email, language_code)
values(moco_qna_board_seq.nextval, '파이썬 와이라노', '이 코드 에러 왜 나는지 모르겠네요', 'String s = 1;', sysdate, 'test@naver.com', 2);
​
insert into moco_qna_board(post_no, post_title, post_content, post_code, post_regdate, email, language_code)
values(moco_qna_board_seq.nextval, 'python error', '도와주세요', 'num = 3;', sysdate, 'java@naver.com', 2);
​
insert into moco_qna_board(post_no, post_title, post_content, post_code, post_regdate, email, language_code)
values(moco_qna_board_seq.nextval, 'c error', '머리 아프네요', 'int sum = "hello world";', sysdate, 'jsp@naver.com', 3);
​
-- insert moco_comment
insert into moco_comment values(moco_comment_seq.nextval, 'type이 잘못 됐네요', sysdate, 'java@naver.com', 1);
insert into moco_comment values(moco_comment_seq.nextval, '이걸 왜모름', sysdate, 'java@naver.com', 1);
insert into moco_comment values(moco_comment_seq.nextval, '파이썬 ; 필요없음', sysdate, 'jsp@naver.com', 2);
insert into moco_comment values(moco_comment_seq.nextval, '힘내세요', sysdate, 'jsp@naver.com', 2);
insert into moco_comment values(moco_comment_seq.nextval, '아니 문자열 킹받네', sysdate, 'test@naver.com', 3);
insert into moco_comment values(moco_comment_seq.nextval, '검색해보셈', sysdate, 'test@naver.com', 3);
​
-- commit 필수!
commit
​
-- test delete cascade
delete from moco_qna_board where post_no=1
​
-- test thumbs up
update moco_member set thumbs = thumbs + 1
where email = 'java@naver.com';
​
-- test board(언어별 게시판 리스팅)
select b.post_title, b.post_content, b.post_code, b.post_regdate, 
	b.hits, m.nickname, b.language_code
from moco_qna_board b, moco_member m
where m.email = b.email
​
select v.post_title, v.post_content, v.post_code, v.post_regdate, v.hits, v.nickname, l.language
from (
	select b.post_title, b.post_content, b.post_code, b.post_regdate, 
		b.hits, m.nickname, b.language_code as lang
	from moco_qna_board b, moco_member m
	where m.email = b.email
) v, moco_service_language l
where v.lang = l.language_code and l.language_code = '1'
​
-- test comment(게시판 상세 조회 시 댓글 리스트 불러오기)
select c.comment_content, c.comment_regdate, c.email
from moco_comment c, moco_qna_board b
where c.post_no = b.post_no and b.post_no = '1'
​
select v.comment_content, v.comment_regdate, v.email, m.nickname
from (
	select c.comment_content, c.comment_regdate, c.email
	from moco_comment c, moco_qna_board b
	where c.post_no = b.post_no and b.post_no = '1'
) v, moco_member m
where v.email = m.email

-- 랭킹조회
select r.grade,m.thumbs
from moco_member m, moco_rank r 
where m.thumbs>=r.min_thumbs and m.thumbs<=r.max_thumbs 
and m.email='test@naver.com';

select * from moco_member m where m.email='test@naver.com';

-- 특정 회원 게시물 조회
select v.post_no, v.post_title, v.post_regdate, v.hits, l.language as lang
from (
	select b.post_no, b.post_title, b.post_regdate, 
		b.hits, b.language_code as lang
	from moco_qna_board b, moco_member m
	where b.email ='test@naver.com'
) v, moco_service_language l
where v.lang = l.language_code 
order by v.post_no desc


--회원이 작성한 게시글 수 조회
select count(*) from moco_qna_board where email='foxy@naver.com';




select b.post_title, b.post_content, b.post_code, b.post_regdate, b.hits, b.language_code
from moco_qna_board b
	where b.email='foxy0114@naver.com';

select * from moco_qna_board;

--마이페이지 포스트조회

select v.post_no, v.post_title, v.post_regdate, v.hits, l.language as lang
from moco_qna_board v, moco_service_language l
where l.language_code=v.language_code
and v.email='foxy0114@naver.com';




--페이징용 포스트조회
select v.rnum, v.post_no, v.post_title, to_char(v.post_regdate, 'yyyy-mm-dd') 
as post_regdate, v.hits, v.language, v.language_code,m.nickname
from (
select row_number() over(order by b.post_regdate desc) as rnum, b.post_no, b.post_title, 
b.post_regdate, b.hits, b.email, l.language, b.language_code
from moco_qna_board b, moco_service_language l
where b.language_code = l.language_code  and b.email='test@naver.com'
) v, moco_member m 
where v.rnum between 1 and 5
and  v.email=m.email
order by v.post_regdate desc


alter table moco_member add thema varchar(25) default 'duotone-light' not null;




select v.rnum, v.post_no, v.post_title, to_char(v.post_regdate, 'yyyy-mm-dd') m.nickname
as post_regdate, m.nickname, v.hits,  v.language as lang
from(
select row_number() over(order by b.post_regdate desc) as rnum, 
b.post_no, b.post_title, b.post_regdate, b.hits, l.language
from moco_qna_board b, moco_service_language l
where b.language_code = l.language_code
) v, moco_member m
where v.email = m.email and m.email='test@naver.com'
and v.rnum between 6 and 10
order by v.post_regdate desc

