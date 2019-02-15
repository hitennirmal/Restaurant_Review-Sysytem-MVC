# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table customer (
  customer_id                   integer auto_increment not null,
  first_name                    varchar(255) not null,
  last_name                     varchar(255) not null,
  gender                        varchar(255) not null,
  password                      varchar(255) not null,
  email                         varchar(255) not null,
  phone_number                  varchar(255) not null,
  constraint pk_customer primary key (customer_id)
);

create table owner (
  owner_id                      integer auto_increment not null,
  first_name                    varchar(255) not null,
  last_name                     varchar(255) not null,
  gender                        varchar(255) not null,
  city                          varchar(255) not null,
  password                      varchar(255) not null,
  email                         varchar(255) not null,
  phone_number                  varchar(255) not null,
  constraint pk_owner primary key (owner_id)
);

create table rating (
  rating_id                     integer auto_increment not null,
  rating                        integer,
  feedback                      varchar(255),
  restaurant_id_assoc_restaurant_id integer not null,
  customer_id_assoc_customer_id integer not null,
  constraint pk_rating primary key (rating_id)
);

create table registration (
  registration_id               integer auto_increment not null,
  registration_number           integer not null,
  registration_name             varchar(255) not null,
  registration_type             varchar(255) not null,
  owner_owner_id                integer not null,
  constraint pk_registration primary key (registration_id)
);

create table restaurant (
  restaurant_id                 integer auto_increment not null,
  city                          varchar(255) not null,
  pincode                       varchar(255) not null,
  cost                          integer not null,
  name                          varchar(255) not null,
  owner_restaurant_owner_id     integer not null,
  registration_registration_id  integer not null,
  constraint pk_restaurant primary key (restaurant_id)
);

alter table rating add constraint fk_rating_restaurant_id_assoc_restaurant_id foreign key (restaurant_id_assoc_restaurant_id) references restaurant (restaurant_id) on delete restrict on update restrict;
create index ix_rating_restaurant_id_assoc_restaurant_id on rating (restaurant_id_assoc_restaurant_id);

alter table rating add constraint fk_rating_customer_id_assoc_customer_id foreign key (customer_id_assoc_customer_id) references customer (customer_id) on delete restrict on update restrict;
create index ix_rating_customer_id_assoc_customer_id on rating (customer_id_assoc_customer_id);

alter table registration add constraint fk_registration_owner_owner_id foreign key (owner_owner_id) references owner (owner_id) on delete restrict on update restrict;
create index ix_registration_owner_owner_id on registration (owner_owner_id);

alter table restaurant add constraint fk_restaurant_owner_restaurant_owner_id foreign key (owner_restaurant_owner_id) references owner (owner_id) on delete restrict on update restrict;
create index ix_restaurant_owner_restaurant_owner_id on restaurant (owner_restaurant_owner_id);

alter table restaurant add constraint fk_restaurant_registration_registration_id foreign key (registration_registration_id) references registration (registration_id) on delete restrict on update restrict;
create index ix_restaurant_registration_registration_id on restaurant (registration_registration_id);


# --- !Downs

alter table rating drop foreign key fk_rating_restaurant_id_assoc_restaurant_id;
drop index ix_rating_restaurant_id_assoc_restaurant_id on rating;

alter table rating drop foreign key fk_rating_customer_id_assoc_customer_id;
drop index ix_rating_customer_id_assoc_customer_id on rating;

alter table registration drop foreign key fk_registration_owner_owner_id;
drop index ix_registration_owner_owner_id on registration;

alter table restaurant drop foreign key fk_restaurant_owner_restaurant_owner_id;
drop index ix_restaurant_owner_restaurant_owner_id on restaurant;

alter table restaurant drop foreign key fk_restaurant_registration_registration_id;
drop index ix_restaurant_registration_registration_id on restaurant;

drop table if exists customer;

drop table if exists owner;

drop table if exists rating;

drop table if exists registration;

drop table if exists restaurant;

