# Lab 05 - Coding standards and best practices
In this lab you will practice on implementing code standards.

You will need 2 persons a group to work on this lab.

## Task 1: Limited use of Global variables and naming conventions
Create a class named "Subject" represents courses in Year 2 program. Add attributes follow best practices and naming conventions. Below are some examples:  

Use global variables only when:
- Having constants which are initialized in static block.
Example:
```java
final double PRICE = 9.9;
```
- Having the variables initialized in static block and exposed via getters
Example:
```java
private static final double price = 9.0;
public static final double getPrice() { return price; }
```
- Creating a singleton and having the variables private final exposed via getters

Constant is a permanent value and does not change the value during the execution of a program.
```java
final datatype CONSTANTSNAME = value;
```
Example:
```java
final double PRICE = 9.9;
```
If you try to change its value it will be compile time error:
```java
PRICE = 0.9; // NOT ALLOWED.
```

## Task 2: Standard headers
Add comments to the class in Task 1 to follow standard headers stated in lesson.

## Task 3: Exception
Add method setName(name) to change name of the subject. This method will throw exception when name is and empty string or null.

## Task 4: Github repository
In VSCode, setup git:
https://code.visualstudio.com/docs/sourcecontrol/intro-to-git

Initialize a repository in a local folder and then Publish local repository to GitHub.

## Task 5: Share your code to your pattern
Let your partner reviews the codes and gives comments on how the code can be written in other ways or add more attributes to make it more informative.

Then, switch role, you will be reviewer (navigator) and your partner will will write code (driver) for the following tasks.

(I can confirm that you have switched the role by viewing the committer name in github commits history.)

## Task 6:
Create class named "Session" represents study sessions of the day. Add attributes follow best practices and naming conventions.

## Task 7: Standard headers
Add comments to the class in Task 5 to follow standard headers stated in lesson.

## Task 8: Exception
Add method setDuration(startTime, endTime) to change session time. This method will throw exception when startTime is bigger or equals to endTime. Both startTime and endTime are in integer (ex: startTime: 13, endTime: 14).
