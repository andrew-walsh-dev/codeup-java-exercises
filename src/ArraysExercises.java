import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Jeff");
        people[1] = new Person("James");
        people[2] = new Person("John");
        System.out.println(people[2].getName());
        people = addPerson(people, new Person("New Guy"));
        System.out.println(people[3].getName());
    }

    //accept the array of people and the person to add to the end
    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] newArr = Arrays.copyOf(people, people.length + 1);
        newArr[newArr.length - 1] = newPerson;
        return newArr;
    }
}
