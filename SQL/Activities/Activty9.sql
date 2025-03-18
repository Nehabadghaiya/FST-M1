--Activity 9

select * from customers a inner join salesman b on a.salesman_id = b.salesman_id;

select * from customers a left join salesman b on a.salesman_id = b.salesman_id where a.grade < 300 order by a.customer_id;

select * from customers a inner join salesman b on a.salesman_id = b.salesman_id where b.commission > 12 order by a.customer_id;

select * from orders a inner join customers b on a.customer_id=b.customer_id inner join salesman c on a.salesman_id=c.salesman_id;