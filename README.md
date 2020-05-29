# ssi_project

## Implemented Features
* Login with GUI+BD
* Regist with GUI+BD
* Logout
* Get contacts (UDP)
* Properties file
* Alternate among users 

### TODO:
* polish code
* crypto module
    * create keys
    * structure to store keys and load them when needed
    * create byte array composer -- see sieveq 
   
    
## Setup MySQL
Criar db com nome ssi_project
```mysql-sql
create database ssi_project;
```
Sugestão: user e pass: ssi_project

```mysql-sql
CREATE USER 'ssi_project'@'localhost' IDENTIFIED BY 'ssi_project';
```

```mysql-sql
GRANT ALL PRIVILEGES ON ssi_project TO 'ssi_project'@'localhost';
```

Carregar o ssi_project.dump

Se for necessário apagar as tabelas:
```mysql-sql
truncate table user;

truncate table contact;
```

## Build
```mvn clean compile assembly:single test```

## Run
### server

```
java -cp target/SSI-1.0-jar-with-dependencies.jar main.Main server [properties file name] (server.prop)
```
 

### clients
```
java -cp target/SSI-1.0-jar-with-dependencies.jar main.Main client [properties file name] (client.prop)
```
