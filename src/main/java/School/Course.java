package School;

public class Course {
    private static final java.util.UUID UUID = java.util.UUID.randomUUID();
    private final String courseId;
        private String name;
        private double price;
        private double moneyEarned;
        private Teacher teacher;

        // Parameterized constructor
        public Course(String name, double price) {
            this.courseId = java.util.UUID.randomUUID().toString();
            this.name = name;
            this.price = price;
            this.moneyEarned = 0.0;
            this.teacher = null;
        }
        // Getter for courseId
        public String getCourseId() {
            return courseId;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for price
        public double getPrice() {
            return price;
        }

        // Setter for price
        public void setPrice(double price) {
            this.price = price;
        }

        // Getter for moneyEarned
        public double getMoneyEarned() {
            return moneyEarned;
        }

        // Setter for moneyEarned
        public void setMoneyEarned(double moneyEarned) {
            this.moneyEarned = moneyEarned;
        }

        // Getter for teacher
        public Teacher getTeacher() {
            return teacher;
        }

        // Setter for teacher
        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }
    }

