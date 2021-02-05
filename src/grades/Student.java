package grades;

import java.util.ArrayList;


public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }


    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {

        int total = 0;

        for (Integer grade : grades) {
            total += grade;
        }
        return (1.0 * total) / grades.size();
    }


    public static void main(String[] args) {

        Student dan = new Student("Dan");

        dan.addGrade(10);
        dan.addGrade(9);
        dan.addGrade(8);
        dan.addGrade(10);

        System.out.println(dan.grades);

        System.out.println(dan.getGradeAverage());
    }
}
