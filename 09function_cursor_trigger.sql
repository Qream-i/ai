-- stored proedure program
-- 설계 --> 인스턴스화 --> 사용
use sqldb;

delimiter $$
create procedure userProc()
begin
	select * from usertbl;
end $$
delimiter ;
call userProc();
desc buytbl;
desc usertbl;
-- 테이블의 구조 보기 

-- 파라미터를 넣은 처리형식

delimiter $$
create procedure userProc1(in_addr varchar(2))
begin
	select * from usertbl where addr = '서울';
end $$
delimiter ;
call userProc1('서울');

-- userId BBK 또는 LJB 검색하기
delimiter $$
create procedure userProc2(in_userId1 varchar(8), in_userId2 varchar(8))
begin
	select * from usertbl where userId in (_userId1, _userId2);
end $$
delimiter 
call userProc2('BBK', 'LJB');

-- 파라미터 값 내보내기
-- 서울에 사는사람이 몇명인지 변수에 담아서 외부로 내보내기
-- 파라미터를 넣은 처리방식

delimiter $$
create procedure userProc3(in _addr char(2), out _result int)
begin
	select count(addr) into _result from usertbl where addr = addr;
end $$
delimiter 
call userProc3('서울', @result);

select * from buytbl;

-- 문제 groupName을 입력하면 price 가 가장 큰 것을 찾기, 변수로 받기

desc buytbl;
use buytbl;
delimiter $$
create procedure buyPro1(in _gN char(4), out _price int)
begin
/* 여러개의 출력값을 얻으려면 select 문을 여러개 쓰기 */
	select distinct prodName into _pN from buytbl where groupName = _gN;
	select max(price) into _price from buytbl where groupName = _gN;
end $$
delimiter ;
call buyPro1('전자', @priceVar);
call buyPro1('의류', @priceVar);
select @priceVar;

-- 2) procdure function 함수 결과 1개 나온다. return 452페이지
-- 주의사항 : 사전에 해야하는 작업 - 함수 생성 권한 제한 풀어주기
set global log_bin_trust_function_creators = 1;
use sqldb;
drop function if exists unseFunc;
delimiter $$
create function userFunc(value1 int, value2 int)
	returns int
begin
	return value1 + value2;
end $$
delimiter ;
select userFunc (100, 200);

-- 요구사항 출생년도를 입력하면 나이가 생성되는 함수 만들기
delimiter $$
create function ageFun(birthYear int)
	returns int
begin
	declare age int;
    set age = year(curdate()) - birthYear;
    return age;
end $$
delimiter ; 

select ageFun(2000) into @age2000 ;
select ageFun(2020) into @age2020 ;
select @age2000 - @age2020;

drop table cUserTbl; 
create table cUserTbl
as
select * from usertbl;

select * from cUserTbl;

-- 컬럼 추가하기
alter table cUserTbl
 add column years int;
 
 -- 요구사항 mDate를 이용해서 근무년수를 구하는 함수를 만들기
 drop function yearsFun;
delimiter $$
create function yearsFun( y1 date) -- mDate 컬럼을 입력으로 받기
	returns int
begin
	declare yy int;
    set yy = year(curdate()) - year(y1);
    return yy;
end $$
delimiter ; 

-- 함수를 호출해서 근무년수 구하기
select mDate into @mDate from cUserTbl where userId = 'BBK';
select @mDate;
select yearsFun ( @mDate ) into @years;

update cUserTbl set years = @years where userId = 'BBK';

SET SQL_SAFE_UPDATES = 0;
select mDate into @mDate from cUserTbl where userId = 'EJW';
select @mDate;
select yearsFun ( @mDate ) into @years;

update cUserTbl set years = @years where userId = 'EJW';
select * from cUserTbl;


select mDate into @mDate from cUserTbl where userId = 'KBS';
select @mDate;
select yearsFun ( @mDate ) into @years;

update cUserTbl set years = @years where userId = 'KBS';
select * from cUserTbl;

-- 3) cursor 반복처리
-- 포인터 : 가르키다.
-- 파일 시작 BOFR : begin of file , EOF : end of file
-- 처리 순서 1단계 파일을 연다 2단계 파일을 읽는다 (행단위) 3단계 파일 끝 4단계 파일을 닫는다.

-- 커서 형식
-- delimiter $$
--  create procedure cursorProc()
--  begin
--   -- 변수 선언 6줄 ~ 10줄 까지
--   -- 커서 선언 12줄
--   -- 반복 조건 15줄
--   -- 커서 열기
--   -- 반복문
--   -- 결과 출력
--   -- 커서 닫기
--  end $$
-- delimiter ; 

-- 고객의 평균 키를 구하는 프로시저  커서 이용하기

