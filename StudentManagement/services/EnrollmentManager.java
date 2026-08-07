package services;

import models.Student;

/**
 * Service class handling search and sort operations on student records.
 */
public class EnrollmentManager {

    /**
     * Performs a linear search to find a student by their ID.
     *
     * @param students the array of student records
     * @param count    the current number of registered students
     * @param id       the student ID to search for
     * @return the matching {@link Student} object, or {@code null} if not found
     */
    public static Student searchStudentById(Student[] students, int count, String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                return students[i];
            }
        }
        return null;
    }

    /**
     * Sorts student records alphabetically by name using the Bubble Sort algorithm.
     *
     * @param students the array of student records
     * @param count    the current number of registered students
     */
    public static void sortStudentsByName(Student[] students, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}