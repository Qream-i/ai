create table card(
    cardNumber number(10) not null primary key,
    accountNumber number(12) not null,
    cardKind varchar2(8),
    orderDate date,
    limitAmount number(15),
    payment date
    );

insert into card values(
    1001, 556677, '����', sysdate, 5000,'2024/01/27'
);
insert into card values(
    1002, 556677, '����', sysdate, 5000,'2024/01/27'
);
insert into card values(
    1003, 556697, 'master', sysdate, 10000,'2024/01/20'
);
insert into card values(
    1004, 556680, 'check', sysdate, null,null
);

select * from card;

create table userTbl(
    userName varchar2(10) not null primary key,
    birthyear date not null,
    addr varchar(20) not null,
    mobile VARCHAR(15)
);

drop table userTbl;
drop table buyTbl;

create table buyTbl(
    userName varchar2(10) not null primary key,
    prodName varchar2(20) not null,
    price number(10) not null,
    amount number(5) not null,
    constraint useName_fk foreign key(userName)references userTbl(userName)
);

insert into userTbl values('�̽±�', '87/12/10', '����','011-111-1111');
insert into userTbl values('���ȣ', '71/12/10', '����','011-111-1111');
insert into buyTbl values('�̽±�', '�ȭ', 10000,1);
insert into buyTbl values('���ȣ', '��Ʈ��', 100000,2);


--���� �θ� , master ��
create table bank(
    bankName varchar2(20) not null primary key,
    jijum varchar2(20) not null);
insert into bank values('����','����');
insert into bank values('����','����');
insert into bank values('�츮','����');
--���ݰ���, ���̺� �ڽ�, sub, ��
create table deAcc(
    bankName varchar2(20) not null primary key,--���� �θ�Ű�� ������ �ڷ����� name�� ������ �Ѵ�.
    accKind varchar2(20),
    constraint bankNaame_fk foreign key (bankName) references bank(bankName)
    --���� constraint �ܷ�Ű�� foreign key(�ܷ�Ű ��� �÷���) referneces �θ� ���̺��� (�ܷ�Ű����÷���)
);

insert into deAcc values('�츮', '�Ϲݰ���');
insert into deAcc values('����', '�������');
insert into deAcc values('����', '���ǰ���');
--insert into deAcc values('ī��', '�Ϲݰ���');
--�θ� ���̺� �ȿ� ī���� ���� ������ �ش� ������ ������ �߻���

--���� ���̺� -�θ�, �� , master
create table custom(
    cardNumber number(10) not null primary key,
    cName varchar2(20)
);
drop table custom;
--ī�� ���̺� - �ڽ�, sub, ��
create table cardTbl(
    cardNumber number(10) not null primary key,
    limitPrice number(10),
    CONSTRAINT cardN_fk foreign key(cardNumber) references custom(cardNumber)
);

insert into custom values(1234,'ȫ�浿');
insert into custom values(1235,'ȫ�浿');
insert into custom values(1236,'ȫ�浿');

select * from custom;
insert into cardTbl values(1236,9000);
insert into cardTbl values(1234,3000);

select * from cardTbl;