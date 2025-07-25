# Coffee Management System

A sample Java project using Hibernate ORM and MySQL, managed with Maven.

## Features
- 5 modules: Coffee, Customer, Order, Employee, Supplier
- Hibernate ORM for database operations
- MySQL as the database backend
- Simulation file to demonstrate CRUD operations

## Prerequisites
- Java JDK 8 or higher
- Maven 3.6+
- MySQL Server (local instance)

## MySQL Setup
1. Start your MySQL server.
2. Create the database:
   ```sql
   CREATE DATABASE coffee_management;
   ```
3. Ensure the user `root` with password `Developer123` has access.

## Build the Project
```
mvn clean install
```

## Run the Simulation
```
mvn exec:java -Dexec.mainClass=com.coffee.management.Simulation
```

## Configuration
- Database connection is configured in `src/main/resources/hibernate.cfg.xml`.
- If you use a different MySQL user/password, update the config file accordingly.

## Troubleshooting
- If you see `Unknown lifecycle phase`, ensure there are no spaces before `-Dexec.mainClass` in the run command.
- If you see `Public Key Retrieval is not allowed`, make sure your JDBC URL contains `allowPublicKeyRetrieval=true`.

## .gitignore
A sample `.gitignore` is provided to exclude build and IDE files. 