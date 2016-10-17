/** Listing 10.5 Test course  */

public class Listing105_TestCourse {
  public static void main(String[] args) {

    // Create new course object
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database System");

    // Add student to course1
    course1.addStudent("Petter Jones");
    course1.addStudent("Kim Smith");
    course1.addStudent("Anne Kennedy");

    // Add students to course2
    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
    String[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");
    System.out.println();
    System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
  }
}

/** Define Course class */
class Course {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;

  // Constructor for Course class
  public Course(String courseName) {
    this.courseName = courseName;
  }

  // Define addStudent
  public void addStudent(String student) {
    students[numberOfStudents] = student;
    numberOfStudents++;
  }

  // Define steStudents
  public String[] getStudents() {
    return students;
  }

  // Define getNumberOfStudents
  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  // Define getCourseName
  public String getCourseName() {
    return courseName;
  }

  // Define dropStudent
  public void dropStudent(String student) {

  }
}
