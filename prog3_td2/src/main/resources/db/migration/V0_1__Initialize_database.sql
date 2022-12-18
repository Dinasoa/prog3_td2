create table team(
                     id serial PRIMARY KEY,
                     name varchar
);

create table player(
                       id serial PRIMARY KEY,
                       name varchar,
                       number int,
                       team_id int REFERENCES team(id)
);

create table sponsor(
                        id serial PRIMARY KEY,
                        name varchar
);

create table have(
                        team_id int REFERENCES team(id),
                        sponsor_id int REFERENCES sponsor(id)
);

create table play_against(
                        id serial primary key ,
                        datetime date,
                        stadium varchar,
                        team_id int REFERENCES team(id),
                        team_opponent_id int REFERENCES team(id)
);

create table team_players(
                        team_entity_id int REFERENCES team(id),
                        players_id int REFERENCES player(id)
);
