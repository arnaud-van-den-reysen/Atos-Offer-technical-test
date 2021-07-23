# Atos-Offer-Technical-Test
## Setup
```sh
git clone https://github.com/arnaud-van-den-reysen/Atos-Offer-technical-test.git
cd .\rest-service\
```
- Avec Xampp, lancer MySQL
- Sur PHPMyAdmin
    - Créer une database : db_example
    - Et un user : user1 , avec password : password
```sh
./mvnw spring-boot:run
```

## Test
- D'abord une requête POST
- Puis GET
- Car spring.jpa.hibernate.ddl-auto=create-drop
- Importer le JSON postman et lancer la collection

## Endpoint
- GET all
```sh
http://localhost:8080/user/all
```
- GET 1
```sh
http://localhost:8080/user/1
```
- POST 1
```sh
localhost:8080/user/add?name=First&birthdate=2021-07-23&country=France
```