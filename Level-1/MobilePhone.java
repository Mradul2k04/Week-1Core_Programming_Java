public class MobilePhone{
    private String brand;
    private int model;
    private double price;


    public MobilePhone(String brand, int model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void display(){
        System.out.println("Brand name = "+brand);
        System.out.println("Model name = "+model);
        System.out.println("price = "+price);        
 
    }
    public static void main(String args[]){
        MobilePhone m1 = new MobilePhone("Vivo", 22, 20999);
        System.out.println("Phone details = ");
        m1.display();

        MobilePhone m2 = new MobilePhone("Redmi", 21, 30000);
        System.out.println("Phone details = ");
        m2.display();

    }
}