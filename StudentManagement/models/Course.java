package models;

/**  
* Represents a course.  
*/ 
public class Course {
    private String code;
    private String title;

    /**       
    * Constructs a new Course object.       
    * @param code The unique identifier for the course.       
    * @param title The title of the course.       
    */ 

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }


    /**       
    * Gets the course code.       
    * @return The course code.       
    */ 

    public String getCode() {
      return code;
    }
    /**       
    * Gets the course title.       
    * @return The course title.       
    */ 

    public String getTitle() {
      return title;
    }
    /**       
    * Returns a formatted representation of the course.       
    * @return Course details as a String.       
    */  
    @Override 

    public String toString() {
      return "Course code: " + code + " Title: " + title;
    }
}