import java.util.*;

public class ArraysExercises {

    private Person person;

    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Person("Jack");
        people[1] = new Person("Jill");
        people[2] = new Person("Jacob");

        for (Person personElement : people) {
            System.out.println(personElement.getName());
        }

        Person jeffery = new Person("Jeffery");
        people = addPerson(people, jeffery);
        for (Person personElement : people) {
            System.out.println(personElement.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newArray = new Person[people.length + 1];

        System.arraycopy(people, 0, newArray, 0, people.length);
        newArray[newArray.length - 1] = person;
        return newArray;
    }
}
