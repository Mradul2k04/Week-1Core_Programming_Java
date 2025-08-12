public class arithmatic {
    public static void main(String[] args) {
        try{

            int a = 10;
            int b = a / 0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: Division by zero is not allowed.");
        }
    }
}
