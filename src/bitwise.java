public class bitwise {
    public static int Fastexpo(int a, int n, int m) {
        int ans = 1;
        a = a % m;

        while (n > 0) {
            if ((n & 1) == 1) { // Corrected this line
                ans = (ans * a) % m;
            }
            a = (a * a) % m; // Don't forget to apply mod here
            n >>= 1;
        }

        return ans;
    }

    public static void main(String args[]) {
        int result = Fastexpo(2, 100, 1000000);
        System.out.println(result);
    }
}
