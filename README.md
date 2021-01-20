# 1. Java Banking System
This project is in package BankingSYstem.
There are 5 user cases in this project.
1. User can check balance.
2. User can deposit money.
3. user can withdraw money.
4. User can check latest transaction.
5. User can exit this project.

Here is a short demo:
![demo](demo/demo.gif)

# 2. My Details Score System
This project is in package MyDetails.
User can enter name, hobby, born year and score of 3 courses.
System will calculate your age and your average score.
Here is a short demo:
![demo](demo/mydetails.gif)

# 3. Grocery 
### Implementation
This project is in package POSclass.
We write a parent class Food. Fruit, Meat and Vegetable
are extended from this Food class. We only override the toString function
for each child class.
The main function is weitten in Grocery.

### User Case
There are several ways to handle exception.
1. User type in wrong format of input Strings.
2. User select food which is not in the menu.

![demo](demo/grocery.gif)

# 4. Supermarket
### Implementation
This project is in package Supermarket. DairyProduct and BeverageProduct
are inherited from GroceryProduct. Fat and Sugarlevel are 2 enums.
The main function is in GroceryProduct.
Here is a demo:
![demo](demo/Supermarket.png)

# 5. Threads
### intro
We use threads in 3 cases:
- Blocking I/O
- GUI applications
- Independent tasks


# 6.
### Intro
There are two core abstract classes in Java Streams API, InputStream and OutputStream. 
As these are abstract classes, you can't instantiate them, but they each have several concrete implementations for handling different types of data.
For example, concrete implementations of InputStream include FileInputStream for reading files and ByteArrayInputStream for reading bytes and so on. 
Similarly, implementations of OutputStream include FileOutputStream and ByteArrayOutputStream for writing out files and byte arrays respectively and so on. 
There are two more abstract classes called Reader and Writer. 
These are similar to InputStream and OutputStream and they are built on the same concepts,
but the main difference is that InputStream and OutputStream move bytes around whereas Reader and Writer move characters. 
Characters are easier and more intuitive to work with than bytes. They also handle Unicode characters and other character encoding issues, 
which byte streams do not. Again, these are abstract classes so it's the concrete implementations that are used depending on the type of data you are handling.