REM   Script: Activity_3
REM   Activity_3

CREATE TABLE salesman (salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

Desc salesman


CREATE TABLE salesman (salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

Desc salesman


ALTER TABLE salesman MODIFY salesman_id int NOT NULL;

ALTER TABLE salesman MODIFY salesman_id int NOT NULL;

CREATE TABLE salesman (salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

Desc salesman


ALTER TABLE salesman MODIFY salesman_id int NOT NULL;

Desc salesman


Drop TABLE salesman;

CREATE TABLE salesman (salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

Desc salesman


ALTER TABLE salesman MODIFY salesman_id int NOT NULL;

Desc salesman


Drop TABLE salesman;

CREATE TABLE salesman (salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

Desc salesman


ALTER TABLE salesman MODIFY salesman_id int NOT NULL;

Desc salesman


INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(Null, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES(5009, '', NULL, 13);

Select * FROM salesman;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(Null, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES(5009, '', NULL, 13);

Select * FROM salesman;

INSERT INTO salesman (column_list) 
VALUES 
    (value_list_1), 
    (value_list_2), 
    ... 
    (value_list_n);

INSERT INTO salesman (SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) 
VALUES 
    (5010, 'GK', 'London', 11), 
    (5011, 'Gokul', 'London', 11), 
    (5012, 'Krish', 'London', 11), 
    (5013, 'Krishnan', 'London', 11);

Select * FROM salesman;

Select * FROM salesman;

INSERT INTO salesman (SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) 
VALUES 
    (5010, 'GK', 'London', 11), 
    (5011, 'Gokul', 'London', 11), 
    (5012, 'Krish', 'London', 11), 
    (5013, 'Krishnan', 'London', 11);

INSERT INTO salesman (SALESMAN_ID,SALESMAN_NAME,SALESMAN_CITY,COMMISSION) 
VALUES 
    (5010, 'GK', 'London', 11), 
    (5011, 'Gokul', 'London', 11), 
    (5012, 'Krish', 'London', 11), 
    (5013, 'Krishnan', 'London', 11);

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

