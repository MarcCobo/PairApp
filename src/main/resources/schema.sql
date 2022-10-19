create table notes (
  id number(10),
  text varchar(800),
  created_at date,
  estimated_completion_date date,
  link varchar(400),
  mentions varchar(400),
  priority number(3),
  primary key(id)
);