INSERT INTO Players(players_name,age,gender,hight,weight,password,enabled,round1,semiFinal,finall)
VALUES ('subhashree','24','female',5,70,'$2y$12$IBaw9zPkJ9ndog/m7nDxLuvzFJ.OW78tyu.AizxAp1sv8JjFtbZQK',true,'winner'
,'winner','winner');
INSERT INTO Players(players_name,age,gender,hight,weight,password,enabled,round1,semiFinal,finall)
VALUES ('jyoti','25','female',6,60,'$2y$12$IBaw9zPkJ9ndog/m7nDxLuvzFJ.OW78tyu.AizxAp1sv8JjFtbZQK',true,'looser'
,'looser','looser');
INSERT INTO Players(players_name,age,gender,hight,weight,password,enabled,round1,semiFinal,finall)
VALUES ('swagatika','24','female',5,70,'$2y$12$IBaw9zPkJ9ndog/m7nDxLuvzFJ.OW78tyu.AizxAp1sv8JjFtbZQK',true,'winner'
,'winner','winner');
INSERT INTO Players(players_name,age,gender,hight,weight,password,enabled,round1,semiFinal,finall)
VALUES ('sanjukta','25','female',6,60,'$2y$12$IBaw9zPkJ9ndog/m7nDxLuvzFJ.OW78tyu.AizxAp1sv8JjFtbZQK',true,'looser'
,'looser','looser');
INSERT INTO Players(players_name,age,gender,hight,weight,password,enabled,round1,semiFinal,finall)
VALUES ('debasis','25','male',6,60,'$2y$12$IBaw9zPkJ9ndog/m7nDxLuvzFJ.OW78tyu.AizxAp1sv8JjFtbZQK',true,'winner'
,'winner','winner');
INSERT INTO Players(players_name,age,gender,hight,weight,password,enabled,round1,semiFinal,finall)
VALUES ('somesh','25','male',6,60,'$2y$12$IBaw9zPkJ9ndog/m7nDxLuvzFJ.OW78tyu.AizxAp1sv8JjFtbZQK',true,'looser'
,'looser','looser');

INSERT INTO Roles (Name)
VALUES ('ADMIN');
INSERT INTO Roles (Name)
VALUES ('USER');

INSERT INTO user_roles (players_id , roleid)
VALUES (1,1);
INSERT INTO user_roles (players_id , roleid)
VALUES (1,2);
INSERT INTO user_roles (players_id , roleid)
VALUES (2,2);
INSERT INTO user_roles (players_id , roleid)
VALUES (3,2);
INSERT INTO user_roles (players_id , roleid)
VALUES (4,2);
INSERT INTO user_roles (players_id , roleid)
VALUES (5,2);
INSERT INTO user_roles (players_id , roleid)
VALUES (6,2);

  
INSERT INTO Tournament(groupno,place)
VALUES (1001,'chennai');
INSERT INTO Tournament(groupno,place)
VALUES (1002,'banglore');
INSERT INTO Tournament(groupno,place)
VALUES (1003,'bbsr');
INSERT INTO Tournament(groupno,place)
VALUES (1004,'mumbai');


INSERT INTO players_tournament (groupno , players_id)
VALUES (1001,1);
INSERT INTO players_tournament (groupno , players_id)
VALUES (1001,2);
INSERT INTO players_tournament (groupno , players_id)
VALUES (1002,3);
INSERT INTO players_tournament (groupno , players_id)
VALUES (1002,4);
INSERT INTO players_tournament (groupno , players_id)
VALUES (1003,5);
INSERT INTO players_tournament (groupno , players_id)
VALUES (1003,6);

INSERT INTO Rounds(rounds,points)
VALUES (1,'10');
INSERT INTO Rounds(rounds,points)
VALUES (2,'10');
INSERT INTO Rounds(rounds,points)
VALUES (3,'10');

INSERT INTO players_round (rounds , players_id)
VALUES (1,1);
INSERT INTO players_round (rounds , players_id)
VALUES (2,3);
INSERT INTO players_round (rounds , players_id)
VALUES (3,5);






