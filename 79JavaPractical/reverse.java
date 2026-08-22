import java.util.Scanner;
public class reverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Roll.No. SCS2627079");
        System.out.println("Program to find the reverse of digits of a number");
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int rev=0;
        while (num!=0){
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        System.out.println("The reverse of the number is: "+rev);
        sc.close();
    }
}
