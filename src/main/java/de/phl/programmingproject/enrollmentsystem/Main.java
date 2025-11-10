package de.phl.programmingproject.enrollmentsystem;

/**
 * PUT YOUR CODE FOR THE EXERCISE 'STUDENT ENROLLMENT SYSTEM' IN THIS CLASS
 */
public class Main {
    // New Student
    public static void main(String[] args) {
        Student johnDoe = new Student("John Doe", "12345");
        System.out.println("Student information:");
        System.out.println(johnDoe.getInfo());

        // New Course
        Course introCS = new Course("Introduction to Computer Science");
        System.out.println("\nCourse information:");
        System.out.println(introCS.getInfo());

        // Enroll Student and Save
        System.out.println("\nEnrolling student in the course...");
        Enrollment enrollment = johnDoe.enroll(introCS);

        // Display updated information after enrollment
        System.out.println("\nUpdated student information after enrollment:");
        System.out.println(johnDoe.getInfo());

        System.out.println("\nUpdated course information after enrollment:");
        System.out.println(introCS.getInfo());

        // Display enrollment information
        System.out.println("\nEnrollment information:");
        System.out.println(enrollment.getInfo());

        // Set grade and display 
        enrollment.setGrade(4.0);
        
        System.out.println("\nUpdated enrollment information after setting grade:");
        System.out.println(enrollment.getInfo());

        // Create second course
        Course oop = new Course("Object-Oriented Programming");
        System.out.println("\nNew course information:");
        System.out.println(oop.getInfo());

        // Enroll student in second course
        System.out.println("\nEnrolling student in the second course...");
        Enrollment oopEnrollment = johnDoe.enroll(oop);
        System.out.println("Enrollment successful!");

        // Display student enrolled
        System.out.println("\nList of courses " + johnDoe.getName() + " is enrolled in:");
        for (Course course : johnDoe.getCourses()) {
            System.out.println("- " + course.getName());
        }

        // Display students in first course
        System.out.println("\nList of students enrolled in " + introCS.getName() + ":");
        for (Student student : introCS.getStudents()) {
            System.out.println("- " + student.getName());
        }

        // Drop student
        System.out.println("\nDropping " + johnDoe.getName() + " from " + introCS.getName() + "...");
        johnDoe.drop(introCS);

        // Display updated list (first course)
        System.out.println("\nUpdated list of students enrolled in " + introCS.getName() + ":");
        for (Student student : introCS.getStudents()) {
            System.out.println("- " + student.getName());
        }
        if (introCS.getStudents().isEmpty()) {
            System.out.println("(No students enrolled)");
        }
    }
}
