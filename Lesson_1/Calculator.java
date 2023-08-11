public class Calculator {
    public static void main(String[] args) {
        int a = 66;
        int b = 77;
        char sign = '*';
        double result = 0;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b != 0) {
                result = (double) a / b;
            } else {
                System.out.println("Деление на ноль не допускается.");
            }
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Недопустимый оператор.");
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}