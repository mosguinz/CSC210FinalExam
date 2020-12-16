public class A3 {
    public static void main(String[] args) {
        int[][] a3 = {{1, 2}, {2, 2}, {3, 2}};
        for (int i = 0; i < a3.length; i++) {
            for (int j = 0; j < a3[i].length; j++) {
                System.out.printf("%d ", a3[i][j]);
            }
            System.out.println();
        }
    }
}
