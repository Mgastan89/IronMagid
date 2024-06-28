package School;

    import java.util.UUID;

    public class Teacher {
        // Private members
        private final String teacherId;
        private String name;
        private double salary;

        // Parameterized constructor
        public Teacher(String name, double salary) {
            this.teacherId = UUID.randomUUID().toString();  // Auto-generated unique ID
            this.name = name;
            this.salary = salary;
        }

        // Getter for teacherId
        public String getTeacherId() {
            return teacherId;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for salary
        public double getSalary() {
            return salary;
        }

        // Setter for salary
        public void setSalary(double salary) {
            this.salary = salary;
        }
    }


