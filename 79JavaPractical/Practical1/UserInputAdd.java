import java.util.Scanner;
class UserInputAdd {
    public static void main(String args[]){
    Scanner input= new Scanner(System.in);
    System.out.println("Addition of two numbers in Java");
    
    System.out.println("Enter first number: ");
    int a=input.nextInt();
    System.out.println("Enter second number: ");
    int b=input.nextInt();
    int c=a+b;
    System.out.printf("The addition of %d and %d is %d%n", a, b, c);
    input.close();
  }
}