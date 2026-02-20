public class Areacircle {
    private double radius;
    private double area;
    public Areacircle(double radius){
        this.radius = radius;
        this.area = 0;
    }
    public void calc(){
        area = 3.14 * radius * radius;
    }
    public void display(){
        System.out.println("Area of circle = " + this.area);
    }
    public static void main(String args[]){
        Areacircle a1 = new Areacircle(3.0);
        a1.calc();
        a1.display();
    }
}