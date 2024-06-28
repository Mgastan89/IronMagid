package School;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John Peters", 50000);
        Course course = new Course("Java 101", 200);
        Student student = new Student("Maria Guitar", "134 Main St", "Maria@gmail.com");

        // Accessing and printing the initial values
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());


    }

    /*
    1º git add .
    2º git commit -m "message"
    3º git push
     */
}