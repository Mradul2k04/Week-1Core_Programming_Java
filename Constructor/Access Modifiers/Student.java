public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    static class PostgraduateStudent extends Student {
        public PostgraduateStudent(int rollNumber, String name, double CGPA) {
            super(rollNumber, name, CGPA);
        }

        public void displayProtectedName() {
            System.out.println("Protected Name: " + name);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        PostgraduateStudent ps1 = new PostgraduateStudent(201, "Bob", 9.0);

        System.out.println("Student Roll Number: " + s1.rollNumber);
        System.out.println("Student CGPA: " + s1.getCGPA());

        ps1.displayProtectedName();
        ps1.setCGPA(9.2);
        System.out.println("Postgraduate Student CGPA: " + ps1.getCGPA());
    }
}
