import java.util.Scanner;
class sum {
    public static void main(String args[]){
        System.out.println("Summation of Numbers: ");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= input.nextInt();
        System.out.print("Enter second number: ");
        int b= input.nextInt();
        System.out.print("Enter third number: ");
        int c= input.nextInt();
        int sum=a+b+c;
        System.out.println("The Summation is: "+sum);
        input.close();
}
}