delimiter $$
 create procedure cursorProc()
 begin
  -- 변수 선언 6줄 ~ 10줄 까지
  declare userHeight int; -- 고객의 키
  declare cnt int default 0; -- 고객의 인원수
  declare totalHeight int default 0; -- 키의 합계
  declare endOfRow boolean default false;
  -- 커서 선언 12줄
  declare userCursor Cursor for
	select height from usertbl; -- 문제가 키의 평균 값을 구하는 것이기 때문에
  -- 반복 조건 15줄
  declare continue handler 
	for not found set endOfRow = TRUE;
  -- 커서 열기
  open userCursor;
  -- 반복문
  cursor_loop : Loop
	fetch useCursor into userHeight;
    if endOfRow then
		leave cursor_loop;
	end if ;
    set cnt = cnt+1;
    set totalHeight = totalHeight + userHeight;  
  end loop cursor_loop;
  -- 결과 출력
  select concat('고객 키의 평균 ===>', (totalHeight / cnt)) ;
  -- 커서 닫기
  close userCursor;
 end $$
delimiter ; 

-- 호출하기 
call cursorProc();

-- 고객테이블 고객등급 열을 하나 추가하기 등급 넣기 
use sqldb;
select * from usertbl ;


select * from buytbl order by userid;

drop procedure gP;

delimiter $$
 create procedure  gP()
 begin
   -- 변수 선언 6줄~10줄까지
   declare id varchar(10) ; -- 사용자 id 'BBK'
   declare hap bigInt ; -- 총구매합 1920
   declare userGrade varchar(20) ; -- 등급 '최우수고객' 
   declare endOfRow boolean default False ; 
   -- 커서 선언  
   declare userCursor cursor for 
      select  u.userid, sum( b.price * b.amount ) 
      from  buytbl b
         right outer join  usertbl u
         on b.userid = u.userid
      group by u.userid, u.name ;   
         
   -- 반복 조건  
   declare continue handler
       for not found set endOfRow = TRUE;
       
   -- 커서 열기
   open userCursor ;
   -- 반복문
   grade_loop : Loop 
      fetch  userCursor into id, hap ; 
      if endOfRow  then
          leave grade_loop;
      end if; 
      
      case 
        when ( hap >= 1500 ) then set userGrade = '최우수고객' ; 
        when ( hap >= 1000 ) then set userGrade = '우수고객' ; 
        when ( hap >= 1 ) then set userGrade = '일반고객' ; 
        else set userGrade = '잠재고객' ; 
      end case ;
    
      update usertbl set r1 = userGrade where userId = id; 
      
   end Loop  grade_loop ;
   
   -- 커서 닫기
   close userCursor ;
 end $$
delimiter ;

call gP();


select * from usertbl;

alter table usertbl
  add column r1 varchar(20) ; 
  
-- 4) 트리거
-- 예) 사원 테이블 삽입된 이후에 기본적인 인적사항이 자동 삽입되면 좋겠다. 급여가 지금된 후에 세금 테이브에 자동 저장
-- 사용은 insert update delete
-- 직접 실행은 안되고 이벤트가 발생했을 때 자동 실행이 된다

create database if not exists testDB;
use testDb;

create table if not exists testTbl (id int, txt varchar(10));
insert into testTbl values (1, '레드벨벳');
insert into testTbl values (2, '잇지');
insert into testTbl values (3, '블랙핑크');
select * from testTbl;
drop trigger if exists testTrg;


delimiter // 
	create trigger testTrg
		after delete 
        on testTbl
        for each row
	begin
		set @msg = '가수 그룹이 삭제됩니다.';
    end//
delimiter ;

set @msg = ' ' ;
insert into testTbl values (4, '마마무');
select @msg;

-- pg 467
create table backup_userTbl 
 (
  userID     CHAR(8) NOT NULL PRIMARY KEY, -- 사용자 아이디(PK)
  name       VARCHAR(10) NOT NULL, -- 이름
  birthYear   INT NOT NULL,  -- 출생년도
  addr        CHAR(2) NOT NULL, -- 지역(경기,서울,경남 식으로 2글자만입력)
  mobile1   CHAR(3), -- 휴대폰의 국번(011, 016, 017, 018, 019, 010 등)
  mobile2   CHAR(8), -- 휴대폰의 나머지 전화번호(하이픈제외)
  height       SMALLINT,  -- 키
  mDate       DATE,  -- 회원 가입일
  modType char(2), -- 변경된 타입, '수정' 또는 '삭제'
  modDate date, -- 변경된 날짜
  modUser varchar(256) -- 변경한 사용자 
 ) ;
 
 -- 트리거 작성하기
 
 delimiter //
 create trigger backUserTbl
