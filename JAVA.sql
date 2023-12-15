create database JAVAOOP
use JAVAOOP



create table account 
(
username varchar(30) primary key,
pass varchar(20) not null,
ChucVu varchar(20) not null
)

create table cars 
(
CARID varchar(30) primary key,
BRAND varchar(20) not null,
MODEL varchar(20) not null,
car_status varchar(20) not null,
PRICE int not null
)

create table customer
{
CUSID varchar(30) primary key,
HoTen varchar(20) not null,
DiaChi varchar(20) not null,
SoDienThoai varchar(20) not null
}

create table car_rented
{
CARID varchar(30),
CUSID varchar(30),
RENTID varchar(30),
RENTDATE date not null,
RETURNDATE date not null
}



drop table account
select * from account