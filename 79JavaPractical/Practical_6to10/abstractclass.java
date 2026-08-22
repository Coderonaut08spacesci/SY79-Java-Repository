class student { 
    String name; 
    int age; 
 
    public void setDetails(String n, int a) { 
      name = n; 
      age = a; 
   } 
 
    void displayDetails() { 
         System.out.println("The Name is " + name + " and the age is " + age); 
  } 
} 
public class classMechanism{ 
      static void main(String[] args) { 
        student s1 = new student(); 
        s1.setDetails("Alice",20); 
        System.out.println("Student's Information"); 
        s1.displayDetails(); 
   } 
} 