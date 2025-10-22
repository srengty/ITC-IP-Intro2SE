# Lab 04.5 - Implementing Design Patterns (Creation)
In this lab work you will manager your codes follow the given creation design patterns.

> ### Prototype
> Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype. Pattern has creational purpose and deals with object relationships, which are more dynamic. The pattern hides the complexities of making new instances from the client.

> ### When to use
> when the classes to instantiate are specified at run-time
to avoid building a class hierarchy of factories that parallels the class hierarchy of products
when instances of a class can have one of only a few different combinations of state

## Prototype pattern
Follow the Github sample prototype pattern: https://github.com/srengty/design-patterns/tree/master/CreationalPatterns/prototype
Create a class called Student that represent student of International program class. Create the prototype and then, add clone method to create a copy of the prototype with some default values.

## Usage of Prototype pattern
Supplement to previous task, create a menu that let user to listing, add, update, remove student(s) from group of students.
```
------------------------- Menu -------------------------
  1. List students
  2. Add a new student (use prototype)
  3. Create multiple students (use prototype)
  4. Update a student by index
  5. Remove a student by index
  6. Remove all students
  0. Exit
--------------------------------------------------------
> Choose an option:
```


Submit as link to your Gitlab project folder **Lab04.5**.

