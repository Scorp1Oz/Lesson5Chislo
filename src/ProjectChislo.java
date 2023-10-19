import java.util.Random;
import java.util.Scanner;
public class ProjectChislo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int minNumber = 0;
            int maxNumber = 10;
            int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

            int maxAttempts = 3;
            int[] userGuesses = new int[maxAttempts];
            int attempts = 0;

            System.out.println("Вгадайте число від " + minNumber + " до " + maxNumber);

            while (attempts < maxAttempts) {
                System.out.print("Спроба " + (attempts + 1) + ": Введіть число: ");
                int userGuess = scanner.nextInt();

                if (userGuess < minNumber || userGuess > maxNumber) {
                    System.out.println("Будь ласка, введіть число в межах від " + minNumber + " до " + maxNumber);
                } else {
                    userGuesses[attempts] = userGuess;
                    if (userGuess == randomNumber) {
                        System.out.println("Вітаємо! Ви вгадали число.");
                        break;
                    } else if (userGuess < randomNumber) {
                        System.out.println("Спроба " + (attempts + 1) + ": Не вгадали. Загадане число більше.");
                    } else {
                        System.out.println("Спроба " + (attempts + 1) + ": Не вгадали. Загадане число менше.");
                    }
                    attempts++;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Гра закінчилася. Загадане число було " + randomNumber);
            } else {
                System.out.println("Ваші спроби: " + java.util.Arrays.toString(userGuesses));
            }

            scanner.close();
        }
    }

