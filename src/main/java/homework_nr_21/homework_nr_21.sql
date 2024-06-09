CREATE TABLE departments (
 department_id serial PRIMARY KEY,
 department_name VARCHAR(50)
);


CREATE TABLE employees (
 employee_id serial PRIMARY KEY,
 employee_name VARCHAR(50),
 department_id INT,
 FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

drop table employee_projects  cascade;

CREATE TABLE projects (
 project_id serial PRIMARY KEY,
 project_name VARCHAR(50)
);

CREATE TABLE employee_projects (
 employee_id INT,
 project_id INT,
 FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
 FOREIGN KEY (project_id) REFERENCES projects(project_id)
);

insert into departments ( department_name)
values
('Tech support'), ('Cybersecurity'), ('Enterprise architecture'), ('Network administration'), ('Development operations');

select *
from departments ;

insert into employees (employee_name, department_id)
values
('Alis', 1), ('Oleg', 5), ('Max', 3), ('Nick', 2), ('Alina', 1), ('Alex', 4), ('Anastasia', 3), ('Artem', 1), ('Oleg', 4);

insert into employees (employee_name)
values
('Nica');

select *
from employees e ;

insert into projects (project_name)
values
('Software development'), ('Infrastructure improvements'), ('Cyber security projects'), ('Cloud projects'), ('Digital transformation');

select *
from projects p ;

insert into employee_projects (employee_id, project_id)
values
(1,3), (2,4), (3,1), (4,2), (5,5), (6,1), (7,1), (8,3), (9,5);

select *
from employee_projects ep ;

select e.employee_name, d.department_name
from employees e
inner join departments d on e.department_id = d.department_id;

select e.employee_name
from employees e
full outer join  departments d on e.department_id = d.department_id
where d.department_id is null ;

select e.employee_name , p.project_name
from employees e
inner join employee_projects ep on e.employee_id = ep.employee_id
inner join projects p on p.project_id = ep.project_id;

select e.employee_name, d.department_name
from employees e
full outer join  departments d on e.department_id = d.department_id;

select d.department_name, count(*) as employee_count
from employees e
inner join departments d on e.department_id = d.department_id
GROUP by d.department_id;