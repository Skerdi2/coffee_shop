/*create schema coffee_Shop;
use coffee_shop;*/

create table user(
user_id int primary key auto_increment,
last_name varchar (50),
first_name varchar(50),
username varchar(255),
roli enum('admin', 'user'),
email varchar(255),
phone_num int,
modified_time date,
dashboard_dashboard_id int,
foreign key(dashboard_dashboard_id) references	dashboard(dashboard_id)
);


create table dashboard(
dashboard_id int primary key not null,
total_rev decimal(12,2),
total_customers int,
`date` date
);

create table bill(
bill_id int primary key not null auto_increment,
total_ammount decimal(12,2),
date_time timestamp ,
location varchar(45),
price int,
dashboard_dashboard_id int,
foreign key(dashboard_dashboard_id) references	dashboard(dashboard_id)
);

create table category(
catogry_int int primary key not null auto_increment,
name varchar(50),
description	 text,
dashboard_dashboard_id int,
foreign key(dashboard_dashboard_id) references	dashboard(dashboard_id)	
 );
 
 create table product (
 product_id int primary key not null auto_increment,
 name varchar (100),
 price decimal(10,1),
description text,
stock_quantity int,
category_category_id int, 
foreign key(category_category_id) references category(category_id)	
 );
 
 alter table category rename column catogry_int to category_id;