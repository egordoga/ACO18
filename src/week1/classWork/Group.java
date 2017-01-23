package week1.classWork;

public class Group {

    private String name;
    private Student[] students;


    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public void showStudents(){
        System.out.println(name);
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].asString());
        }
    }

    public String asSting(){
        return "Name - " + name /*+ "  Students - " + students.toString()*/;
    }

    public String asStingAll(Student[] students){
        String str = "Name - " + name + "\n";
        for (int i = 0; i < students.length; i++) {
            str += students[i].asString() + ";\n";
        }
        return str;
    }

    public Student[] addStudent(String name, String surname, int age){
        Student[] newArrStudent = new Student[students.length + 1];

        for (int i = 0; i < students.length; i++) {
            newArrStudent[i] = students[i];
        }
        newArrStudent[newArrStudent.length - 1] = new Student(name, surname, age);
        return newArrStudent;
    }

}

