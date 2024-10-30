public class Calculator {

    public double toplama(double a, double b) {
        return a + b;
    }

    public double çikarma(double a, double b) {
        return a - b;
    }

    public double carpma(double a, double b) {
        return a * b;
    }

    public double bolme(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Bir sayıyı sıfıra bölemezsiniz.");
        }
        return a / b;
    }
}
