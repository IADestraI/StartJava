public class CyclesTheme {
    public static void main(String[] args) {
        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");
        
        int start = -10;
        int end = 21;
        int num = start;

        int sumEven = 0; // Сумма четных чисел
        int sumOdd = 0; // Сумма нечетных чисел

        do {
            if (num % 2 == 0) {
                sumEven += num; // Если число четное
            } else {
                sumOdd += num; // Если число нечетное
            }
            num++;
        } while (num <= end);

        System.out.println("В отрезке [" + start + ", " + end + "] сумма четных чисел = " + 
            sumEven + ", а нечетных = " + sumOdd);

        // 2.Вывод чисел в порядке убывания
        System.out.println("\n2.Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = num1;
        int min = num1;

        if (num2 > max) {
            max = num2;
        } else if (num2 < min) {
            min = num2;
        }

        if (num3 > max) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
        }

        System.out.print("Числа в порядке убывания: ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        
        // 3. Вывод реверсивного числа и суммы его цифр
        System.out.println("");
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num4 = 1234;
        int sumDigits = 0;

        System.out.print("Исходное число в обратном порядке: ");
        while (num4 > 0) {
            int digit = num4 % 10; // Получаем последнюю цифру числа
            System.out.print(digit);
            sumDigits += digit; // Суммируем цифры числа
            num4 /= 10; // Удаляем последнюю цифру числа
        }

        System.out.println("\nСумма цифр числа: " + sumDigits);

        // 4.Вывод чисел в несколько строк
        System.out.println("\n4. Вывод чисел в несколько строк");

        start = 1;
        end = 24;
        int numPerLine = 5;
        int rows = (end - start) / numPerLine;
        int numInLastRow = (end - start) % numPerLine;

        if (numInLastRow > 0) {
            rows++; 
        }

        int num5 = start;
        for (int row = 1; row <= rows; row++) {
            for (int col = 0; col < numPerLine; col++) {
                if (num5 <= end) {
                    System.out.printf("%2d", num5);
                } else {
                    System.out.print("  ");
                }
                if (col < numPerLine - 1) {
                    System.out.print(" ");
                }
                num5 += 2;
            }
            if (row == rows) {
                for (int i = 0; i < numPerLine - numInLastRow; i++) {
                    System.out.printf("0");
                    if (i < numPerLine - numInLastRow - 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        // 5. Проверка количества двоек числа на четность/нечетность
        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");

        int num6 = 3242592;
        int countTwos = 0;

        System.out.print("В числе: " + num6);

        while (num6 > 0) {
            if (num6 % 10 == 2) {
                countTwos++;
            }
            num6 /= 10;
        }

        if (countTwos % 2 == 0) {
            System.out.print(" (четное)");
        } else {
            System.out.print(" (нечетное)");
        }
        System.out.println(" количество двоек - " + countTwos);

        // 6.Отображение геометрических фигур
        System.out.println("\n6.Отображение геометрических фигур");

        System.out.println("Прямоугольник:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nПрямоугольный треугольник:");
        int height = 5;
        int row = 1;
        while (row <= height) {
            int col = 1;
            while (col <= row) {
                System.out.print("#");
                col++;
            }
            System.out.println();
            row++;
        }

        System.out.println("\nТретья фигура:");
        
        System.out.println("\n7.Отображение ASCII-символов");

        // Вывод символов, идущих до цифр и имеющих нечетные коды (DECIMAL от 33 до 47)
        System.out.print("Odd Codes   ");
        for (int code = 33; code <= 47; code += 2) {
            System.out.print((char) code + " ");
        }
        System.out.println();

        // Вывод маленьких английских букв с четными кодами (DECIMAL 97 до 122)
        System.out.print("Even Codes  ");
        for (int code = 97; code <= 122; code += 2) {
            System.out.print((char) code + " ");
        }
        System.out.println();

        System.out.println("\n10.Отображение ASCII-символов");
        int size = 9;

        System.out.print(" * |");
        for (int i = 2; i <= size; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n------------------------------------");

        // Таблица умножения
        for (int i = 2; i <= size; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j <= size; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}