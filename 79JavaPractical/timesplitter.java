import java.util.Scanner;
public class timesplitter {
    public static void main(String args[]){
        System.out.println("Roll.No. SCS2627079");
        System.out.println("Time Splitter Program");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in minutes: ");
        int totalmins=sc.nextInt();
        int days=totalmins/(24*60);
        int rmins=totalmins%(24*60);
        int hours=rmins/60;
        int fmins=rmins%60;
        System.out.printf("%d days %d hours %d mins",days,hours,fmins);
        sc.close();
    }
}
