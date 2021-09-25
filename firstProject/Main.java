package firstProject;

public class Second_alina {

    public static void main(String[] args) {
//        1.ცვლადები
	    int number = 10;
        int year = 2021;
        String myName = "Alina";
        String lastName = "Bregvadze";
        float averageNum = 10.5f;
        char firstLetter = 'a';
        boolean isTrue = false;

//        System.out.println(number);
//        System.out.println(year);
//        System.out.println(myName);
//        System.out.println(lastName);
//        System.out.println(averageNum);
//        System.out.println(firstLetter);
//        System.out.println(isTrue);

//        2.მათემატიკური ოპერატორები
        int num_1 = 2 + 13;
        int num_2 = 10 * 3;
        int sum = num_1 + num_2;
        int division = num_2 / num_1;
        int modulus = 30 % 11;

//        System.out.println(sum);
//        System.out.println(division);
//        System.out.println(modulus);

//        3.ლოგიკური ოპერატორი
        int userAge_1 = 15;
        int adult = 18;
        String day = "Monday";

//        ლოგიკური ოპერატორების პირდაპირ გამოყენების სხვა მაგალითი ვერ მოვიფიქრე
        if(userAge_1 > adult && day == "Monday"){
            System.out.println("everything is ok");
        }
        if(userAge_1 < 18 || day != "Monday"){
            System.out.println("you are not old enough");
        }

//        4.print my age
        int myBirthYear = 1996;
        int yearToday = 2021;
        int myAge = yearToday - myBirthYear;

        System.out.println("ჩემი დაბაბდების წელია " + myBirthYear + ", " + "ჩემი ასაკია " + (yearToday - myBirthYear));
//        System.out.println("ჩემი დაბაბდების წელია " + myBirthYear + ", " + "ჩემი ასაკია " + myAge);


    }
}
