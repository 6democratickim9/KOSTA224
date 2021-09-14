CREATE TABLE product(
	id NUMBER PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	maker VARCHAR2(100) NOT NULL,
	price NUMBER DEFAULT 0
)
INSERT INTO PRODUCT values(1,'불닭볶음면','삼양',1500);
INSERT INTO PRODUCT values(2,'진라면','오뚜기',1100);
INSERT INTO PRODUCT values(5,'참이슬','하이트진로',3000);

COMMIT

SELECT MIN(PRICE) FROM PRODUCT;
SELECT COUNT(*) FROM MEMBER;

SELECT name,price FROM product WHERE price>=1300 AND price<=2000 ORDER BY price ASC;

--LIKE 연산자: 일부가 포함되는 내용을 검색하는 연산자
--WHERE 컬럼명 LIKE '%검색키워드%'
--% 0개 이상의 문자

SELECT * FROM PRODUCT WHERE NAME LIKE '%면%';
SELECT * FROM PRODUCT WHERE MAKER LIKE '%트진%';

--어플리케이션 테스트:04-jdbc에서 TEstGuestBookDAO4