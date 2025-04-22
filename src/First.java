import java.util.Scanner;
public class First {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       for (int line=1; line<=N; line++){
           for (int i=0; i<(N-line+1); i++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}

