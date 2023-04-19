
public class Main {
    /**
     * Find the nth term in the fibonacci sequence
     * @param n nth term one is trying to find; has to be an integer
     * @return the nth term in the fibonacci sequence
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}