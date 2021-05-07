package Loop;

public class LoopTriangle2 {
    public static void main(String[] args) {
        int m = 5, n = 5; //h
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 9; j++ ) { //h*2-1
                if(j >= m && j <= n){
                    System.out.print(" * ");
                } else System.out.print("   ");
            }
            m--;
            n++;
            System.out.println(" ");
        }
    }
}
