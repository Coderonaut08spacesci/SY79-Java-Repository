public class tax {
    public static void main(String args[]){
        System.out.println("Roll.No. SCS2627079");
        System.out.println("Tax Calculator");
        double income=60000;
        double taxrate=2.2;
        double taxAmount=(taxrate/100)*income;
        System.out.printf("Tax Amount=%.2f",taxAmount);
    }
}
