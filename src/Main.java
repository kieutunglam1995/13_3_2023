public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "John");
        student.display(); // In ra: 1 John BBDIT

        Student.change();
        student.display(); // In ra: 1 John RIKKEI ACADEMY
    }
}

class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void change() {
        college = "RIKKEI ACADEMY";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
