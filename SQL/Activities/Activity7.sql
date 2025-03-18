--Activity 7
select SUM(purchase_amount) from orders;
select SUM(purchase_amount) as "total purchase amount" from orders;

select AVG(purchase_amount) from orders;
select AVG(purchase_amount) as "average purchase amount" from orders;

select MIN(purchase_amount) from orders;
select MIN(purchase_amount) as "minimum purchase amount" from orders;

select MAX(purchase_amount) from orders;
select MAX(purchase_amount) as "maximum purchase amount" from orders;

select count(*) as "total number of salesmen" from salesman;
select count(salesman_id) from salesman;
select count(distinct(salesman_id)) from salesman;