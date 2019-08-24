# store-automation with Serenity BDD, Cucumber, JUnit and Screenplay pattern design

This is a test automation practice that runs on https://tienda.plazavea.com.pe

In the scenario, a user enters the website, looks for a Nintendo and adds it to the shopping cart. At the end, it is verified that the product was properly added to the cart

# Technologies

- Pattern design: Screenplay
- Programming Language: Java
- Build Automation Tool: Gradle
- Testing Framework: JUnit
- Reporting Library: Serenity BDD
- Version Control: Git


# Get the code

git clone https://github.com/stiven-metrio/store-automation.git

# Project Structure

```
src
  + main
    + java
      + co
        + com
          + test
            + exceptions
            + interactions
            + model
            + questions
            + tasks
            + userInterface
            + util
    + resources
  + test
    + java
      + co
        + com
          + test
            + runners
            + stepsDefinitions
    + resources
      + driver
      + features
 ```
# Executing the test

In order to execute the test, open the project's terminal an run the command:

```
$ gradle clean test -Pdriver=chrome
```

