import java.util.Scanner;
class question1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username =");
        String name = sc.nextLine();
        System.out.println("Enter the password :");
        String password = sc.nextLine();
        if(name == "sukhesh" && password == "123456"){
            System.out.println("password opened");
        }else{
            System.out.println("password invalid");
        }
        
    }
}
