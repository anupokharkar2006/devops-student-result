package com.example;

public class App {
    public static String getResult(int marks) {
        if (marks < 0 || marks > 100) {
            return "Invalid marks";
        }
        return marks >= 40 ? "PASS" : "FAIL";
    }

    public static void main(String[] args) {
        int marks = args.length > 0
                ? Integer.parseInt(args[0]) : 75;

        System.out.println("Student Result Application");
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + getResult(marks));
    }
}
