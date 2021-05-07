package Loop;

public class LoopTriangle3 {
    public static void main(String[] args) {
        Triangle3();
    }
    private static void Triangle3() {
        int m = 5;
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 2* 5 -1; j++) {
                if (j==m || j ==n || i == 5)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            m--;
            n++;
            System.out.println(" ");
        }
    }
}
