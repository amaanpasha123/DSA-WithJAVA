public class Arrays {
    public static int largestNumber(int[] n) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (largest < n[i]) {
                largest = n[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 45, 6};
        int largest = largestNumber(a);
        System.out.println(largest);
    }
}
