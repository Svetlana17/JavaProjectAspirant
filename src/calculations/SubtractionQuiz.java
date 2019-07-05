package calculations;

import java.util.Scanner;

public class SubtractionQuiz {

    public static void main(String[] args){
        int number1=(int) (Math.random() * 10);
        int number2=(int)  (Math.random() * 10);

        if(number1 < number2){
            int temp =number1;
            number1=number1;
            number2=temp;
        }
        System.out.print("Summa" + " "+ number1 + " + " + number2 + "?");
        System.out.print("Input answer: ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if(number1 + number2 == answer){
            System.out.println("You are right!");
        }
        else {
            System.out.println("You answer wrong!");
            System.out.println("Result: " + number1 + " + " + number2 + " " + "должно быть " + (number1 + number2));
        }
    }
}
