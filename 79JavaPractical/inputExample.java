import java.util.Scanner;

public class inputExample {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Roll.No. SCS2627079");
        System.out.println("Program to demonstrate input in Java");
        System.out.print("Enter a number: ");
        double number=sc.nextDouble();
        System.out.print("The number is: " +number);
        System.out.print("Enter a name: ");
        String name=sc.next();
        System.out.print("The name is: " +name);
        sc.close();
    }
}
