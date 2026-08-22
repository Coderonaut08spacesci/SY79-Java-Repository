import java.util.Scanner;
public class notes {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Roll.No. SCS2627079");
        System.out.println("Program to calculate Notes Denomination");
       System.out.println("Enter amount: ");
       int amount=sc.nextInt();
       System.out.println("The entered amount is: ");
       int[] notes= {1000,500,100,50,20,10,5,2,1};
       int numberOfNotes=0;
       for(int note:notes){
        int count=amount/note;
        amount%=note;
        numberOfNotes+=count;
        System.out.println("The number of Rs."+note+" notes is: "+count);
       }
       System.out.println("The total number of notes is:"+numberOfNotes);
       sc.close();
    }
}
