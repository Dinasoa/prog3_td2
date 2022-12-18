insert into team("name")
values ('Paris Saint-Germain'),
       ('FC Barcelone');

insert into player(name, number, team_id)
VALUES ('Neymar JR', 10, 1),
       ('Ansu Fati', 22, 2);

insert into sponsor(name)
VALUES ('Qatar Airways'),
       ('Spotify');

insert into play_against (datetime, stadium, team_id, team_opponent_Id)
values (current_timestamp, 'Camp Nou', 1, 2);

insert into have(team_id, sponsor_id)
VALUES (1, 1),
       (1, 2),
       (2, 1);
