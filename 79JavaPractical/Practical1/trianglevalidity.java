import java.util.Scanner;
public class trianglevalidity {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Roll.No. SCS2627079");
        System.out.println("Triangle validity and Type identifier");
        System.out.println("Enter the sides of the triangle: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b)){
            System.out.println("The Triangle is Possible");
            if(a==b && b==c){
                System.out.println("It is an Equilateral Triangle");
            }else if(a==b || b==c || a==c){
                System.out.println("It is an Isosceles Triangle");
            }else{
                System.out.println("It is a Scalene triangle");
            }       
        }else{
            System.out.println("The Triangle is not Possible!");
        }
        sc.close();
    }
}
