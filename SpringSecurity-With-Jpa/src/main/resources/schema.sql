CREATE  TABLE Players (
players_id int AUTO_INCREMENT PRIMARY KEY,
  players_name VARCHAR(45) NOT NULL ,
  age VARCHAR(255) NOT NULL ,
  gender VARCHAR(255) NOT NULL ,
  hight FLOAT NOT NULL ,
  weight int(255) NOT NULL ,
  password VARCHAR(255) NOT NULL ,
  enabled boolean NOT NULL,
  round1  Varchar(50),
  semiFinal  Varchar(50),
  finall  Varchar(50)
  );
  
CREATE  TABLE Roles (
roleid int AUTO_INCREMENT PRIMARY KEY,
 Name VARCHAR(65) NOT NULL 
  );
CREATE TABLE user_roles (
    players_id int ,
    roleid int ,
    FOREIGN KEY (players_id) REFERENCES Players(players_id),
	FOREIGN KEY (roleid) REFERENCES Roles(roleid)
);

CREATE  TABLE Tournament (
groupno int AUTO_INCREMENT PRIMARY KEY,
  place VARCHAR(45) NOT NULL 
  );
  
  CREATE TABLE players_tournament (
    groupno int ,
    players_id int ,
    FOREIGN KEY (groupno) REFERENCES Tournament(groupno),
	FOREIGN KEY (players_id) REFERENCES Players(players_id)
);
	CREATE  TABLE Rounds (
rounds int AUTO_INCREMENT PRIMARY KEY,
  points VARCHAR(45) NOT NULL
  
  );
   CREATE TABLE players_round (
    rounds int ,
    players_id int ,
  
    FOREIGN KEY (rounds) REFERENCES Rounds(rounds),
	FOREIGN KEY (players_id) REFERENCES Players(players_id)
	
);
