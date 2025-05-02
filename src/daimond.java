import java.util.Scanner;
public class daimond {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int current_line = 1;
        int Total_line = 2*N-1;
        int star = 1;
        int space = N-1;

        while (current_line<=Total_line){
            //print space
            for (int i = 1; i<=space; i++){
                System.out.print(" ");
            }

            //print stars
            for (int i =1; i<=star; i++){
                System.out.print("*");
            }

            // for Next line
            if (current_line<N){
                space--;
                star +=2;
            }
            else {
                space++;
                star -=2;
            }
            current_line++;
            System.out.println();
        }

    }
}
