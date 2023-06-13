public class VariablesTheme {
    public static void main(String[] args) {
        // 1. Вывод характеристик компьютера//
        System.out.println("\n1. Вывод характеристик компьютера");
        byte cores = 16;
        short memory = 32;
        int graphCard = 3070;
        long mBoard = 690;
        float freqCpu = 4.2f;
        double freqRam = 4800;
        char chipMBoard = 'Z';
        boolean wifi = true;

        System.out.println("cores = " + cores);
        System.out.println("memory = " + memory);
        System.out.println("graphCard = " + graphCard);
        System.out.println("mBoard = " + mBoard);
        System.out.println("freqCPU = " + freqCpu);
        System.out.println("freqRam = " + freqRam);
        System.out.println("chipMBoard = " + chipMBoard);
        System.out.println("wifiMBoard = " + wifi);

        // 2. Расчет стоимости товара со скидкой//
        int pricePen = 100;
        int priceBook = 200;
        int price = pricePen + priceBook;
        float discountPrice = price * 0.11f;

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        System.out.println("общая стоимость товаров без скидки = " + price);
        System.out.println("сумма скидки (11%) = " + discountPrice);
        System.out.print("общая стоимость товаров со скидкой = ");
        System.out.println(price - discountPrice);

        // 3. Вывод слова JAVA //
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a        ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa           ");
        System.out.println(" JJ  a     a  V  a     a\n");

        // 4. Вывод min и max значений целых числовых типов //
        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        System.out.println("Первоначальное значение byte = " + byteMax);
        byteMax++;
        System.out.println("Инкремент byte = " + byteMax);
        byteMax--;
        System.out.println("Декремент byte = " + byteMax);
        short shortMax = 32767;
        System.out.println("Первоначальное значение short = " + shortMax);
        shortMax++;
        System.out.println("Инкремент short = " + shortMax);
        shortMax--;
        System.out.println("Декремент short = " + shortMax);
        int intMax = 2147483647;
        System.out.println("Первоначальное значение int = " + intMax);
        intMax++;
        System.out.println("Инкремент int = " + intMax);
        intMax--;
        System.out.println("Декремент int = " + intMax);
        long longMax = 922337203685477580L;
        System.out.println("Первоначальное значение byte = " + longMax);
        longMax++;
        System.out.println("Инкремент int = " + longMax);
        longMax--;
        System.out.println("Декремент int = " + longMax);

        // 5. Перестановка значений переменных // 
        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        
        // I.с помощью третьей переменной //
        System.out.println("I. С помощью третьей переменной\n"+ a);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(b);

        // II.с помощью арифметических операций //
        System.out.println("II. С помощью арифметических операций\n" + a);
        a += b;
        b = a - b;
        a -= b;
        System.out.println(b);

        // III.c помощью побитовой операции ^ //
        System.out.println("III. C помощью побитовой операции ^\n" + a);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(b);

        // 6.Вывод символов и их кодов //
        System.out.println("\n6.Вывод символов и их кодов");
        char sign ='#';
        char ampersand ='&';
        char at ='@';
        char circumflexus ='^';
        char lowLine ='_';
        System.out.println( ((int) sign) + " = " + sign);
        System.out.println( ((int) ampersand) + " = " + ampersand);
        System.out.println( ((int) at) + " = " + at);
        System.out.println( ((int) circumflexus) + " = " + circumflexus);
        System.out.println( ((int) lowLine) + " = " + lowLine);

        // 7.Вывод в консоль ASCII-арт Дюка //
        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char backslash = '\\';
        char slash = '/';
        char bracket = '(';
        char bracket1 = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + lowLine + bracket + " " + bracket1 + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + lowLine + lowLine + lowLine + lowLine + slash + backslash + lowLine + lowLine + backslash);
        
        // 8.Вывод количества сотен, десятков и единиц числа //
        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        System.out.println("Число 123 содержит:");
        System.out.println(hundreds + " Сотен");
        System.out.println(tens + " Десятков");
        System.out.println(ones + " Единиц");
        System.out.println("Сумма его цифр  = " + (hundreds + tens + ones));
        System.out.println("Произведение его цифр = " + hundreds * tens * ones);

        // 9.Вывод времени //
        System.out.println("\n9.Вывод времени");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}