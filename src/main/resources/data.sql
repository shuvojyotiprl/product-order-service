insert into CUSTOMER 
(id,name,tier) values (122332,'abdul',2);

insert into CUSTOMER 
(id,name,tier) values (122322,'ashim',3);

insert into CUSTOMER 
(id,name,tier) values (128932,'kiran',3);

insert into CUSTOMER 
(id,name,tier) values (999836,'chatur',1);

insert into CUSTOMER 
(id,name,tier) values (233431,'neha',2);


insert into product
(id,category,name,price) values (102,'Mobile','Realme 6 pro',18999.00);

insert into product
(id,category,name,price) values (103,'Mobile','I phone 12',118999.99);

insert into product
(id,category,name,price) values (104,'Laptop','Dell G3 Gaming X ultra',99999.99);

insert into product
(id,category,name,price) values (105,'Earphone','Skull candy port play',2999.29);

insert into product
(id,category,name,price) values (106,'Earphone','One Plus Ear Buds',5999.29);

insert into product
(id,category,name,price) values (107,'Earphone','boss ultra fine',9999.29);

insert into product
(id,category,name,price) values (108,'Ketboard','prtronics portable',599.29);

insert into product
(id,category,name,price) values (109,'Keyboard','dell light touch',2999.29);

insert into product
(id,category,name,price) values (110,'Speaker','Sony base booster',3999.29);


insert into product
(id,category,name,price) values (111,'TableLamp','Philips luminous',99.29);



insert into PRODUCT_ORDER (ID,DELIVERY_DATE,ORDER_DATE,STATUS,CUSTOMER_ID)
values (11,'2021-09-03','2021-09-12','ORDERED',122322);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (11,102);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (11,104);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (11,106);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (11,111);


insert into PRODUCT_ORDER (ID,DELIVERY_DATE,ORDER_DATE,STATUS,CUSTOMER_ID)
values (12,'2021-09-02','2021-10-12','ORDERED',122332);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (12,107);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (12,104);



insert into PRODUCT_ORDER (ID,DELIVERY_DATE,ORDER_DATE,STATUS,CUSTOMER_ID)
values (13,'2021-08-02','2021-09-03','DELIVERED',999836);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (13,106);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (13,110);


insert into PRODUCT_ORDER (ID,DELIVERY_DATE,ORDER_DATE,STATUS,CUSTOMER_ID)
values (14,'2021-08-02','2021-09-05','CANCELLED',233431);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (14,107);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (14,110);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (14,108);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (14,109);


insert into PRODUCT_ORDER (ID,DELIVERY_DATE,ORDER_DATE,STATUS,CUSTOMER_ID)
values (15,'2021-08-02','2021-09-03','CANCELLED',999836);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (15,106);

insert into ORDER_PRODUCT_RELATIONSHIP (order_id,product_id) values (15,110);



