-- 01. Insert Records - Department
insert into department(department_id, department_name, department_block_number) 
values (1, "CSE", 3), (2, "IT", 3), (3,"SE",3); 
select * from department;

-- 02. Department name based on block number
select department_name from department 
where department_block_number = 3 
order by 1 asc;

-- 03. Student and their Department Based on City
select distinct s.student_name, d.department_name from student s 
join department d on s.department_id = d.department_id 
where s.city = 'Coimbatore' order by 1;

-- 04. Hunger eats - update table
update customers
set phone_no = 9876543210
where customer_id = 'CUST1004';

-- 05. Delivery Partner details based on rating
select partner_id, partner_name, phone_no from delivery_partners
where rating between 3 and 5
order by partner_id;

-- 06. Car rental system - Insert values
insert into rentals
values ("R001", "C007", "V004", "2018-03-10", "2018-03-10", 800, 9000),
        ("R002", "C001", "V007", "2018-03-11", "2018-03-12", 200, 3000),
        ("R003", "C007", "V003", "2018-04-15", "2018-04-15", 100, 1500),
        ("R004", "C007", "V001", "2018-05-16", "2018-05-18", 1000, 10000),
        ("R005", "C004", "V005", "2018-05-10", "2018-05-12", 900, 11000),
        ("R006", "C004", "V006", "2018-05-20", "2018-05-21", 200, 2500);
        
-- 07. Customers having gmail id
select customer_id, customer_name, address, phone_no from customers 
where email_id like '%@gmail.com'
order by customer_id;

-- 08. Car details based on type and name
select car_id, car_name, car_type from cars
where car_name like 'Maruthi%' and car_type = 'Sedan'
order by car_id;

-- 09. Car & owner details based on car type
select c.car_id, c.car_name, o.owner_id from cars c
join owners o on c.owner_id = o.owner_id
where c.car_type in ('Hatchback', 'SUV')
order by car_id;

-- 10. Concatenating Details
select concat(address, ', ', city) as Address from student
order by 1 desc;

-- 11. Hotels that took order based on month
select distinct h.hotel_id, h.hotel_name, h.rating from orders o
join hotel_details h on o.hotel_id = h.hotel_id
where o.order_date between '2019-07-01' and '2019-07-31'
order by h.hotel_id;

-- 12. Hotel_info
select concat(hotel_name, ' is a', hotel_type, ' hotel') as HOTEL_INFO from hotel_details 
order by 1 desc;

-- 13. Rental details based on date
select rental_id, car_id, customer_id, km_driven from rentals
where pickup_date between '2019-08-01' and '2019-08-30'
and return_date between '2019-08-01' and '2019-08-30'
order by rental_id;

-- 14. Password Generation
select name, concat(substr(name, 1,3), substr(convert(phno, char), 1,3)) as password from users
order by name;

-- 15. Customer using HDFC bank
select distinct u.name, u.address from users u 
join bookingdetails b on u.user_id = b.user_id
where 'HDFC' not in (select b_in.name from bookingdetails b_in where u.user_id = b_in.user_id)
order by 1;
