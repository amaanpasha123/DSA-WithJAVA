public class recursion {
    public static void increaseInteger(int n){
        if(n==0){
            return;
        }
        increaseInteger(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n = 5;
        increaseInteger(n);
    }

}
