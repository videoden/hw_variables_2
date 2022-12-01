public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }


        public static void task1() {
            System.out.println("Задача 1");

        byte b = 127;
        short s = -32768;
        int i = 2147483647;
        long l = 1234567890123456789L;
        float f = 99f;
        double d =4659879.46579846;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();

            }
    public static void task2() {
        System.out.println("Задача 2");
        double d = 27.12;
        long l = 987678965549L;
        float f = 2.786f;
        int i = 569;
        short s = -159;
        short s2 = 27897;
        byte b = 67;
        System.out.println("Числу " + d + " присвой тип double");
        System.out.println("Числу " + l + " присвоил тип long");
        System.out.println("Числу " + f + " присвоил тип float");
        System.out.println("Числу " + i + " присвоил тип int");
        System.out.println("Числу " + s + " присвоил тип short");
        System.out.println("Числу " + s2 + " присвоил тип short");
        System.out.println("Числу " + b + " присвоил тип byte");
        System.out.println();

            }
    public static void task3() {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalPaper = 480;
        int totalStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperPerStudents = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudents + " листов бумаги");
        System.out.println();

    }
    public static void task4() {
        System.out.println("Задача 4");
        byte perfomancePer2min = 16;
        int perfomancePer1min = perfomancePer2min / 2;
        byte t1 = 20;
        short t2 = 60*24;
        int t3 = t2*3;
        int t4 = t2*30;
        int amountBottlesT1 = perfomancePer1min * t1;
        int amountBottlesT2 = perfomancePer1min * t2;
        int amountBottlesT3 = perfomancePer1min * t3;
        int amountBottlesT4 = perfomancePer1min * t4;
        System.out.println("За " + t1 + " минут машина произвела " + amountBottlesT1 + " штук бутылок");
        System.out.println("За " + t2 + " минут машина произвела " + amountBottlesT2 + " штук бутылок");
        System.out.println("За " + t3 + " минут машина произвела " + amountBottlesT3 + " штук бутылок");
        System.out.println("За " + t4 + " минут машина произвела " + amountBottlesT4 + " штук бутылок");
        System.out.println();

    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalTin = 120;
        byte tinPerClass = 2 + 4;
        int totalClasses = totalTin / tinPerClass;
        int totalWhiteTin = totalClasses * 2;
        int totalBrownTin = totalClasses * 4;
        System.out.println("В школе где " + totalClasses + " классов, нужно " + totalWhiteTin + " банок белой краски и "
                + totalBrownTin + " банок коричневой краски");
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte amountBanana = 5;
        byte bananaWeight = 80;
        short amountMilk = 2;
        short milkWeight100ml = 105;
        byte amountIcecream = 2;
        byte icecreamWeight = 100;
        byte amountEggs = 4;
        byte eggsWeight = 70;

        double totalWeight = (amountBanana * bananaWeight) + (amountMilk * milkWeight100ml) + (amountIcecream * icecreamWeight)
                + (amountEggs * eggsWeight);
        double totalWeightkg = (totalWeight / 1000);
        System.out.println("Общий вес спортзавтрака " + totalWeightkg + " кг.");
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        short loseWeight = 7000;
        short weightPerDay1 = 250;
        short weightPerDay2 = 500;
        int amountDays1 = loseWeight / weightPerDay1;
        int amountDays2 = loseWeight / weightPerDay2;
        int averageAmountDays = (amountDays1 + amountDays2) / 2;
        System.out.println("Если спортсмен будет худеть на 250 гр. в день, то сбросит вес за " + amountDays1
                + " дней, а если на 500гр. в день, то за " + amountDays2 + " дней");
        System.out.println("Чтобы сбросить вес в среднем понадобится " + averageAmountDays + " день");
        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double mashaSalaryNew = mashaSalary + mashaSalary * 0.1;
        double denisSalaryNew = denisSalary + denisSalary * 0.1;
        double kristinaSalaryNew = kristinaSalary + kristinaSalary * 0.1;

        double mashaSalaryDifference = (mashaSalaryNew - mashaSalary) * 12;
        double denisSalaryDifference = (denisSalaryNew - denisSalary) * 12;
        double kristinaSalaryDifference = (kristinaSalaryNew - kristinaSalary) * 12;
        System.out.println("Маша теперь получает " + mashaSalaryNew + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisSalaryNew + " рублей. Годовой доход вырос на " + denisSalaryDifference + "рублей.");
        System.out.println("Кристтина теперь получает " + kristinaSalaryNew + " рублей. Годовой доход вырос на " + kristinaSalaryDifference + " рублей.");
        System.out.println();
        }

}