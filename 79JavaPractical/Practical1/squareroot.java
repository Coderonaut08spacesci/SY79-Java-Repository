import java.util.Scanner;
class squareroot {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Roll.No. SCS2627079");
        System.out.println("Program to find the Square root of a number");
        System.out.print("Enter a number: ");
        double number=sc.nextDouble();
        double result=Math.sqrt(number);
        System.out.print("The square root of "+ number + " is: " + result);
        sc.close();
    }
}
