import java.util.ArrayList;
import java.util.List;

public class Course {
    // Instance Variables
    private String courseName;
    private List<String> enrolledStudents;

    // Static Variable
    private static int maxCapacity = 30; // Default max capacity

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Instance Method to enroll a student
    public boolean enrollStudent(String studentName) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(studentName);
            System.out.println(studentName + " has been enrolled in " + courseName);
            return true;
        } else {
            System.out.println("Cannot enroll " + studentName + ". The course " + courseName + " is at full capacity.");
            return false;
        }
    }

    // Instance Method to unenroll a student
    public boolean unenrollStudent(String studentName) {
        if (enrolledStudents.remove(studentName)) {
            System.out.println(studentName + " has been unenrolled from " + courseName);
            return true;
        } else {
            System.out.println(studentName + " is not enrolled in " + courseName);
            return false;
        }
    }

    // Static Method to set the maximum capacity for courses
    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
        System.out.println("Max capacity set to " + maxCapacity);
    }

    // Getters for instance variables
    public String getCourseName() {
        return courseName;
    }

    public List<String> getEnrolledStudents() {
        return new ArrayList<>(enrolledStudents);
    }

    // Static method to get max capacity
    public static int getMaxCapacity() {
        return maxCapacity;
    }

    public static void main(String[] args) {
        // Test the Course class
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in the Mathematics course
        math.enrollStudent("Alice");
        math.enrollStudent("Bob");
        math.enrollStudent("Charlie");

        // Unenroll a student from the Mathematics course
        math.unenrollStudent("Bob");

        // Attempt to unenroll a student not in the course
        math.unenrollStudent("David");

        // Enroll students in the Science course
        science.enrollStudent("Eve");
        science.enrollStudent("Frank");

        // Set a new max capacity for courses
        Course.setMaxCapacity(50);

        // Display enrolled students
        System.out.println("Students enrolled in " + math.getCourseName() + ": " + math.getEnrolledStudents());
        System.out.println("Students enrolled in " + science.getCourseName() + ": " + science.getEnrolledStudents());
        System.out.println("Current max capacity: " + Course.getMaxCapacity());
    }
}
