REM   Script: Activity_8
REM   Activity_8

Select * From orders;

Select CUSTOMER_ID , Max(PURCHASE_AMOUNT) as Maximum_Order_Value from orders group by CUSTOMER_ID order by CUSTOMER_ID;

Select SALESMAN_ID , Max(PURCHASE_AMOUNT) as Maximum_Order_Value from orders where ORDER_DATE=To_DATE('2012/08/17', 'YYYY/MM/DD') group by SALESMAN_ID order by SALESMAN_ID;

Select CUSTOMER_ID , ORDER_DATE , Max(PURCHASE_AMOUNT) as Maximum_Order_Value from orders group by CUSTOMER_ID,ORDER_DATE Having Max(PURCHASE_AMOUNT) in(2030, 3450, 5760, 6000) order by CUSTOMER_ID;

