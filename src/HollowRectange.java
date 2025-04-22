public class HollowRectange {
    public static void main(String args[]){
        int w = 8, h = 5;
        for (int raw = 0; raw<h; raw++){
            for (int col=0; col<w; col++){
                if (raw==0 || raw == h-1 || col==0 || col == w-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
