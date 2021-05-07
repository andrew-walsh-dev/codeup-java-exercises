package grades;
import java.util.*;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<String, Student>();
        Student student1 = new Student("Andrew");
        Student student2 = new Student("Matthew");
        Student student3 = new Student("Danielle");
        student1.addGrade(24);student1.addGrade(25);student1.addGrade(26);
        student2.addGrade(95);student2.addGrade(100);student2.addGrade(105);
        student3.addGrade(42);student3.addGrade(40);student3.addGrade(38);
        students.put("andrewrox123", student1);
        students.put("mattrox38061", student2);
        students.put("daniellerox0395470", student3);
        
        Student student;
        boolean run = true;
        String userName;
        while (run){
            for (Object key : students.keySet()){
                System.out.println(key);
            }
            System.out.println("Which user would you like to see more information on?");
            userName = in.next();
            if (students.get(userName) == null){
                System.out.println("That user does not exist.");
            }
            else{
                student = students.get(userName);
                System.out.println("The user's name is " + student.getName());
                System.out.println("The user's grade average is " + student.getGradeAverage());
            }
            System.out.println("Would you like to continue? (Y/N) ");
            run = (in.next().equalsIgnoreCase("Y"));
        }
    }
}
