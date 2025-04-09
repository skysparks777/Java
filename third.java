public class third{
    public static void main(String[] args) {
        int[][][] arr = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };

        int max = Integer.MIN_VALUE;
        for (int[][] layer : arr) {
            for (int[] row : layer) {
                for (int num : row) {
                    max = Math.max(max, num);
                }
            }
        }

        System.out.println("Maximum Element: " + max);
    }
}
