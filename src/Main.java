public class Main {
    public static void main(String[] args)

    {   //Task 1
        byte balls = 50;
        short temperatureSpace = -270;
        int companyIncomeYear = 1857732579;
        long oneLightYear = 9460730472581L;
        float accessiblePart = 0.25F;
        double Pi = 3.1415926535897932;

        System.out.println("Значение переменной balls с типом byte равно "+ balls);
        System.out.println("Значение переменной temperatureSpace с типом short равно "+ temperatureSpace);
        System.out.println("Значение переменной companyIncomeYear с типом int равно "+ companyIncomeYear);
        System.out.println("Значение переменной oneLightYear с типом long равно "+ oneLightYear);
        System.out.println("Значение переменной accessiblePart с типом float равно "+ accessiblePart);
        System.out.println("Значение переменной Pi с типом double равно "+ Pi);

        //Task 2
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        //Task 3
        byte schoolboysLudmila = 23;
        byte schoolboysAnna = 27;
        byte schoolboysEkaterina = 30;
        short totalPapers = 480;
        int totalSchoolboys = schoolboysLudmila + schoolboysAnna + schoolboysEkaterina;
        int papersOneSchoolboy = totalPapers / totalSchoolboys;

        System.out.println("На каждого ученика рассчитано "+ papersOneSchoolboy +" листов бумаги");

        //Task 4
        byte performance2Minute = 16;
        int performance20Minute = performance2Minute * 10;
        int performance1Day = (performance20Minute * 3) * 24;
        int performance3Day = performance1Day * 3;
        int performance1Month = performance3Day * 10;

        System.out.println("За 20 минут машина произвела "+ performance20Minute +" штук бутылок");
        System.out.println("За сутки машина произвела "+ performance1Day +" штук бутылок");
        System.out.println("За 3 дня машина произвела "+ performance3Day +" штук бутылок");
        System.out.println("За месяц машина произвела "+ performance1Month +" штук бутылок");


    }
}