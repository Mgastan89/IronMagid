package School;

    import java.util.UUID;

    public class Student {
        // Private members
        private final String studentId;
        private String name;
        private String address;
        private String email;
        private Course course;

        // Parameterized constructor
        public Student(String name, String address, String email) {
            this.studentId = UUID.randomUUID().toString();  // Auto-generated unique ID
            this.name = name;
            this.address = address;
            this.email = email;
            this.course = null;
        }

        // Getter for studentId
        public String getStudentId() {
            return studentId;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for address
        public String getAddress() {
            return address;
        }

        // Setter for address
        public void setAddress(String address) {
            this.address = address;
        }

        // Getter for email
        public String getEmail() {
            return email;
        }

        // Setter for email
        public void setEmail(String email) {
            this.email = email;
        }

        // Getter for course
        public Course getCourse() {
            return course;
        }

        // Setter for course
        public void setCourse(Course course) {
            this.course = course;
        }
    }


