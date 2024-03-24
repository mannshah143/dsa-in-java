// static keyword --> memory is allocated only once, saves space
class Student {
    String name;
    // static declared variables remain same for the entire class
    static String college;
}

public class Main {
    public static void main(String[] args) {
        // can be directly called by class name
        Student.college = "PDEU";
        Student s1 = new Student();
        s1.name = "lily";
        System.out.println(s1.name);
        System.out.println(s1.college);
    }
}