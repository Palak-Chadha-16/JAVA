public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.marks = 85;
        s1.display();

        System.out.println();

        Course c1 = new Course();
        c1.courseName = "Java Programming";
        c1.duration = 3;
        c1.display();
    }
}

class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Course {
    String courseName;
    int duration;

    void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
    }
}