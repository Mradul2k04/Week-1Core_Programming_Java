interface Graded{
	void assignGrade(double score);
}
 

abstract class Student implements Graded {
	private String name;
	private double gpa;
	private String grade;
	
	
	public Student(String name) {
		this.name=name;
		this.gpa=0.0;
	}
	public String getName(){
		return name;
	}
	public double getGpa() {
		return gpa;
	}
	protected void setGpa(double gpa) {
		this.gpa=gpa;
	}
	public String getGrade() {
		return grade;
	}
	protected void setGrade(String grade) {
		this.grade=grade;
	}
	public String grade(String grade) {
		return grade;
	}
	
	public void claculateGpa(double[] scores) {
		double total=0;
		for(double score:scores ) {
			total+=score;
			
		}
		setGpa(total/scores.length);
	}
}


class Undergraduate extends Student{
	public Undergraduate(String name) {
		super(name);
	}
	@Override
    public void assignGrade(double score) {
        if (score >= 50) {
            setGrade("Pass");
        } else {
            setGrade("Fail");
        }
    }
}



class Postgraduate extends Student{
	public Postgraduate(String name) {
		super(name);
	}
	@Override
    public void assignGrade(double score) {
        if (score >= 85) setGrade("A");
        else if (score >= 70) setGrade("B");
        else if (score >= 55) setGrade("C");
        else setGrade("F");
    }
}



class Faculty{
	private String facultyname;
	
	public Faculty(String name) {
		this.facultyname=name;
	}
	public void assignGradeToStudent(Student student, double score) {
        student.assignGrade(score);
    }
}



class Course {
    private String courseName;
    private Faculty faculty;

    public Course(String name, Faculty faculty) {
        this.courseName = name;
        this.faculty = faculty;
    }

    public String getCourseName() {
        return courseName;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}


class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void enroll(double[] scores) {
        student.claculateGpa(scores);
        course.getFaculty().assignGradeToStudent(student, student.getGpa());
    }

    public void printTranscript() {
        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("GPA: " + student.getGpa());
        System.out.println("Grade: " + student.getGrade());
    }
}

public class UniversityEnrollmentSystem {
    public static void main(String[] args) {
        Faculty profSmith = new Faculty("Prof. Smith");
        Course javaCourse = new Course("Java Programming", profSmith);

        Student undergrad = new Undergraduate("Alice");
        Student postgrad = new Postgraduate("Bob");

        double[] aliceScores = {60, 70, 80};
        double[] bobScores = {90, 85, 88};

        Enrollment enrollAlice = new Enrollment(undergrad, javaCourse);
        Enrollment enrollBob = new Enrollment(postgrad, javaCourse);

        enrollAlice.enroll(aliceScores);
        enrollBob.enroll(bobScores);

        enrollAlice.printTranscript();
        enrollBob.printTranscript();
    }
}