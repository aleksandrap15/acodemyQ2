package practice.homework;

import javax.sql.rowset.serial.SQLOutputImpl;

public class PrimitiveTypeHomework {
    public static void main(String[] args) {

//1. Create 5 variables with meaningful name for each primitive data type and print it.
        System.out.println("Homework task 1");
        System.out.println("==>Double");


        double creditTermInMonths = 12;
        double creditPaymentPerMonth = 856;
        System.out.println("Total amount of the credit = " + creditTermInMonths * creditPaymentPerMonth);


        double numberOfStudents = 12;
        double numberOfStudentsAllowedInOneClassroom = 4;
        System.out.println("Wee need " + numberOfStudents / numberOfStudentsAllowedInOneClassroom + " classrooms");


        double lizaAgeInYears = 31;
        double johnAgeInYears = 33;
        System.out.println("John is " + (johnAgeInYears - lizaAgeInYears) + " years older then Liza.");

        double momsSalaryPerMonth = 1359;
        double dadsSalaryPerMonth  = 2698;
        double sonsSalaryPerMonth  = 985;
        System.out.println("Together they earn " + (momsSalaryPerMonth  + dadsSalaryPerMonth  + sonsSalaryPerMonth ) + " EUR.");

//Boris's vehicle market price before the accident 5000 EUR, wreck price 200 EUR. Additionally,  after the accident, Boris paid for towing 250 EUR . How much Boris will receive indemnity from the insurance company?
        double vehicleMarketValue = 5000;
        double vehicleWreckPrice = 200;
        double towingCosts = 250;
        System.out.println("Boris will receive " + ((vehicleMarketValue - vehicleWreckPrice) + towingCosts) + " EUR indemnity.");

        System.out.println("==>Float");
// Print PI.
        float piValue = (float) Math.PI;
        System.out.println("PI= " + (float) Math.PI);

        float triangleSideLength1 = 5.123699f;
        float triangleSideLength2 = 6.53698f;
        float triangleSideLength3 = 9.536989f;
        System.out.println("The perimeter of a triangle = " + (triangleSideLength1 + triangleSideLength2 + triangleSideLength3));

        float squareSideLength = 5;
        System.out.println("The area of a square is " + (squareSideLength * squareSideLength));

        float oneEurInNok = 10.02040f;
        float eurWeNeedToExchange = 15268f;

        System.out.println( "15268 EUR in NOK = " + eurWeNeedToExchange / oneEurInNok);



        System.out.println("==>Int");


        Integer numberOfPStudentInKraslavaSchool = 1002;
        Integer numberOfPStudentInRigaSchool = 2000;
//
        System.out.println("Number of students in Kraslava and Riga is equal: " + numberOfPStudentInKraslavaSchool.equals(numberOfPStudentInRigaSchool));


        Integer numberOfEmployeesInERGOLatvia = 10066;
        Integer numberOfEmployeesInERGOLithuania = 20160;

        System.out.println("ERGO Lithuania is bigger then ERGO Latvia, there are working " + Integer.max(numberOfEmployeesInERGOLithuania, numberOfEmployeesInERGOLatvia) + " employees.");


        Integer numberOfWheelsCar = 4;
        Integer numberOfWheelsBicycle = 2;

        System.out.println("It is cheaper to by wheels for bicycle, because I need only " + Integer.min(4, 2) + " wheels.");

// Compare
        Integer firstPersonAge = 36;
        Integer secondPersonAge = 72;
        System.out.println("The second person " + Integer.compare(firstPersonAge, secondPersonAge));

        Integer alisaBoughtApples = 12;
        Integer andyBoughtApples = 12;
        Integer milanaBoughtOranges = 18;
        Integer mihalBoughtOranges = 16;
        System.out.println("Alisa and Andy bought an equal amount of apples : "+ (alisaBoughtApples==andyBoughtApples));
        System.out.println("Milana and Mihal bought an equal amount of apples:  " + (milanaBoughtOranges==mihalBoughtOranges));
// BitCount
        Integer a = 100000;
        Integer b = 100001;
        Integer c = 100011;


        Integer.bitCount(a);
        System.out.println("Bit count for a = " + Integer.bitCount(a));
        Integer.bitCount(b);
        System.out.println("Bit count for b = " + Integer.bitCount(b));
        Integer.bitCount(c);
        System.out.println("Bit count for c = " + Integer.bitCount(c));

        Integer x = 9962;
        Integer y = 7892;
        Integer.sum(x , y);
        System.out.println("X + Y = " + Integer.sum(x , y));

        System.out.println("==>Boolean");

        boolean isJavaDifficult = true;

        System.out.println("Is JAVA difficult for Alexandra ? "+ isJavaDifficult);

        int numberOfDogsInRigaShelter = 12;
        int numberOfDogsInOgreShelter = 15;
        System.out.println("In Riga Shelter lives more dogs than in Orge Shelter? " + (numberOfDogsInOgreShelter < numberOfDogsInRigaShelter));

        int earthRadiusInKm = 6371;
        System.out.println("The distance from the center of Earth to a point on or near its surface equal 6371. " + (earthRadiusInKm == 6371 ) );

        boolean isAlexandraStudent = false;
        System.out.println("Alexandara is a student. " + isAlexandraStudent);

        int teacherEarnPerMonthEur = 775;
        int ministerEarnPerMonthEur = 5362;

        System.out.println("In future teachers will earn ministers salaries: " + (teacherEarnPerMonthEur >= ministerEarnPerMonthEur));


        System.out.println ("===================================");
// Print information about me using String data type variables.
        System.out.println("Homework task 2 + String.format");

        String myName = "Aleksandra";
        String mySurname = "Panfilova";
        String myHometown = "Kraslava";
        String myBirthYear = "1990";
        String myWorkPlace = "Ergo";
        String myPosition = "Foreign MTPL claim adjuster";
        String yearsImWorkingInErgo = "8";

        String nameAndSurname = String.format("%s %s %s." , "Hello! I'm" , myName , mySurname);
        String homeTownAndBirthYear = String.format("%s %s %s %s." , "I was born in" , myHometown, "in" , myBirthYear);
        String myWorkYearsPositionWorkPlace = String.format("%s %s %s.\n%s %s. " , yearsImWorkingInErgo , "year I work in", myWorkPlace , "I'm", myPosition);

        System.out.println(nameAndSurname);
        System.out.println(homeTownAndBirthYear);
        System.out.println(myWorkYearsPositionWorkPlace);









    }
}