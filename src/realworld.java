public class realworld {
    public static void pattern(int n){

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int factorial(int n){
        int f=1;
        for (int i = 1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    public static int binomialFact(int n , int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int bcd = factorial(n-r);
        int realone = n_fact / (r_fact*bcd);
        return realone;
    }


    public static void main(String[] args){
         int result = binomialFact(5,2);
        System.out.println(result);
    }
}



