import java.util.*;

class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private String[] subjects;
    private int[] marks;

    public Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
        validateMarks();
    }

    private void validateMarks() throws InvalidMarkException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Mark " + mark + " is invalid. Must be between 0 and 100.");
            }
        }
    }

    public double calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    public String assignGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    public void displayReportCard() {
        System.out.println("Report Card for " + name);
        System.out.println("----------------------------");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }
        System.out.println("----------------------------");
        System.out.printf("Average       :    ", calculateAverage());
        System.out.println("Grade         : " + assignGrade());
        System.out.println();
    }
}

public class ReportCard {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        String[] subjects = {"Math", "Science", "English", "History"};

        try {
            students.add(new Student("Mradul", subjects, new int[]{85, 92, 78, 88}));
            students.add(new Student("Ting ling ling ", subjects, new int[]{75, 64, 80, 70}));
            students.add(new Student("Langda", subjects, new int[]{95, 98, 92, 96}));
            students.add(new Student("Tanga",subjects,new int[]{45, 35, 67, 89}));

            for (Student student : students) {
                student.displayReportCard();
            }
        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}