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

        //Task 5
        byte whitePaints1Classroom = 2;
        byte brownPaints1Classroom = 4;
        int totalClassroom = 120 / (whitePaints1Classroom + brownPaints1Classroom);
        int totalWhitePaints = totalClassroom * whitePaints1Classroom;
        int totalBrownPaints = totalClassroom * brownPaints1Classroom;

        System.out.println("В школе, где "+ totalClassroom +" классов, нужно "+ totalWhitePaints +" банок белой краски и "+ totalBrownPaints +" банок коричневой краски.");

        //Task 6
        short bananasWeight = 5 * 80;
        short milkWeight = (200/100)*105;
        short iceCreamWeight = 2*100;
        short eggsWeight = 4*70;
        int totalWeightGram = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalWeightKilogram = (double) totalWeightGram / 1000;

        System.out.println("Вес спортзавтрака в граммах = "+ totalWeightGram);
        System.out.println("Вес спортзавтрака в киллограммах = "+ totalWeightKilogram);

        //Task 7
        int loseWeightGr = 7 * 1000;
        int days250WeightLoss = loseWeightGr/250;
        int days500WeightLoss = loseWeightGr/500;
        int daysAverage = (days250WeightLoss + days500WeightLoss)/2;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то он сбросит 7 кг за "+ days250WeightLoss +" дней.");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то он сбросит 7 кг за "+ days500WeightLoss +" дней.");
        System.out.println("В среднем спортсмен сбросит 7 кг за "+ daysAverage +" дней.");


    }
}