import java.util.Scanner;
public class program1{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = scan.nextInt();
        System.out.println("Enter Second Number :");
        int b = scan.nextInt();
        int sum = a+b;
        System.out.println("sum ="+ sum);
        scan.close();
    }
}