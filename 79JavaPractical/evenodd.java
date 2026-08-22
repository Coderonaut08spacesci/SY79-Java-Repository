import java.util.Scanner;

class evenodd {
  public static void main(String args[]){
    Scanner input= new Scanner(System.in); 

    System.out.println("Even - Odd in Java"); 
    System.out.print("Enter a number: ");  
    int n=input.nextInt();
    if(n%2==0){
        System.out.println(n+" is an even number");
    } else{
        System.out.println(n+" is an odd number");
        
    }
    input.close();
  }  
}
