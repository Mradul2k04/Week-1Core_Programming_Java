public class Circle {
    double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle radius: " + defaultCircle.radius);

        Circle customCircle = new Circle(5.5);
        System.out.println("Custom Circle radius: " + customCircle.radius);
    }
}
