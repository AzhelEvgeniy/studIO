/*Table User*/
create table if NOT EXISTS user(
  id int NOT NULL auto_increment,
  name varchar(75) NOT NULL,
  email varchar(75) NOT NULL,
  password varchar(150) NOT NULL,
  /*1 - email подтвержден, 0 - не подтвержден*/
  enabled tinyint(4) NOT NULL,
  primary key(id)
);

/*Table Role - список ролей*/
Create Table if NOT EXISTS role(
  id INT NOT NULL auto_increment,
  name varchar(75) NOT NULL,
  primary key(id)
);

/*Table User_Role - роль пользователя в системе*/
create table if NOT EXISTS user_role(
  id INT NOT NULL auto_increment,
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  primary key(id),
  FOREIGN KEY (user_id) REFERENCES user(id),
  FOREIGN KEY (role_id) REFERENCES role(id)
);

/*INSERT INTO role(id, name) VALUES (1, 'ROLE_USER');*/