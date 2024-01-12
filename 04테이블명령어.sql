--테이블 만들기
--형식 create table 테이블명(컬럼명 자료형 제약조건);
create table dept_mission(
        dno number(2),
        dname varchar(14),--가변형 문자형으로 실제자리수만큼의 바이트를 잡는다.
        loc varchar2(13));
        
create table emp_mission(
        eno number(4),
        ENAME VARCHAR2(10),
        dno number(2));
    
create table emp01(
        empno number(4),
        ename varchar2(14),
        sal number(7,3) ); --숫자 7자리 소숫점 3자리
        
    insert into emp01 values(1000,'홍길동' 123.5);
    insert into emp01(ename, empno, sal) values('이순신', 1001, 256.7);
    
-- 행에 특정 열만 넣는다.
insert into emp01(empno,ename) value(1002, '김수민');
insert into emp01 (sal) values(100);
select * from emp01;
--이름을 공백으로 넣기
insert into emp01 ( empno, ename, sal) values (1004,'',50);

desc emp01;

--입사일 컬럼 추가하기
-alter table emp01;
    add hire date;
    
--'박수미', 1010, 80, 23/01/09 레코드 삽입하기
insert into emp01(ename, empno, sal, hire) values ('박수미', 1010, 80, '23/01/09');
--1011,'최경수',0,24/01/08\
insert into emp01(empno, ename, sal, hire) values (1011,'최경수',0,sysdate);

--수정하기
--update 테이블명 set 컬럼명 = 새로운 값 where 조건절
--홍길동 급여를 200으로 바꾸기
update emp01 set sal = 200 where enae = '홍길동';

--번호가 1004번인 사람의 이름을 '이진수' 로 바꾸기
uodate emp01 set ename = '이진수' where empno = 1004;

--번호가 1010인 사람의 급여를 현재 급여에 100 더하기, ㅣㅂ사일을 22년 10월 25일로 바꾸기
update emp01 set sal = sal+100, hire = '22/10/25' where empno = 1010;

--모든 사람의 급여를 200만원씩 인상
update emp01 set sal = sal +200;

update emp01 set sal = nvl (sal+200,200);

select * from emp01;

--
--delete from 테이블명 where 조건절
--급여가 500이 넘는 사람 삭제
delete from emp01 where sal >= 500;

--트랜젝션 
delete from emp01;
rollback;

select * from emp01;
commit;

update emp01 set sal = nvl(sal + 200, 200);

--모든 사람의 입사일을 오늘 날짜로 수정하시오
update emp01 set hire = sysdate ;

--제약 조건
select * from dept ;
--insert into dept values (10, 'test', 'test');
--10은 primary key 구조로 만들어서 유일해야하므로 오류가 남.
--insert into dept values (null, 'test', 'test');
--not null 이어야해서 null 도 오류

create table pTab(
        code number(4) primary key,
        name varchar2(14)
        );
        
select * from user_constraints where table_name = 'PTAB';

--name 칼럼의 제약조건을 not null로 고치기 - 고치기가 아니라 추가로 생각함
alter table pTab
  modify (name varchar2(14) not null);

--데이터 삽입하기
insert into ptab(code, name) values(1010,'a');
--insert into ptab(code, name) values(1010,'a');
--insert into ptab(code, name) values(1011,null);

--id 컬럼 추가하기 varchar2(10)
alter table ptab
    add id varchar2(10);
    
desc pTab;

--id 칼럼에 제약 조건은 unique 만들기
alter table ptab
    modify id varchar2(10) unique;

select * from user_constraints where table_name = 'PTAB';

insert into ptab(code, name, id) values(1012,'c','a100');
--insert into ptab(code, name, id) values(1013,'d','a100');(유일키 위배)
 
-- 테이블 구조 변경하기
-- 구조를 바꾸면 테이블 자료가 삭제된다
alter table emp01
    add(birth date);
    
alter table emp_mission
    add(deptno number(4), addr varchar2(20));

--구조 수정
alter table emp01
    modify(ename varchar2(14));
    
alter table emp_mission
    modify(ename varchar2(25));
    
--구족 지우기
alter table emp01
    drop column birth;
    
alter table emp_mission
    drop column deptno; 
alter table emp_mission
    drop column addr;
    
--테이블의 구조 보기
desc emp01;
desc emp_mission;
desc emp_mi;

--이름 바꾸기 
rename emp_mission to emp_mi;

--테이블 삭제하기
--drop table 테이블명
drop table emp_mi;

select * from emp;

create table emp_copy
as 
select * from emp;

desc emp;
desc emp_copy;

--emp_copy테이블의 comm컬럼 삭제하기
alter table emp_copy
    drop column comm;
    
--emp_copy 테이블의 hiredate 컬럼의 이름을 hire 로 바꾸기
alter table emp_copy
rename column hiredate to hire;

--모든 데이터 제거
delete from emp_copy;
truncate table emp_copy;

--
select * from user_tables; -- 데이터 베이스안에 테이블의 목록들을 모두 본다
select * from user_views;

select* from all_tables;
select * from all_tables where table_name='EMP';

select * from dba_tables;
--데이터 베이스 과리자는 오라클에서 이름이 지정되어있음 sys(장치관리자 - 하드웨어, 논리적 장치 - 소프트웨어)
--system 논리적 장치관리함 - 소프트웨어
--필요에 따라서 사용자를 만들어 쓸 수 있다

select * from emp01(
