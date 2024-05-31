create table Books(
book_id serial primary key,
name text,
author text,
date_of_publishing date,
genre text,
available_count int
);

select *
from books;

insert into books (name, author, date_of_publishing, genre, available_count)
values
('The Great Gatsby', 'F. Sco^ Fitzgerald', '1925-01-01', 'Classics', 3 );

insert into books (name, author, date_of_publishing , genre, available_count)
values
('To Kill a Monckingbird', 'Harper Lee', '1960-01-01', 'Ficnon', 5);

insert into books (name, author, date_of_publishing , genre, available_count)
values
('1984', 'George Orwell', '1949-01-01', 'Science Ficnon', 2);

insert into books (name, author, date_of_publishing , genre, available_count)
values
('Pride and Prejudice', 'Jane Austen', '1813-01-01', 'Romance', 4);

select name
from books;


