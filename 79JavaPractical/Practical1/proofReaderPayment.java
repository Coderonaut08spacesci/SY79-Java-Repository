import java.util.Scanner;
class proofReaderPayment{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Roll.No. SCS2627079");
        System.out.println("Proof Reader Payment");
        final int rate_per_page=60;
        System.out.println("Enter the number of pages: ");
        int number_of_pages=sc.nextInt();
        int payable_amount=rate_per_page*number_of_pages;
        System.out.println("The total amount is: "+payable_amount);
        sc.close();
    }
}