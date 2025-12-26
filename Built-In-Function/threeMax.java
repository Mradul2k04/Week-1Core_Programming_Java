<<<<<<< HEAD
import java.util.*;
public class threeMax{

    public static int[] input(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < 3; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main (String[] args){
        int[] arr = new int[3];
        int[] ans = input(arr);
        int Value = max(ans);
        System.out.println("The maximum value in three number :- " + Value);
    }
=======
import java.util.*;
public class threeMax{

    public static int[] input(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < 3; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main (String[] args){
        int[] arr = new int[3];
        int[] ans = input(arr);
        int Value = max(ans);
        System.out.println("The maximum value in three number :- " + Value);
    }
>>>>>>> b2a881862e3369195b212c767ab40b26559f9c03
}