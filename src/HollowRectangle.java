public class HollowRectangle {
    public static void HollowRectangle(int tolRaws, int tolCols){
        //for all the raws
        for (int i=1; i<=tolRaws; i++){
            for (int j=1; j<=tolCols; j++) {
                if (i==1 || i==tolRaws || j==1 || j==tolCols){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        HollowRectangle(4,5);
    }
}
