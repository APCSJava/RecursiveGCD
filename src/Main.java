public class Main {

    /* greatest common divisor; a, b >=0 */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    /* peasant  multiplication */
    public static int peasant(int a, int b) {
        if (b == 1) return a;
        if (b % 2 == 0) {
            return peasant(a * 2, b / 2);
        } else return a + peasant(a * 2, b / 2);
    }

    public static void main(String[] args) {
        System.out.println(gcd(260, 16));
        System.out.println(gcd(16, 260));
        System.out.println(peasant(26, 11));
    }
}
