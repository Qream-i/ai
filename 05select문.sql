use sqldb;
select * from usertbl;
-- userId 'BBK' 'JKW'
select * from usertbl where userid in ('BBK', 'JKW');
-- 김씨 성을 가진 사람 검색
select * from usertbl where name like '김%';
-- 김경호씨의 키보다 키가 큰 사람?
select height from usertbl where name = '김경호';
select * from usertbl where height >= 177;
select * from usertbl where height >= (select height from usertbl where name = '김경호');

select * from usertbl where birthyear > (select birthYear from usertbl where name = '은지원');

select * from buytbl;
-- 노트북의 종류와 동일한 

select userID, prodName, groupName from buytbl where groupName = (select groupName from buytbl where prodName = '노트북');

select * from usertbl where height >= any(select height from usertbl where addr = '서울');
select * from usertbl where height >= all(select height from usertbl where addr = '서울');
select * from usertbl where height >= some(select height from usertbl where addr = '서울');

select* from buytbl;

select userId from buytbl where prodName = '운동화';
select name from usertbl where userid = any (select userId from buytbl where prodName = '운동화');

select * from usertbl order by height desc limit 3;
select * from usertbl order by birthYear asc limit 5;

create table usertbl2 ( select * from usertbl);

create table usertblSeoul (select * from usertbl where addr = '서울');
select * from usertblSeoul;

-- 키가 175~180 사이인 사람만 userid, name, height 열만 테이블 만들기

create table heightTbl (select userid, name, height from usertbl where height between 175 and 180) ;
select * from heightTbl;

-- 단 제약조건 (pk, fk)은 만들어지지 않는다.

-- group by 절
-- select userid, sum(amount), avg( amount), max(amount), count (amount), std(amount) from buytbl group by
select userid, sum(price) from buytbl group by userid having sum(price) >= 300;
-- alter
select groupName, sum(amount), sum(price) from buytbl group by groupName;

select groupName;
	from buytbl group by groupName having max(price)>= (select max(price) from buytbl);

create table if not exists maxGroupTbl 
   ( select groupName, prodName, amount, price from buytbl 
    where groupName = ( select  groupName 
                     from buytbl group by groupName
                             having max(price) >= ( select max(price) from buytbl)
                       )
    );

-- roll up
-- 소합계
select num, groupName, sum(price) from buytbl group by broupName, num with rollup;

select* from buytbl order by groupName;

create table if not exists testTbl2
( id int auto_increment primary key,  
	userName char(3),
    age int );
-- auto increment 사용하려면 조건 int 형이고 primary key / unique 이용

insert into testTbl2 values (null, '지민', 25);
insert into testTbl2 (userName, age) values('유나', 22);
insert into testTbl2 (userName, age) values('유경', 21);
select * from testTbl2;

alter table testTbl2 auto_increment=100;
insert into testTbl2 values (null,'지수',25);

-- 학번 240101 시작하기

create table if not exists testTbl2
(	id int auto_increment primary key,
	userName char(3),
    age int );
    
alter table testTbl2 auto_increment = 240101;
insert into testTbl2 (userName, age) values ('유경2', 21);

select * from testTbl2;

-- 증가차를 1씩이 아니라 3개씩 증가되게 만들기
set @@auto_increment_increment=3;
insert into testTbl2 (userName, age) values ('유경5', 21);
insert into testTbl2 (userName, age) values ('유경6', 21);

create table testTbl4 ( id int, fname varchar (50), lname varchar (50) );

use employees ;
select  * from employees.employees;
--             데이터베이스명.테이블명 
use sqldb;

use employees ;
select * from employees;
insert into employees  values ( 1003, '05/01/01', '정','현희', 'F', '20/10/05' );
insert into employees  values ( 1004, '05/01/01', '박','현희', 'M', '20/10/05' );
insert into employees  values ( 1005, '05/01/01', '이','현희', 'F', '20/10/05' );
insert into employees  values ( 1006, '05/01/01', '김','현희', 'M', '20/10/05' );

-- sqldb 사용하러 가기
use sqldb; 

-- insert문인데 select문을 이용해서 삽입하기
create table testTbl4  ( id int, fname varchar(50), lname varchar(50) ) ;

select emp_no, first_name, last_name from employees.employees ; 

insert into testTbl4 
     select emp_no, first_name, last_name from employees.employees ; 

select * from testTbl4 ;

select * from copyBuyTbl where prodName='운동화';
