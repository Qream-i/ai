use sqldb;
select * from usertbl;
select * from buytbl;

select userid, name from usertbl
union all
select userid, price from buytbl;

select userid, name from usertbl
union -- 중복 되는 것 제거
select userid, prodName from buytbl;
-- 요구사항 이름 전화번호로 주소록을 만들기. 단, 전화번호 없는사람은 제외
select name from  usertbl where mobile1 is null;
select name, mobile1, mobile2 from usertbl
	where name not in
    (select name from  usertbl where mobile1 is null);
    
-- sql 구문을 프로그래밍처럼 만들 수 있다
drop procedure if exists ifProc;
--스트어드 프로스저
delimiter $$
create procedure ifProc()
begin
	declare var1 int;
    set var1 = 100;
    if var1 = 100 then 
		select '100입니다.';
	else 
		select '아닙니다.';
	end if;
end$$
delimiter ;
call ifProc();

call ifProc();

select * from employees;
drop procedure if exists ifProc2;
use employees;
delimiter $$
create procedure ifProc2()
begin
	declare hiredate date; -- 변수선언
    declare curdate date;
    declare days int;
    
    select hire_date into hiredate from employees.employees
    where emp_no=1001;
    
    set curDate = current_date();
    set days = datediff(curDate, hiredate);
    
    if(days / 365) >=5 then
		select concat('입사한지 ',days, '일이나 지났습니다. 축하하니다.');
	else
		select concat('입사한지 ',days, '일 밖에 안됐네요. 열심히 해요.');
	end if;
end$$
delimiter ;
call ifProc2();

-- 298pg 교재에 있는 것 해보기
drop procedure if exists ifProc3;
delimiter $$
create procedure ifProc3()
begin
	declare point int;
    declare credit char(1);
    set point = 77;
    
    if point >= 90 then 
		set credit = 'A';
	elseif point >= 80 then
		set credit = 'B';
	elseif point >= 70 then
		set credit = 'C';
	elseif point >= 60 then
		set credit = 'D';
	else 
		set credit ='F';
	end if;
    select concat('취득점수==>' ,point), concat('학점==>', credit);
end $$
delimiter ;
call ifProc3();


-- view

use sqldb;
select * from usertbl;

create view vuser
as
select * from usertbl;

select * from vuser;

-- 뷰 사용하는 이유? 1.보안 2. 복잡한 쿼리문 단수화 시키기

use sqldb;
create view v1
as
select u.userid as 'user id', u.name 'user name', b.prodName as 'product name'
	from usertbl u
	inner join buytbl b
	on u.userid = b.userid;

select * from v1;
select 'user id', 'user name', 'product name' from v1 
	where 'user id' = 'KBS' order by 'product name';
    
-- view 수정하기
alter view v1 
as
select  u.name as 'name', u.addr 'addr', concat_ws('-', b.mobile1, b.mobile2) 'tel'
from usertbl u
inner join buytbl b
on u.userid = b.userid;

select * from v1;
select 'name', 'tel' from v1;

create or replace view v1
as
select name, birthyear from usertbl where name = '김범수';

-- 뷰 삽입 테이블이 삽입 될까?
create table cUsertbl
as
select * from usertbl ;

-- 뷰 만들기
create or replace view v2
as
select userid, name, birthYear, addr, height from cUsertbl;

select * from v2;
insert into v2 values ('HGD','홍길동', 2020, '서울', 175 );
desc v2;

select * from cUsertbl;
insert into cUsertbl(userid, name, birthyear, addr)
	values("ADM", '관리자',2021,'인천');
    
desc v2;

select * from v2;
-- 홍길동 birthyear 2019 수정하기
update v2 set birthyear = 2019 where name = '홍길동';

delete from v2 where name='관리자';

drop view v2;


-- 테이블스페이스 : 물리적(실제) 공간
-- DBA 데이터베이스 관리 - 서버계정, 공간할당

-- 인덱스
-- 자료를 찾을 때 색인표를 붙여두는 것
-- 목표 : 빠르게 검색하기 위함
-- B-Tree

drop procedure p4;
create table testTbl
	(id int auto_increment primary key, name char(10) );
insert into testTbl values (null, '홍길동');
delimiter $$
create procedure p4( in inVar char(10), out outVar int )
begin
	insert into testTbl values (null, inVar);
    select count(id) into outVar from testTbl;
end $$
delimiter ;
call p4('이순신', @countVar);
select @countVar;

-- 445쪽
drop procedure ifelseProc;
delimiter $$
create procedure ifelseProc( in userName varchar(10), out byear int)
begin
	declare byear int;
    declare nameOut varchar(10);
    select birthyear into byear from userTbl
		where name = username;
	if (byear>= 1980) then
		select '아직 젊군요..';
	else
		select '나이가 지긋하시네요.';
	end if;
end$$

delimiter ;
call ifelseProc('조용필', @yearOut);

select @yearOut; 