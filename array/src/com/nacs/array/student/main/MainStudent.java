package com.nacs.array.student.main;

import java.util.Scanner;
import com.nacs.array.student.Student;

public class MainStudent {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            System.out.println("Roll No:");
            student[i].setRollNo(scanner.nextInt());
            System.out.println("Name:");
            scanner.nextLine(); // consume newline
            student[i].setName(scanner.nextLine());
            System.out.println("Fees:");
            student[i].setFees(scanner.nextFloat());
            System.out.println("Area:");
            scanner.nextLine(); // consume newline
            student[i].setArea(scanner.nextLine());
        }

        System.out.println("\n--- Student Details ---");
        for (Student students : student)
            System.out.println(students);

        System.out.println("\nNames which start with 'S':");
        for (Student s : student) {
            if (s.getName().startsWith("S") || s.getName().startsWith("s")) {
                System.out.println(s.getName());
            }
        }
        scanner.close();
    }
}
