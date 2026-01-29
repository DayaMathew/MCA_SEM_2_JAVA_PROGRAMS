public class prgm17{
    public static void main(String[] args) {

        int a1 = 1, a2 = 2, a3 = 3;
        int b1 = 2, b2 = 1, b3 = 1;

        int sum1 = a1 + a2 + a3;   // 1 + 2 + 3 = 6
        int sum2 = b1 + b2 + b3;   // 2 + 1 + 1 = 4

        int c1 = a1 + b1;   // 1 + 2 = 3
        int c2 = a2 + b2;   // 2 + 1 = 3
        int c3 = a3 + b3;   // 3 + 1 = 4

        System.out.println(a1 + " " + a2 + " " + a3 + " | " + sum1);
        System.out.println(b1 + " " + b2 + " " + b3 + " | " + sum2);
        System.out.println("------------");
        System.out.println(c1 + " " + c2 + " " + c3);
    }
}
