-- create member table
create table moco_member(
	email varchar2(100) primary key,
	password varchar2(100) not null,
	nickname varchar2(100) not null,
	thumbs number default 0,
	github varchar2(100) not null
)
select * from moco_member;
delete from MOCO_MEMBER where email='shcomon24@gmail.com';
drop table moco_member;
commit

-- create moco_rank
create table moco_rank (
	grade varchar2(100) primary key,
	min_thumbs number not null,
	max_thumbs number not null
)
select * from moco_rank
drop table moco_rank

-- create moco_service_language table
create table moco_service_language(
	language_code number primary key,
	language varchar2(100) not null
)
select * from moco_service_language;
drop table moco_service_language;

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

-- create sequence
create sequence moco_qna_board_seq;
drop sequence moco_qna_board_seq;


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

-- create sequence
create sequence moco_comment_seq;
drop sequence moco_comment_seq;

-- insert service_language
insert into moco_service_language(language_code, language) values(1, 'java');
insert into moco_service_language(language_code, language) values(2, 'python');
insert into moco_service_language(language_code, language) values(3, 'c');
insert into moco_service_language(language_code, language) values(4, 'etc');

-- insert rank
insert into moco_rank values('새내기', 0, 10);
insert into moco_rank values('헌내기', 11, 25);
insert into moco_rank values('사망년', 26, 40);
insert into moco_rank values('고인물', 41, 60);
insert into moco_rank values('졸업자', 61, 9999);

-- insert moco_member
insert into moco_member(email, password, nickname, github) values('test@naver.com', 'a', 'test', 'www.github.com/test');
insert into moco_member(email, password, nickname, github) values('java@naver.com', 'a', 'java', 'www.github.com/java');
insert into moco_member(email, password, nickname, github) values('jsp@naver.com', 'a', 'jsp', 'www.github.com/jsp');

-- insert moco_qna_board
insert into moco_qna_board(post_no, post_title, post_content, post_code, post_regdate, email, language_code)
values(moco_qna_board_seq.nextval, 'java error', '이 코드 에러 왜 나는지 모르겠네요', 'String s = 1;', sysdate, 'test@naver.com', 1);

insert into moco_qna_board(post_no, post_title, post_content, post_code, post_regdate, email, language_code)
values(moco_qna_board_seq.nextval, 'python error', '도와주세요', 'num = 3;', sysdate, 'java@naver.com', 2);

insert into moco_qna_board(post_no, post_title, post_content, post_code, post_regdate, email, language_code)
values(moco_qna_board_seq.nextval, 'c error', '머리 아프네요', 'int sum = "hello world";', sysdate, 'jsp@naver.com', 3);

-- insert moco_comment
insert into moco_comment values(moco_comment_seq.nextval, 'type이 잘못 됐네요', sysdate, 'java@naver.com', 1);
insert into moco_comment values(moco_comment_seq.nextval, '이걸 왜모름', sysdate, 'java@naver.com', 1);
insert into moco_comment values(moco_comment_seq.nextval, '파이썬 ; 필요없음', sysdate, 'jsp@naver.com', 2);
insert into moco_comment values(moco_comment_seq.nextval, '힘내세요', sysdate, 'jsp@naver.com', 2);
insert into moco_comment values(moco_comment_seq.nextval, '아니 문자열 킹받네', sysdate, 'test@naver.com', 3);
insert into moco_comment values(moco_comment_seq.nextval, '검색해보셈', sysdate, 'test@naver.com', 3);

-- commit 필수!
commit

-- test delete cascade
delete from moco_qna_board where post_no=1

-- test thumbs up
update moco_member set thumbs = thumbs + 1
where email = 'java@naver.com';

-- test board(언어별 게시판 리스팅)
select b.post_title, b.post_content, b.post_code, b.post_regdate, 
	b.hits, m.nickname, b.language_code
from moco_qna_board b, moco_member m
where m.email = b.email

select v.post_title, v.post_content, v.post_code, v.post_regdate, v.hits, v.nickname, l.language
from (
	select b.post_title, b.post_content, b.post_code, b.post_regdate, 
		b.hits, m.nickname, b.language_code as lang
	from moco_qna_board b, moco_member m
	where m.email = b.email
) v, moco_service_language l
where v.lang = l.language_code and l.language_code = '1'

-- test comment(게시판 상세 조회 시 댓글 리스트 불러오기)
select c.comment_content, c.comment_regdate, c.email
from moco_comment c, moco_qna_board b
where c.post_no = b.post_no and b.post_no = '1'

select v.comment_content, v.comment_regdate, v.email, m.nickname
from (
	select c.comment_content, c.comment_regdate, c.email
	from moco_comment c, moco_qna_board b
	where c.post_no = b.post_no and b.post_no = '1'
) v, moco_member m
where v.email = m.email


alter table moco_qna_board ADD can_select varchar2(10) default 'N' not null; 

alter table moco_comment ADD is_selected varchar2(10) default 'N' not null;
