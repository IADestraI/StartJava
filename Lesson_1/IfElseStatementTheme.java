public class IfElseStatementTheme    {
    public static void main(String[] args) {
        // 1. Перевод псевдокода на язык Java //
        System.out.println("\n1.Перевод псевдокода на язык Java");

        int age = 25;
        if(age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20");
        }

        boolean male = true;
        if(!male) {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }

        double height = 1.75;
        if(height < 1.80) {
            System.out.println("Рост ниже 1.80");
        } else {
            System.out.println("Рост выше 1.80");
        }

        char firstLetterName = "Anton".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Первая буква имени M");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Имя начинается не с M или I");
        }

        // 2. Поиск max и min числа//
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 10;
        int num2 = 20;
        System.out.println("Число 1 = " + num1);
        System.out.println("Число 2 = " + num2);

        // Поиск максимального числа//
        int maxNum;
        if (num1 > num2) {
            maxNum = num1;
        } else {
            maxNum = num2;
        }
        System.out.println("Максимальное число = " + maxNum);
        // Поиск минимального числа //
        int minNum;
        if (num1 < num2) {
            minNum = num1;
        } else {
            minNum = num2;
        }
        System.out.println("Минимальное число = " + minNum);
        // Проверка равенства чисел //
        if (num1 == num2) {
            System.out.println("Число 1 и число 2 равны");
        } else {
            System.out.println("Число 1 и число 2 неравны");
        }

        // 3. Проверка числа //
        System.out.println("\n3.Проверка числа");
        int num3 = 0;
        System.out.println("Проверка числа " + num3);
        // проверка числа //
        if(num3 == 0) {
            System.out.println("Число равняется нулю");
        } else {
            if(num3 % 2 == 1) {
                System.out.println("Число нечетное");
            }   else {
                System.out.println("Число четное");
            }
            if(num3 > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }
        
        // 4. Поиск одинаковых цифр в числах//
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 123;
        int num5 = 223;
        System.out.println("Исходные числа: " + num4 + " и " + num5);
        int ones1 = num4 % 10;
        int ones2 = num5 % 10;
        int tens1 = (num4 / 10) % 10;
        int tens2 = (num5 / 10) % 10;
        int hundreds1 = num4 / 100;
        int hundreds2 = num5 / 100;
        if (ones1 == ones2) {
            System.out.println("Одинаковая цифра: " + ones1);
            System.out.println("Номер разряда: единицы");
        } 
        if (tens1 == tens2) {
            System.out.println("Одинаковая цифра: " + tens1);
            System.out.println("Номер разряда: десятки");
        }
        if (hundreds1 == hundreds2) {
            System.out.println("Одинаковая цифра: " + hundreds1);
            System.out.println("Номер разряда: сотни");
        }
        if (ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
            System.out.println("Нет одинаковых цифр в одинаковых разрядах.");
        }

        // 5. Определение символа по его коду //
        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        System.out.println("Символ: " + symbol);
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Число");
        } else {
            System.out.println("Не буква и не число");
        }

        // 6. Подсчет суммы вклада и начисленных банком % //
        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        double sumDeposit = 300_000;
        System.out.println("Сумма вклада: " + sumDeposit);
        double percent;
        double accruedInterest;
        if (sumDeposit < 100_000) {
            percent = 0.05;
        } else if (sumDeposit <= 300_000) {
            percent = 0.07;
        } else {
            percent = 0.1;
        }

        accruedInterest = sumDeposit * percent;

        System.out.println("Начисленные проценты: " + accruedInterest);
        double totalSum = sumDeposit + accruedInterest;
        System.out.println("Итоговая сумма с процентами: " + totalSum);

        // 7.Определение оценки по предметам //
        System.out.println("\n7.Определение оценки по предметам");
        int percentageHistory = 59;
        int percentageProgramming = 91;

        int gradeHistory;
        int gradeProgramming;

        if (percentageHistory <= 60) {
            gradeHistory = 2;
        } else if (percentageHistory > 60 && percentageHistory <= 73) {
            gradeHistory = 3;
        } else if (percentageHistory > 73 && percentageHistory <= 91) {
            gradeHistory = 4;
        } else {
            gradeHistory = 5;
        }

        if (percentageProgramming <= 60) {
            gradeProgramming = 2;
        } else if (percentageProgramming > 60 && percentageProgramming <= 73) {
            gradeProgramming = 3;
        } else if (percentageProgramming > 73 && percentageProgramming <= 91) {
            gradeProgramming = 4;
        } else {
            gradeProgramming = 5;
        }

        System.out.println("Оценки по предметам:");
        System.out.println("История " + gradeHistory);
        System.out.println("Программирование " + gradeProgramming);

        int averageGrade = (gradeProgramming + gradeHistory) / 2;
        System.out.println("Средний балл оценок по предметам " + averageGrade);

        int averagePercentage = (percentageHistory + percentageProgramming) / 2;
        System.out.println("Средний % по предметам " + averagePercentage);

        // 8. Расчет прибыли за год //
        System.out.println("\n8. Расчет прибыли за год");
        int rentalPrice = 5000;
        int averageSales = 13000;
        int costPrice = 9000;

        int annualProfit = ((averageSales - costPrice) - rentalPrice) * 12;

        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }
    }
}