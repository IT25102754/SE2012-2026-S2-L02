package mainapp;

import models.Student;
import services.EnrollmentManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MAX_STUDENTS = 100;
        Student[] students = new Student[MAX_STUDENTS];
        int studentCount = 0;

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Sort Students by Name");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (studentCount >= MAX_STUDENTS) {
                        System.out.println("Error");
                        break;
                    }
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine().trim();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine().trim();

                    students[studentCount] = new Student(id, name);
                    studentCount++;
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (studentCount == 0) {
                        System.out.println("No students registered yet.");
                    } else {
                        System.out.println("\n--- Registered Students ---");
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println((i + 1) + ". " + students[i]);
                        }
                    }
                    break;

                case 3:
                    if (studentCount == 0) {
                        System.out.println("No students available.");
                        break;
                    }
                    System.out.print("Enter Student ID to Search: ");
                    String searchId = scanner.nextLine().trim();
                    Student found = EnrollmentManager.searchStudentById(students, studentCount, searchId);

                    if (found != null) {
                        System.out.println("Match Found: " + found);
                    } else {
                        System.out.println("Student with ID '" + searchId + "' was not found.");
                    }
                    break;

                case 4:
                    if (studentCount == 0) {
                        System.out.println("No students available to sort.");
                    } else {
                        EnrollmentManager.sortStudentsByName(students, studentCount);
                        System.out.println("Students successfully sorted alphabetically by name!");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid");
            }
        }
    }
}