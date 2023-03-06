SELECT * FROM DEPARTMENTS;
select DEPARTMENT_NAME from DEPARTMENTS;
select DEPARTMENT_NAME, DEPARTMENT_ID from DEPARTMENTS;
select DEPARTMENT_NAME, DEPARTMENT_ID from DEPARTMENTS;

select *from EMPLOYEES;
select *from DEPARTMENTS;
select * from EMPLOYEES, DEPARTMENTS;
select  EMPLOYEES.EMPLOYEE_ID,DEPARTMENTS.DEPARTMENT_ID from EMPLOYEES,DEPARTMENTS;

select distinct DEPARTMENT_ID from DEPARTMENTS;
select distinct SALARY from EMPLOYEES;

select distinct MAX_SALARY from JOBS;

/* second*/
select * FROM EMPLOYEES where SALARY < 5000;

select * from EMPLOYEES where SALARY<5000 and MANAGER_ID=114;

select * from DEPARTMENTS where LOCATION_ID between 1800 and 2400;
select *from EMPLOYEES where SALARY between 3500 and 5000;

select * from EMPLOYEES where DEPARTMENT_ID in (60,30,110);
select * from COUNTRIES where REGION_ID in (2,3);


select * from COUNTRIES order by REGION_ID;
select * from COUNTRIES where REGION_ID<5 order by REGION_ID asc;
select * from COUNTRIES order by REGION_ID desc;

select * from COUNTRIES;
select  * from COUNTRIES where COUNTRY_NAME like 'A%';
select * from COUNTRIES where COUNTRY_NAME like '%a';

select * from COUNTRIES where COUNTRY_NAME like 'A%' and COUNTRY_NAME like  '%a';

select count(COUNTRY_NAME) from COUNTRIES where COUNTRY_NAME like '%b%';


/* third */
select min(LOCATION_ID) from DEPARTMENTS;
select * from DEPARTMENTS where LOCATION_ID = (select min(LOCATION_ID) from DEPARTMENTS);
select max(LOCATION_ID) from DEPARTMENTS;
select * from DEPARTMENTS where LOCATION_ID = (select max(LOCATION_ID) from DEPARTMENTS);

select max(SALARY) from EMPLOYEES;
select * from EMPLOYEES where SALARY = (select max(SALARY) from EMPLOYEES);

select * from EMPLOYEES where SALARY  = (select min(SALARY) from EMPLOYEES);

select avg( SALARY) from EMPLOYEES;
select round(avg( SALARY),2) from EMPLOYEES;

select sum(SALARY) from EMPLOYEES;

select count(*) from EMPLOYEES where MANAGER_ID = 100;

select count(*) from EMPLOYEES where SALARY<10000;


select JOB_ID from EMPLOYEES group by JOB_ID;
select JOB_ID, count(*) from EMPLOYEES group by JOB_ID;
select JOB_ID, max(SALARY) from EMPLOYEES group by JOB_ID;







