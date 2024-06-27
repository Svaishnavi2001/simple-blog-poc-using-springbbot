create table if not exists user {
 id serial primary key,
 username varchar(255) not null,
 password varchar(255) not null,
 email varchar(255) not null
}