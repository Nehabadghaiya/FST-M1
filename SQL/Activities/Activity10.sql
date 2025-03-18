--Activity 10

select salesman_id from customers where customer_id = 3007;
select * from orders where salesman_id in (select salesman_id from customers where customer_id = 3007);

select salesman_id from salesman where salesman_city = 'New York';
select * from orders where salesman_id in (select salesman_id from salesman where salesman_city = 'New York');

select AVG(grade) from customers where city ='New York';
select grade, count(*) from customers group by grade having grade > (select AVG(grade) from customers where city ='New York');

select salesman_id from salesman where commission = (select MAX(commission) from salesman);
select * from orders where salesman_id in (select salesman_id from salesman where commission = (select MAX(commission) from salesman));