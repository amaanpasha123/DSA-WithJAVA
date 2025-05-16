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
    public static void newnum(int n){
        int num = 0;
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if (num==0){
                    num++;
                    System.out.print(num);
                }
                else {
                    num--;
                    System.out.print(num);
                }
            }
            System.out.println();
        }
    }


    public static void ButterFly(int n){
        //1st half
     for (int i=1; i<=n; i++){
         //stars
         for (int j = 1; j<=i; j++){
             System.out.print("*");
         }
         //spaces
         for (int j=1; j<=2*(n-i); j++ ){
             System.out.print(" ");
         }
         //stars
         for (int j=1; j<=i; j++) {
             System.out.print("*");
         }
         System.out.println();
     }
     //2nd half

        for (int i=n; i>=1; i--){
            //stars
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1; j<=2*(n-i); j++ ){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
//        HollowRectangle(4,5);
//        newnum(5);
        ButterFly(5);
    }
}
