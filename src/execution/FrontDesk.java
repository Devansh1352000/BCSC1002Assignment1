/*  Created by IntelliJ IDEA.
 *  User: Devansh Shukla (Devansh1352000)
 *  Date: 25/08/20
 *  Time: 10:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNameOfStudent = scanner.nextLine();
        String middleNameOfStudent = scanner.nextLine();
        String lastNameOfStudent = scanner.nextLine();
        long universityRollNumberOfStudent = scanner.nextLong();
        int numberOfBooksIssuedByStudent = scanner.nextInt();
        Student studentDetails = new Student(firstNameOfStudent, middleNameOfStudent, lastNameOfStudent, universityRollNumberOfStudent, numberOfBooksIssuedByStudent);
    }
}
