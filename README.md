# Transaction Service

A Spring Boot application for managing transactions.

## Prerequisites
- Java 17+
- Docker (for containerized execution)
- Gradle (or use the provided wrapper)

## Running the Application

### Locally
```
./gradlew bootRun
```

### With Docker (Recommended)
```
./run
```
This script builds the project, creates a Docker image, and runs the container on port 8080.

## API Endpoints

### Account Endpoints
- `POST /accounts`  
  Create a new account.  
  **Request Body:** `{ "documentNumber": "string" }`  
  **Response:** Account object

- `GET /accounts/{accountId}`  
  Get account details by ID.  
  **Response:** Account object

- `GET /accounts/all`  
  Get a list of all accounts.  
  **Response:** List of Account objects

### Transaction Endpoints
- `POST /transactions`  
  Create a new transaction.  
  **Request Body:** `{ "accountId": long, "operationTypeId": int, "amount": double }`  
  **Response:** Transaction object

## Testing
To run tests:
```
./gradlew test
```
