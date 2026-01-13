<div style="margin-bottom: 20px;">
<div class="header">
    <h3>Introduction to Software Engineering</h3>
    <h4>SE - Lab 05</h4>
</div>
</div>
<div style="text-align: right; font-style: italic; margin-bottom: 20px;">
    <p>Topic: Testings.<br>
    Student learning time: 2 hours.</p>
</div>

# Lab 05 - Testings
In this lab you will create some unit tests in Java using JUnit.

## Simple Math class
Create a class that handle simple math including adding, subtracting, multiplying, and division.

## Test of Simple Math class
Create SimpleMathTest class to test the SimpleMath class. It should include:
- Test add positive numbers (ex: 2 + 3 = 5)
- Test add negative numbers (ex: -2 + -3 = -5)
- Test subtract positive numbers (ex: 5 - 3 = 2)
- Test subtract negative numbers (ex: -5 - -3 = -2)
- Test multiply positive numbers (ex: 2 * 3 = 6)
- Test multiply negative numbers (ex: -2 * -3 = 6)
- Test divide positive numbers (ex: 6 / 3 = 2)
- Test divide negative numbers (ex: -6 / -3 = 2)
- Test divide with a/0 (should throw exception)
- Test divide with 0/0 (should throw exception)

## Book class
Create a Book class represents book in bookshop.

## BookManager class
Create a BookManager class to manage books in bookshop. It should includes:
- List all books (use ArrayList to store books)
- Add new book
- Update existing book by index
- Delete a book by index
- Delete all books

<div style="page-break-after: always;"></div>

## Test of BookManager class
Create class called BookManagerTest that tests all the functions of BookManager class. It should include:
- Test adding new book
- Test updating existing book
- Test deleting a book
- Test deleting all books