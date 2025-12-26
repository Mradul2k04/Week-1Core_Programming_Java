<<<<<<< HEAD
import java.util.*;
public class factRec{
    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        return num;
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args){
       int num = input();
       int result = factorial(num);
       System.out.println("Factorial is " + result); 
    }
}
=======
import java.util.*;
public class factRec{
    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        return num;
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args){
       int num = input();
       int result = factorial(num);
       System.out.println("Factorial is " + result); 
    }
}
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
