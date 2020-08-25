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
        System.out.println("Enter your details : First name, Middle name, Last name, University Roll Number, Number Of Books Issued : ");
        String firstNameOfStudent = scanner.nextLine();
        String middleNameOfStudent = scanner.nextLine();
        String lastNameOfStudent = scanner.nextLine();
        long universityRollNumberOfStudent = scanner.nextLong();
        int numberOfBooksIssuedByStudent = scanner.nextInt();
        Student studentDetails = new Student(firstNameOfStudent, middleNameOfStudent, lastNameOfStudent, universityRollNumberOfStudent, numberOfBooksIssuedByStudent);
        int studentInput;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issued books.");
            System.out.println("4. Exit.");
            System.out.println("Enter Your Choice (1...4): ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case 1 -> {
                    System.out.println("Enter the name of the book you want to issue: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    System.out.println("You have successfully issued " + bookName + " book.");
                }
                case 2 -> {
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    System.out.println("You have successfully returned " + bookName + " book.");
                    numberOfBooksIssuedByStudent -= 1;
                }
                case 3 -> {
                    System.out.println("Number Of Books Issued By You Currently ---> " + numberOfBooksIssuedByStudent);
                    System.out.println("Names of Book Issued By You Up Till Now ---> ");
                    studentDetails.printNamesOfBooksIssued();
                }
                case 4 -> System.out.println("Thank You!");
                default -> System.out.println("Wrong Choice");
            }
        } while (studentInput != 4);
        scanner.close();
    }
}
