create database Prateek;
use Prateek;
create table Login(username varchar(50),password varchar(50));




create table Product(productId int,productName varchar(20),minSell_Quantity int,price int,quantity int);
select*from Product;
insert into Product values(1,'abc',12,100,50);
insert into Login values( 'aaa','123');