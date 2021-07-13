--2021-07-13
create table testTable(
userCode NUMBER(20),
userName VARCHAR2(50)
);
 
insert into testTable VALUES ('1234','홍길동');
insert into testTable VALUES ('5678','홍길순');
insert into testTable VALUES ('3435','둘리');
 
select * from testTable;
commit;