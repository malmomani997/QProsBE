# Cucumber Pet Store API Testing 🐾

This repository contains automated tests for the Pet Store API using Cucumber, Rest Assured, and Java.

## Overview 📖

The project involves scenarios for creating, updating, retrieving, and deleting user information through the Pet Store API. It utilizes Cucumber for behavior-driven development, Rest Assured for API testing, and Java for coding.

## Table of Contents 🗂️

- [Project Structure](#project-structure)
- [Test Scenarios](#test-scenarios)
- [Generating Reports](#generating-reports)
- [API Endpoints](#api-endpoints)
- [Installation](#installation)
- [Usage](#usage)
- [Built With](#built-with)
- [Contributing](#contributing)
- [License](#license)

## Project Structure 🏗️

- **src/main/java/:** Main source code.
  - `stepDefinitions/`: Contains Cucumber step definitions.
  - `Options/`: Contains the Cucumber test runner.
- **src/test/java/:** Test source code.
  - `stepDefinitions/`: Contains Cucumber step definitions.
  - `Options/`: Contains the Cucumber test runner.
- **src/test/resources/:** Test data and configuration files.
  - `features/`: Cucumber feature files.
  - `global.properties`: Configuration file with the base URL.

## Test Scenarios 🧪

1. **Create User:**
   - Create a new user with specified information.
   - File: `CreateUserScenario.java`

2. **Retrieve User:**
   - Search for an existing user and retrieve their information.
   - File: `GetUserScenario.java`

3. **Update User:**
   - Modify user information such as username, first name, and phone number.
   - File: `UpdateUserScenario.java`

4. **Delete User:**
   - Delete a user account.
   - File: `DeleteUserScenario.java`

## Generating Reports 📊

To generate comprehensive reports, run the following command:

```bash
mvn clean verify net.masterthought:maven-cucumber-reporting:5.7.7:generate
```
This project generates detailed HTML reports in the `target/site/cucumber-reports` directory.

## API Endpoints 🌐

- **Base URL:** [https://petstore3.swagger.io](https://petstore3.swagger.io)

## Installation ⚙️

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/cucumber-pet-store-api.git
    ```

2. Navigate to the project directory:

    ```bash
    cd cucumber-pet-store-api
    ```

3. Build the project:

    ```bash
    mvn clean install
    ```

4. Run the project:

    ```bash
    mvn test
    ```

## Usage 🚀

1. Import the project into your preferred IDE.
2. Configure the `src/test/java/resources/global.properties` file with the base URL.
3. Run the `TestRunner` class to execute the test scenarios.

## Built With 🛠️

- Java
- Cucumber
- Rest Assured
- Maven
- Chart.js
