import java.util.Scanner;
    public class program8{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the age :");
            int age =sc.nextInt();
            String a = (age>=18)?"Eligible":"Not Eligible";
            System.out.println(a);
            sc.close();
        }
    }