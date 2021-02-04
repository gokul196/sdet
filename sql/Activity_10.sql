REM   Script: Activity_10
REM   Activity_10

select * from salesman;

select * from orders;

selecet * from customers;


select * from salesman;

select * from orders;

select * from customers;

Select ord.ORDER_NO, sale.SALESMAN_NAME, cust.CUSTOMER_ID FROM orders ord 
INNER JOIN salesman sale ON ord.SALESMAN_ID=sale.SALESMAN_ID Left JOIN customers cust where cust.CUSTOMER_ID=3007;

Select ord.ORDER_NO, sale.SALESMAN_NAME, cust.CUSTOMER_ID FROM orders ord 
INNER JOIN salesman sale ON ord.SALESMAN_ID=sale.SALESMAN_ID Left JOIN customers cust ON ord.CUSTOMER_ID=cust.CUSTOMER_ID where cust.CUSTOMER_ID=3007;

select * from salesman;

select * from orders;

select * from customers;

SELECT * FROM orders WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE CITY='New York');

select * from salesman;

select * from salesman;

select * from orders;

select * from customers;

SELECT * FROM orders WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE SALESMAN_CITY='New York');

SELECT * FROM orders WHERE salesman_id=(SELECT DISTINCT salesman_id FROM salesman WHERE SALESMAN_CITY='New York');

SELECT grade, COUNT(*) FROM customers GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

select * from customers;

select * from salesman;

select * from salesman;

select * from orders;

SELECT order_no, purchase_amount, order_date, salesman_id FROM ordersWHERE salesman_id IN 
( SELECT salesman_id FROM salesman WHERE commission=( SELECT MAX(commission) FROM salesman));

SELECT order_no* FROM orders WHERE salesman_id IN 
( SELECT salesman_id FROM salesman WHERE commission=( SELECT MAX(commission) FROM salesman));

SELECT * FROM orders WHERE salesman_id IN 
( SELECT salesman_id FROM salesman WHERE commission=( SELECT MAX(commission) FROM salesman));

