import java.util.Scanner;
public class program9{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        boolean b = (num%2 == 0) && (num>10);
        System.out.print(b);
    }
}
