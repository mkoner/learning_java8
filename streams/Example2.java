import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


class Student{
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printStudent(){
        System.out.println(this.name + " :" +this.age);
    }
}

public class Example2{
    public static void main(String a[]){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mamadou", 27));
        students.add(new Student("Ali", 17));
        students.add(new Student("Mike", 30));
        students.add(new Student("Sally", 12));
        System.out.println("====================================");
        System.out.println("All Students");
        System.out.println("====================================");
        students.forEach(Student::printStudent);
        System.out.println("====================================");
        System.out.println("Adults");
        System.out.println("====================================");

        List<Student> adultStudents = students
        .stream()
        .filter(s->s.age>=18)
        .collect(Collectors.toList());
        adultStudents.forEach(Student::printStudent);

        System.out.println("====================================");
        System.out.println("Double the age of minors");
        System.out.println("====================================");

        List<Student> students2 = students
          .stream()
          .filter(s->s.age>=18)
          .map(s->s.age= s.age*2)
          .collect(Collectors.toList());
        students2.forEach(Student::printStudent);
    }
}