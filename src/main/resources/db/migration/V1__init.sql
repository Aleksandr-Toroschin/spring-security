
create table roles (
    id bigserial PRIMARY KEY not null,
    name varchar(255));

create table users (
    id bigserial PRIMARY KEY not null,
    name varchar(255),
    password varchar(255)
);

create table users_roles (
    user_id bigint,
    role_id bigint,
    primary key (user_id, role_id),
    foreign key (user_id) references users (id),
    foreign key (role_id) references roles (id)
);

insert into roles (name) values
('ROLE_ADMIN'),
('ROLE_USER'),
('ROLE_MANAGER'),
('ADD_USER'),
('EDIT_USER');

insert into users (name, password) values
('Иванов', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i'),
('Петров', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i'),
('Сидоров', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i');

insert into users_roles (user_id, role_id)
values (1, 1),
       (2, 2),
       (2, 3),
       (3, 2),
       (3, 4),
       (2, 5);