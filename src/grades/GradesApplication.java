package grades;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student michael = new Student("Michael", new ArrayList<>(Arrays.asList(98, 93, 95)));
        Student sharon = new Student("Sharon", new ArrayList<>(Arrays.asList(86, 83, 94)));
        Student kelsie = new Student("Kelsie", new ArrayList<>(Arrays.asList(100, 97, 95)));
        Student james = new Student("James", new ArrayList<>(Arrays.asList(77, 73, 85)));

        students.put("coderguy47", michael);
        students.put("javagirl86", sharon);
        students.put("leetcoder54", kelsie);
        students.put("james1337", james);




        while (true) {

            System.out.println("Here are our student's GitHub usernames: ");

            for (String username : students.keySet()) {
                System.out.println(username);
            }

            System.out.println("What student would you like to see more information on?");
            String input = scanner.nextLine();
            if (students.containsKey(input)) {
                Student currentStudent = students.get(input);
                System.out.println("Name: " + currentStudent.getName());
                System.out.println("GitHub username: " + input);
                System.out.println("Current Average: " + currentStudent.getGradeAverage());
            } else {
                System.out.println("That is not a valid username!");
            }

            System.out.println("Would you like to see another student? y/n");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("n")) {
                break;
            }
        }





    }
}
