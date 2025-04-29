public class BinomialCoefficient {
    public static int factorial(int k) {
        int f = 1;
        for(int i = 1 ; i<=k ; i++) {
            f = f*i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n-r);

        int binCoeff = fac_n / (fac_r * fac_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }

}