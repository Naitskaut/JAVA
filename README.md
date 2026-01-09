# Sports Management System (Java OOP)

## Project Description
This project is a Java console application that demonstrates the main principles of Object-Oriented Programming (OOP), including inheritance, polymorphism, abstraction, and encapsulation. The program manages sports members and sport clubs using a common abstract base class.

---

## Class Structure

### Person (abstract class)
- Base class for all entities
- Field: `name`
- Abstract method: `info()`
- Overrides: `equals()`, `hashCode()`, `toString()`

### Sport (extends Person)
- Represents a sport-related person
- Field: `sportType`
- Overrides: `info()`, `equals()`, `hashCode()`

### Member (extends Sport)
- Represents a sport club member
- Fields: `surname`, `age`, `height`
- Constructors with default and full initialization
- Overrides: `info()`, `equals()`, `hashCode()`, `toString()`

### SportClub (extends Person)
- Represents a sport club
- Fields: `members`, `teamLead`
- Overrides: `info()`, `hashCode()`, `toString()`

---

## Program Features
- Input members from the console
- Store objects in `ArrayList<Person>`
- Polymorphism using overridden `info()` methods
- Sorting objects by name using `Comparator`
- Filtering sport clubs with 50 or more members
- Searching members by sport type
- Comparing objects using `equals()`

---

## How to Run
1. Open the project in IntelliJ IDEA
2. Run `Main.java`
3. Enter data when prompted in the console

---

## Technologies Used
- Java
- IntelliJ IDEA
- Java Collections Framework

---

## Learning Objectives
- Practice inheritance and polymorphism
- Use abstract classes
- Override methods correctly
- Implement `equals()` and `hashCode()`
- Work with collections and sorting

---

## Author
AITU Student

---

## Status
Completed
