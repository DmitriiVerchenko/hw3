import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {


        game(3);
        replay();
    }

    public static void game(int attempt) {
        int number = random.nextInt(10);
        System.out.printf("Угадай число от 0 до 9\nУ тебя есть %d попытки", attempt);
        for (int i = 0; i < 3; i++) {
            System.out.println();
            int answer = scanner.nextInt();
            attempt--;
            if (number == answer) {
                System.out.println("Поздравляю,вы угадали!");
                break;
            } else if (attempt == 0) {
                System.out.println("Попытки закончились, вы проиграли");
                break;
            } else {

                System.out.printf("Вы ошиблись!\nПопробуйте ещё раз!\nПопыток осталось  %d", attempt);

            }

        }
    }

    public static void replay() {
        int userAnswer;
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

            userAnswer = scanner.nextInt();
            if (userAnswer == 1) {
                game(3);
            }
        }
        while (userAnswer != 0);


        }
    }


