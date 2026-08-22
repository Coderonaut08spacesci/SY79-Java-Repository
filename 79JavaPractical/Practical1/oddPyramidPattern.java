public class oddPyramidPattern {
    public static void main(String[]args){
        System.out.println("Roll.No. SCS2627079");
        System.out.println("Odd number pyramid pattern");
        int limit=5;
        for (int i=1;i<=limit;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=2;
            }
            System.out.println();
        }
    }
}
