import java.util.Scanner;

public class reversePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_line = n;
        int star = 1;
        int spaces = n-1;
        int current_line = 1;
        while (current_line <= total_line){
            //print spaces....
            for (int i = 1; i<=spaces; i++){
                System.out.print(" ");
            }
            //print stars....
            for (int i = 1; i<=star; i++){
                System.out.print("*");
            }
            //next line...
            System.out.println();
            spaces --;
            star ++;
            current_line++;
        }
    }
}
