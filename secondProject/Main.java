package secondProject;

public class Main {

    public static void main(String[] args) {
        oddNumbers();
        random();
        average();
        min_number();
    }


//    1. კენტი რიცხვები 30-მდე;
    static void oddNumbers(){
        int max = 30;
        for(int i = 1; i <= max; i+=2){
            System.out.println(i);
        }
    }

//    2.რენდომ რიცხვები 0-დან 100-მდე;
    static void random(){
        System.out.println(Math.random()*100);

//        მთელი რიცხვები
//        System.out.println(Math.round(Math.random()*100));
    }

//    3.double ტიპის მასივის საშუალო არითმეტიკული(საშუალო
    static void average(){
        int[][] arr_1 = {{10, 20, 6, 4, 5}, {1,9,10}};

        float sum = 0;   //გაყოფისას ზუსტი მნიშვნელობა რომ გამოეტანა
                        //ამიტომ გადავიყვანე float-ში
                        //int -ით დამრგვალებულ მნიშვნელობას აჩვენებდა
        int total_Numbers = 0;

         for(int i = 0; i < arr_1.length; i++){
            for(int j = 0; j < arr_1[i].length; j++){
                sum += arr_1[i][j];
                total_Numbers ++;
            }
        }

        float average = sum/total_Numbers;
        System.out.println(average);
    }

//    4.ინტეჯერების მასივში მინიმალური ელემენტი
    static void min_number(){
        int[] numbers = {10, 27, 3, 4, 5, 10, 23};
        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(min);
    }



}
