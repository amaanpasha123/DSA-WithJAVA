import java.util.Scanner;

public class test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int line =1; line<=N; line++){
            for (int j=1; j<=line; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
