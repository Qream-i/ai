create table card(
    cardNumber number(10) not null primary key,
    accountNumber number(12) not null,
    cardKind varchar2(8),
    orderDate date,
    limitAmount number(15),
    payment date
    );

insert into card values(
    1001, 556677, '비자', sysdate, 5000,'2024/01/27'
);
insert into card values(
    1002, 556677, '비자', sysdate, 5000,'2024/01/27'
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

insert into userTbl values('이승기', '87/12/10', '서울','011-111-1111');
insert into userTbl values('김경호', '71/12/10', '전남','011-111-1111');
insert into buyTbl values('이승기', '운동화', 10000,1);
insert into buyTbl values('김경호', '노트북', 100000,2);


--은행 부모 , master 주
create table bank(
    bankName varchar2(20) not null primary key,
    jijum varchar2(20) not null);
insert into bank values('국민','강동');
insert into bank values('신한','강남');
insert into bank values('우리','송파');
--예금계좌, ㅔ이블 자식, sub, 종
create table deAcc(
    bankName varchar2(20) not null primary key,--조건 부모키와 동일한 자료형과 name을 가져야 한다.
    accKind varchar2(20),
    constraint bankNaame_fk foreign key (bankName) references bank(bankName)
    --형식 constraint 외래키명 foreign key(외래키 대상 컬럼명) referneces 부모 테이블명 (외래키대상컬럼명)
);

insert into deAcc values('우리', '일반계좌');
insert into deAcc values('신한', '대출계좌');
insert into deAcc values('국민', '증권계좌');
--insert into deAcc values('카뱅', '일반계좌');
--부모 테이블 안에 카뱅이 없기 때문에 해당 문장은 에러가 발생함

--고객 테이블 -부모, 주 , master
create table custom(
    cardNumber number(10) not null primary key,
    cName varchar2(20)
);
drop table custom;
--카드 테이블 - 자식, sub, 종
create table cardTbl(
    cardNumber number(10) not null primary key,
    limitPrice number(10),
    CONSTRAINT cardN_fk foreign key(cardNumber) references custom(cardNumber)
);

insert into custom values(1234,'홍길동');
insert into custom values(1235,'홍길동');
insert into custom values(1236,'홍길동');

select * from custom;
insert into cardTbl values(1236,9000);
insert into cardTbl values(1234,3000);

select * from cardTbl;
