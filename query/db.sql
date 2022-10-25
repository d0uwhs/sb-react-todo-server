create table member
(
    member_id   bigint auto_increment
        primary key,
    username    varchar(200)                          not null,
    password    varchar(200)                          not null,
    created_dt  timestamp default current_timestamp() not null,
    modified_dt timestamp default current_timestamp() not null,
    constraint username
        unique (username)
);

create table roles
(
    roles_id  bigint auto_increment
        primary key,
    role_name varchar(200) not null
);

create table member_roles
(
    member_id bigint null,
    roles_id  bigint null,
    constraint member_roles_ibfk_1
        foreign key (member_id) references member (member_id),
    constraint member_roles_ibfk_2
        foreign key (roles_id) references roles (roles_id)
);

create index member_id
    on member_roles (member_id);

create index roles_id
    on member_roles (roles_id);

create table todo
(
    todo_id     bigint auto_increment
        primary key,
    member_id   bigint                                not null,
    todo_title  varchar(200)                          not null,
    todo_body   text                                  null,
    due_date    date                                  null,
    created_dt  timestamp default current_timestamp() not null,
    modified_dt timestamp default current_timestamp() not null,
    constraint todo_ibfk_1
        foreign key (member_id) references member (member_id)
);

create index member_id
    on todo (member_id);

