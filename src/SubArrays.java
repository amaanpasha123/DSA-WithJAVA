public class SubArrays {
    public static void Subarrays(int num[]) {
        int prefix[] = new int[num.length];
        prefix[0] = num[0];

        // Build prefix sum array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        int overallMax = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            int maxSum = Integer.MIN_VALUE;

            for (int j = i; j < num.length; j++) {
                int end = j;
                int sumsubarray = (start == 0) ? prefix[end] : (prefix[end] - prefix[start - 1]);

                if (sumsubarray > maxSum) {
                    maxSum = sumsubarray;
                }

                // Print the subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println("→ Sum: " + sumsubarray);
            }

            System.out.println("→ Max subarray sum starting from index " + start + ": " + maxSum);
            overallMax = Math.max(overallMax, maxSum);
            System.out.println();
        }

        System.out.println("✅ Overall Maximum Subarray Sum = " + overallMax);
    }

    public static void main(String args[]) {
        int num[] = {2, 3, 4, 6, 7, 9};
        Subarrays(num);
    }
}
