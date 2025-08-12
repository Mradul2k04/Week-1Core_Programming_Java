import java.util.InputMismatchException;
import java.util.Scanner;

public class input_mismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = 10;
        }
        catch(InputMismatchException e){
            System.out.println("Input Mismatch Exception: Invalid input type.");
        }
    }
}
