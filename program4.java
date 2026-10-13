import java.util.Scanner;
public class program4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println("Enter b number :");
        int b = sc.nextInt();
        System.out.println("Addition ="+(a+b));
        System.out.println("Subtraction ="+(a-b));
        System.out.println("Multiplication ="+(a*b));
        System.out.println("Division ="+(a/b));
        System.out.println("modulus ="+(a%b));
        sc.close();
    }
}