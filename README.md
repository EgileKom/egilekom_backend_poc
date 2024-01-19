# EGILEKOM PLATFORM POC 

## Description
This project is a POC for egilekom platform, it's a simple CRUD application for managing users and their roles.

### Prérequis

- Docker desktop
- Docker compose
- Java 17 and Maven 3.8.3
- Favorite IDE (intellij, eclipse, netbeans, ...)
- Postman

## Installation

1- Clone the project from github
2- open the project with your favorite IDE
3- create docker container for postgresql database
- there's a file ``.env.example`` make your own ``.env`` file and put your own credentials
```bash
docker-compose up -d
```
4 - run the project with
```bash
./run.sh
```
6 - api documentation is available at http://localhost:8080/swagger-ui.html

7 - you can use postman to test the api

## Contributors
- [Elmahdi elhjoujy]())
