public class SimplePrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SimplePrime <n>");
            return;
        }
        int n;
        try { n = Integer.parseInt(args[0]); } catch (Exception e) { System.out.println("Invalid number"); return; }
        System.out.println(isPrime(n) ? "prime" : "not prime");
    }
}
