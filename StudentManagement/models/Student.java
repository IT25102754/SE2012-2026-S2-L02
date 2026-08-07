package models;

/**
 *Represents a student 
*/ 

public class Student {
    private String id;
    private String name;

    /**
    *Constructs a new Student object.      
    *@param id The unique identifier for the student.     
    *@param name The full name of the student.      
    */ 

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    /**      
    * Gets the student ID      
    * @return The student ID string.      
    */ 

    // Implement the methods below
    public String getId() {
      return id;
    }
    /**      
    * Gets the student name.      
    * @return The student's full name.      
    */ 

    public String getName() {
      return name;
    }
    /**      
    * Returns a formatted representation.      
    * @return Student details as a String.      
    */ 
    @Override

    public String toString() {
      return "Student ID: " + id + " Name: " + name;
    }
}