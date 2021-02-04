REM   Script: Activity_9
REM   Activity_9

Select sale.SALESMAN_NAME, cust.CUSTOMER_NAME from salesman sale INNER JOIN customers cust on sale.SALESMAN_ID = cust.SALESMAN_ID;

Select cust.CUSTOMER_NAME, sale.SALESMAN_NAME from customers cust LEFT OUTER JOIN salesman sale on sale.SALESMAN_ID=cust.SALESMAN_ID WHERE cust.GRADE<300 ORDER BY cust.CUSTOMER_ID;

Select cust.CUSTOMER_NAME, sale.SALESMAN_NAME from customers cust INNER JOIN salesman sale on sale.SALESMAN_ID=cust.SALESMAN_ID WHERE sale.COMMISSION>12;

Select ord.order_no, ord.order_date, ord.purchase_amount, cust.CUSTOMER_NAME, cust.grade, sale.SALESMAN_NAME, sale.commission FROM orders ord  
INNER JOIN customers cust ON ord.customer_id=cust.customer_id INNER JOIN salesman sale ON ord.salesman_id=sale.salesman_id;

Select sale.SALESMAN_NAME, cust.CUSTOMER_NAME from salesman sale INNER JOIN customers cust on sale.SALESMAN_ID = cust.SALESMAN_ID;

Select cust.CUSTOMER_NAME, sale.SALESMAN_NAME from customers cust LEFT OUTER JOIN salesman sale on sale.SALESMAN_ID=cust.SALESMAN_ID WHERE cust.GRADE<300 ORDER BY cust.CUSTOMER_ID;

Select cust.CUSTOMER_NAME, sale.SALESMAN_NAME from customers cust INNER JOIN salesman sale on sale.SALESMAN_ID=cust.SALESMAN_ID WHERE sale.COMMISSION>12;

Select ord.ORDER_NO, ord.ORDER_DATE, ord.PURCHASE_AMOUNT, cust.CUSTOMER_NAME, cust.GRADE, sale.SALESMAN_NAME, sale.COMMISSION FROM orders ord  
INNER JOIN customers cust ON ord.CUSTOMER_ID=cust.CUSTOMER_ID INNER JOIN salesman sale ON ord.SALESMAN_ID=sale.SALESMAN_ID;

