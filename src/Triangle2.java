public class Triangle2 {
    public static void main(String[] args) {
        triangle2(5);
    }

    public static void triangle2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int k= 0; k<(i*2)+1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
