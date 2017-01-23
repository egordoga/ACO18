package week1.classWork;

/**
 * Created by Игорь on 22.01.2017.
 */
public class Student {

    private String name;
    private String surname;
    private int age;
    double averageMark;


    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String asString(){
        return "Name is - " + name + "  Surname - " + surname + "  age - " + age;
    }
}
