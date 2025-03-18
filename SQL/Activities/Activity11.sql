--Activity 11

-- Write a query that produces the name and number of each salesman and each customer with more than one current order. 
-- Put the results in alphabetical order
select salesman_id, salesman_name from salesman a where (select count(*) from orders b where a.salesman_id = b.salesman_id) > 1
union
select customer_id,  customer_name from customers c where (select count(*) from orders d where c.customer_id = d.customer_id) > 1;



-- Write a query to make a report of which salesman produce the largest and smallest orders on each date.
SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on', b.order_date, b.purchase_amount FROM salesman a, orders b WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount= (SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT f.salesman_id, f.salesman_name, d.order_no, 'lowest on', d.order_date, d.purchase_amount FROM salesman f, orders d WHERE f.salesman_id=d.salesman_id
AND d.purchase_amount=(SELECT MIN(purchase_amount) FROM orders e WHERE e.order_date = d.order_date) 
and (SELECT COUNT(*) FROM orders e WHERE e.order_date = d.order_date) > 1;