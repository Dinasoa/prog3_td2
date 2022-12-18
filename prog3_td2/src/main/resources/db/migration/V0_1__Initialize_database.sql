create table team(
                     id serial PRIMARY KEY,
                     name varchar
);

create table player(
                       id serial PRIMARY KEY,
                       name varchar,
                       number int,
                       id_team int REFERENCES team(id)
);

create table sponsor(
                        id serial PRIMARY KEY,
                        name varchar
);

create table have(
                        id_team int REFERENCES team(id),
                        id_sponsor int REFERENCES sponsor(id)
);

create table play_against(
                        id serial primary key ,
                        datetime date,
                        stadium varchar
);
