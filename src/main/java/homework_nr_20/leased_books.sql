select name
from books;

create table leased_books(
leased_book_id serial primary key,
name text,
surname text,
date_of_lease date,
date_of_retirn date,
lb_book_id int,
constraint lb_book
foreign key (lb_book_id)
references books(book_id)
)

select *
from leased_books;

insert into leased_books (name, surname, date_of_lease, date_of_retirn, lb_book_id)
values
('Alex', 'Mahalcov', '2020-10-12', '2020-11-12', 1);

insert into leased_books (surname, date_of_lease, date_of_retirn, lb_book_id)
values
('Bogutcaia', '2023-12-10', '2024-01-12', 3);

insert into leased_books (name, surname, date_of_lease, date_of_retirn, lb_book_id)
values
('Oleg', 'Romaniuc', '2019-02-10', '2019-03-19', 3);

insert into leased_books (name, surname, date_of_lease, date_of_retirn, lb_book_id)
values
('Alex', 'Mihov', '2022-06-22', '2022-07-01', 2);

insert into leased_books (name, surname, date_of_lease, lb_book_id)
values
('Alex', 'Mihov', '2022-06-22', 2);

insert into leased_books (name, surname, date_of_lease, date_of_retirn, lb_book_id)
values
('Amelea', 'Milova', '2023-06-22', '2023-08-23', 1);

insert into leased_books (name, surname, date_of_lease, date_of_retirn, lb_book_id)
values
('Ameleira', 'Milova', '2023-06-22', '2023-09-01', 2);

select *
from books b
full outer join leased_books lb on b.book_id = lb.lb_book_id;

select *
from books b
full outer join leased_books lb on b.book_id = lb.lb_book_id
where lb.lb_book_id is null ;

select name, surname, date_of_retirn
from leased_books
where date_of_retirn is not null
and  name is not null
and  surname is not null;

select name, surname, date_of_retirn
from leased_books
where date_of_retirn is not null
and  name is not null
and  surname is not null
and name like 'A%e%e%_';
