public class DecreasingNumberPattern {
    public static void main(String[]args){
        System.out.println("Roll.No. SCS2627079");
        System.out.println("Decreasing number pattern");
        int limit=8;
        System.out.println("When System.out.print(j+\" \");");
        for (int i=limit;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
