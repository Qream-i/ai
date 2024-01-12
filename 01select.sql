select*from emp;
select*from student;
select * from dept;
select dname from dept;

select empno, ename, sal, job from emp;
/*  ������ �ּ�  */
--  ���� �ּ�
-- stu_id, stu_name, sex
select stu_id, stu_name, sex from student;

-- ��������� - ���� �÷�(��)�� �� �� �ִ�.
select empno, ename, sal, sal*12, job from emp;
select empno, ename, sal, sal*12,sal*12*0.33, job from emp;
select empno as �����ȣ, ename as �����, sal as �޿�, sal*12 as ���� ,sal*12*0.33 as ������, job as ���� from emp;
--�÷��� as ��Ī
select empno �����ȣ, ename �����, sal �޿�, sal*12 ���� ,sal*12*0.33  ������, job ���� from emp;
--as�� ���� ����

select * from salgrade;
select grade,losal, losal+1500, hisal, hisal+1000 from salgrade;
--��Ī ���̱� 
select grade ���,losal �����ݾ�, losal+1500 �λ������ݾ�, hisal �ִ�ݾ�, hisal+1000 �λ��ִ�ݾ� from salgrade;

--null�̶�? 0�̳� ������� �ƴ� ��Ȯ��, �� �� ���ٴ� �ǹ��̴�.
select * from emp;

--comm ���ʽ��� + 100����������
select comm, comm+100 from emp;
select comm, nvl(comm,0)+100 "�� �� ��" from emp; --nvl(comm,0) null�̸� 0���� �ƴ϶�� comm������
--��Ī�� ���⸦ �ְ� ������ "" �ȿ� �ֱ�

select ename || '�� ������ ' || job || ' �Դϴ�.' ���� from emp;

select * from student;
--�������� ���̴� 24���Դϴ�
select stu_name ||'�� ���̴� ' || age || '�Դϴ�.' ���� from student;

--�ߺ� �����ϱ�
select distinct cou_id from student;

select * from emp;
--�μ����� ����
select distinct deptno from emp;

--�μ����� 20�� ����� ����
select * from emp where deptno = 20;

--job �� ����� �͸� ����
select * from emp where job = '���' ;

--job �� ����̰ų� ������ �͸� ����
select * from emp where job = '���' or job = '����' ;

--sal 400 �̻��� ����� �����ȣ, �̸�, �޿�����
select empno �����ȣ, ename �̸�, sal �޿� from emp where sal >=400;

select empno �����ȣ, ename �̸�, sal �޿� from emp where sal >=400 and job = '����';

--�Ի�����2005/01/01 ������ �Ի��� ���
select * from emp where hiredate < '05/01/01';

select * from emp where hiredate < '06/01/01' and hiredate < '07/12/31';

--�̾� ���� ���� ���
select * from emp where ename like '��%';

select * from emp where ename like '��%' or ename like '��%';

select * from emp where not ename like  '��%' ;

--�̸� �߰��۾��� '��'�� ���
select * from emp where ename like '%��%';

--in ~�ȿ�
--job ����̰ų� �����̰ų� ������ ��� ����ϱ�
select * from emp where job = '����' or job = '����' or job= '���';
select * from emp where job in('���','����','����');
--in() ��ȣ �ȿ� �ڷᰡ ������ ���

--between ���ۼ� and Ȧ�� ���ۼ� ~ ���� ����
--300<=sal<=600 ������ ��� ����ϱ�
select * from emp where sal between 300 and 600;

--�Ի��� 2006/01/01~2007/12/31 ���̿� �Ի��� ���
select * from emp where hiredate between '06/01/01' and '07/12/31';

--mgr(���� ���)�� 1010~1020����
select * from emp where mgr between 1010 and 1020;

--comm�� null�� ��� ����ϱ�
select * from emp where comm is null;

--�̸� ������������ ����ϱ�
select * from emp order by ename asc;
select * from emp order by ename;

--�޿� ������������ ����ϱ�
select * from emp order by sal desc;

--�μ� ��ȣ ������������ ����ϱ�
select * from emp order by empno;

--job ������������ ����ϱ�
select * from emp order by job desc;

--�μ���ȣ ��������, ���� �����ϸ� �����ȣ ������� ����ϱ�
select * from emp order by deptno, empno;

--�μ���ȣ ��������, ���� �����ϸ� sal ����������� ����ϱ�
select * from emp order by deptno, sal desc;

--job�� �����̰ų� ������ ����� job ������������ ����ϱ�
select * from emp where job in ('����','����') order by job asc;

--deptno�� 10�̰ų� 30�� ����� mgr ��������, deptno ������������
select * from emp where deptno=10 or deptno=30 order by mgr,deptno ;

--������
select * from group_star 
union
select * from single_star ;

--������ + ������(�ߺ��Ǵ°� �ι�)
select * from group_star 
union all
select * from single_star ;

--������
select * from group_star  
intersect
select * from single_star ;

--������ (�׷�Ȱ���� �ϴ� ���)
select * from group_star 
minus
select * from single_star ;

--������ (�̱�Ȱ���� �ϴ� ���)
select * from single_star 
minus
select * from group_star ;

--�޿��� 300 ������ ����� �����ȣ, ����̸�, �޿��� ����ϱ�
select empno, ename, sal from emp where sal<=300;
--�̸��� '����ȣ'�� ����� �����ȣ, �����, �޿��� ����ϱ�
select empno, ename, sal from emp where ename = '����ȣ';
--�޿��� 250�̰ų� 300�̰ų� 500�� ������� �����ȣ�� ������ �޿��� ����ϱ�
select empno, ename, sal from emp where sal = 250 or sal =300 or sal=500;
--�޿��� 250�� 300�� 500�� �ƴ� ����� ����ϱ�
select empno, ename, sal from emp where not sal in(250,300,500);
--�̸��� '��'���� �����ϴ� ����� �̸� �߿� '��'�� �����ϴ� ����� �����ȣ�� ����̸� ����ϱ�
select empno, ename from emp where ename like '%��%'or ename like '��%';
--�����(mgr)�� ���� ����� ����ϱ�
select * from emp where mgr is null;
--�μ���ȣ�� ���� ������� ����ϵ� ���� �μ� ���� ����� ����� ��� �Ի����� ���� ������ ������� ����ϱ�
select * from emp order by hiredate, job;
