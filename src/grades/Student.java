package grades;
import java.util.*;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student student1 = new Student("Andrew");
        System.out.println(student1.getName());
        student1.addGrade(1);
        student1.addGrade(2);
        student1.addGrade(3);
        System.out.println(student1.getGradeAverage());
    }
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }
    public String getName(){
        return this.name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
        for (int grade : this.grades){
            sum += (double) grade;
        }
        return sum / this.grades.size();
    }
}
    
