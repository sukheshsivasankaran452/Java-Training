import java.util.Scanner;
class question4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    
        
        System.out.println("Student's name :");
        String name = sc.nextLine();

        System.out.println("Roll number :");
        String roll =sc.nextLine();

        System.out.println("Age :");
        int age =sc.nextInt();

        System.out.println("Email address :");
        String email = sc.nextLine();

        System.out.println("department :");
        String dept = sc.nextLine();
        sc.close();
    }
}