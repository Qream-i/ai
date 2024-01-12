--���̺� �����
--���� create table ���̺��(�÷��� �ڷ��� ��������);
create table dept_mission(
        dno number(2),
        dname varchar(14),--������ ���������� �����ڸ�����ŭ�� ����Ʈ�� ��´�.
        loc varchar2(13));
        
create table emp_mission(
        eno number(4),
        ENAME VARCHAR2(10),
        dno number(2));
    
create table emp01(
        empno number(4),
        ename varchar2(14),
        sal number(7,3) ); --���� 7�ڸ� �Ҽ��� 3�ڸ�
        
    insert into emp01 values(1000,'ȫ�浿' 123.5);
    insert into emp01(ename, empno, sal) values('�̼���', 1001, 256.7);
    
-- �࿡ Ư�� ���� �ִ´�.
insert into emp01(empno,ename) value(1002, '�����');
insert into emp01 (sal) values(100);
select * from emp01;
--�̸��� �������� �ֱ�
insert into emp01 ( empno, ename, sal) values (1004,'',50);

desc emp01;

--�Ի��� �÷� �߰��ϱ�
-alter table emp01;
    add hire date;
    
--'�ڼ���', 1010, 80, 23/01/09 ���ڵ� �����ϱ�
insert into emp01(ename, empno, sal, hire) values ('�ڼ���', 1010, 80, '23/01/09');
--1011,'�ְ��',0,24/01/08\
insert into emp01(empno, ename, sal, hire) values (1011,'�ְ��',0,sysdate);

--�����ϱ�
--update ���̺�� set �÷��� = ���ο� �� where ������
--ȫ�浿 �޿��� 200���� �ٲٱ�
update emp01 set sal = 200 where enae = 'ȫ�浿';

--��ȣ�� 1004���� ����� �̸��� '������' �� �ٲٱ�
uodate emp01 set ename = '������' where empno = 1004;

--��ȣ�� 1010�� ����� �޿��� ���� �޿��� 100 ���ϱ�, �Ӥ������� 22�� 10�� 25�Ϸ� �ٲٱ�
update emp01 set sal = sal+100, hire = '22/10/25' where empno = 1010;

--��� ����� �޿��� 200������ �λ�
update emp01 set sal = sal +200;

update emp01 set sal = nvl (sal+200,200);

select * from emp01;

--
--delete from ���̺�� where ������
--�޿��� 500�� �Ѵ� ��� ����
delete from emp01 where sal >= 500;

--Ʈ������ 
delete from emp01;
rollback;

select * from emp01;
commit;

update emp01 set sal = nvl(sal + 200, 200);

--��� ����� �Ի����� ���� ��¥�� �����Ͻÿ�
update emp01 set hire = sysdate ;

--���� ����
select * from dept ;
--insert into dept values (10, 'test', 'test');
--10�� primary key ������ ���� �����ؾ��ϹǷ� ������ ��.
--insert into dept values (null, 'test', 'test');
--not null �̾���ؼ� null �� ����

create table pTab(
        code number(4) primary key,
        name varchar2(14)
        );
        
select * from user_constraints where table_name = 'PTAB';

--name Į���� ���������� not null�� ��ġ�� - ��ġ�Ⱑ �ƴ϶� �߰��� ������
alter table pTab
  modify (name varchar2(14) not null);

--������ �����ϱ�
insert into ptab(code, name) values(1010,'a');
--insert into ptab(code, name) values(1010,'a');
--insert into ptab(code, name) values(1011,null);

--id �÷� �߰��ϱ� varchar2(10)
alter table ptab
    add id varchar2(10);
    
desc pTab;

--id Į���� ���� ������ unique �����
alter table ptab
    modify id varchar2(10) unique;

select * from user_constraints where table_name = 'PTAB';

insert into ptab(code, name, id) values(1012,'c','a100');
--insert into ptab(code, name, id) values(1013,'d','a100');(����Ű ����)
 
-- ���̺� ���� �����ϱ�
-- ������ �ٲٸ� ���̺� �ڷᰡ �����ȴ�
alter table emp01
    add(birth date);
    
alter table emp_mission
    add(deptno number(4), addr varchar2(20));

--���� ����
alter table emp01
    modify(ename varchar2(14));
    
alter table emp_mission
    modify(ename varchar2(25));
    
--���� �����
alter table emp01
    drop column birth;
    
alter table emp_mission
    drop column deptno; 
alter table emp_mission
    drop column addr;
    
--���̺��� ���� ����
desc emp01;
desc emp_mission;
desc emp_mi;

--�̸� �ٲٱ� 
rename emp_mission to emp_mi;

--���̺� �����ϱ�
--drop table ���̺��
drop table emp_mi;

select * from emp;

create table emp_copy
as 
select * from emp;

desc emp;
desc emp_copy;

--emp_copy���̺��� comm�÷� �����ϱ�
alter table emp_copy
    drop column comm;
    
--emp_copy ���̺��� hiredate �÷��� �̸��� hire �� �ٲٱ�
alter table emp_copy
rename column hiredate to hire;

--��� ������ ����
delete from emp_copy;
truncate table emp_copy;

--
select * from user_tables; -- ������ ���̽��ȿ� ���̺��� ��ϵ��� ��� ����
select * from user_views;

select* from all_tables;
select * from all_tables where table_name='EMP';

select * from dba_tables;
--������ ���̽� �����ڴ� ����Ŭ���� �̸��� �����Ǿ����� sys(��ġ������ - �ϵ����, ���� ��ġ - ����Ʈ����)
--system ���� ��ġ������ - ����Ʈ����
--�ʿ信 ���� ����ڸ� ����� �� �� �ִ�

select * from emp01(
