import java.util.List;

public class FirstPracticeJava {

    public static void main (String... args) {

        // Примитивные типы данных:

        // Целочисленные типы
        byte aByte = 0; // 8b -128 + 127
        short aShort = 0; // 16b -32768 + 32767
        int aInt = 0; // 32b -2,147,483,648 до 2,147,483,647 (сокращенно: -2^32 ...+2^32 -1)
        long aLong = 0; // 64b -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807 (сокращенно: -2^64 ...+2^64 -1)

        // Типы с плавающей точкой
        float aFloat = 0.0F; // 32b
        double aDouble = 0.0; // 64b

        // Символьный тип
        char aChar = 'a'; // Хранит числовой код символа который является целым числом

        // Логический тип
        boolean aBoolean = true; // Хранит два значения (истина/ложь) Выражает в состоянии программы правда/неправда

        // Объектные или ссылочные типы данных:

        // Строка ( и бесконечность других объектных/ссылочных типов данных)
        String toBePrint = "Hello world";
        System.out.println(toBePrint);
        List<String> teachers = List.of("a","b"); // список строк

        // Операторы:

        // Операторы присвоения =
        String name = "Vitalik";
        int age = 34;

        // Арифметические операторы + - / * % ++ --
        int result = aInt;
        System.out.println(result);

        // Операторы сравнения <, >, <=, >=, != (не равно), == (настоящее равно) получаем булевый результат
        System.out.println(3 >= 3);

        // Логические операторы &(и), |(или), &&(сокращенное м), ||(сокращенное или), !(инверсия истина на лож, лож на истину)
        System.out.println(name.equals("Vitalik") && age == 34);

        // Оператор instanceof
        System.out.println(name instanceof String);



        byte byteMax = 127;
        byte byteMin = -128;

        // Переполнение: добавление к максимальному значению
        byte overflowByte = (byte) (byteMax + 1);  // Ожидается -128
        System.out.println("Переполнение byte (127 + 1): " + overflowByte);

        // Переполнение: вычитание от минимального значения
        byte underflowByte = (byte) (byteMin - 1); // Ожидается 127
        System.out.println("Переполнение byte (-128 - 1): " + underflowByte);

        byte b = 80;
        short s = 90;
        int i = 200;
        long l = 2000L;
        float f = 50.5F;
        double d = 70.5;
        System.out.println("");
        System.out.println("Операторы арифметики +, -, *, /, %");
        System.out.println(b + " + " + s + " = " + (b + s));
        System.out.println(i + " + " + d + " = " + (i + d));
        System.out.println(b + " - " + s + " = " + (b - s));
        System.out.println(b + " * " + i + " = " + (b * i));
        System.out.println(i + " / " + b + " = " + (i / b));
        System.out.println(l + " / " + s + " = " + (l / s) + " Остаток: " + (l % s));
        System.out.println("");
        System.out.println("Операторы сравнения >, <, >=, <=, !=, ==");
        System.out.println(b + " > " + s + " = " + (b > s));
        System.out.println(b + " < " + s + " = " + (b < s));
        System.out.println(b + " >= " + s + " = " + (b >= s));
        System.out.println(b + " <= " + (s + 26) + " = " + (b <= (s+26)));
        System.out.println(b + " != " + b + " = " + (b != b));
        System.out.println("Пример сравнения float и double");
        System.out.println(f + " == " + d + " = " + (f == d));
        System.out.println("Комбинаций типов данных (int и double)");
        System.out.println(i + " + " + d + " = " + (i + d));
    }
}








