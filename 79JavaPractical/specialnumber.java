import java.util.Scanner;

class specialnumber{
    public static long fact(int num){
    if (num==0 || num==1){
        return 1;
    }
    long ans=1;
    ans*=num*fact(num-1);
    return ans;
    }
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Roll.No. SCS2627079");
        System.out.println("Program to check whether a number is a special number");
        // a number whose sum of factorial of its digits equals the number itself
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int originalnum=num;
        long sum=0;
        while(num>0){
            int d=num%10;
            sum+=fact(d);
            num=num/10;
        }
        System.out.println("The sum of the factorial of the digits is: "+sum);
        if(sum==originalnum){
            System.out.println(originalnum+ " is a special number");
        }else{
            System.out.println(originalnum+ " is not a special number");
        }
        sc.close();
    }
}

