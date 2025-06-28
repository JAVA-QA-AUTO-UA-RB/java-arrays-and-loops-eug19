import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] secretCode = {10, 20, 40, 80, 160};
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt();
            if (userInput != secretCode[i]) {
                isCodeCorrect = false;
            }
        }

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходьте всередину. Тут є чарівна дошка з наступними числами 3, 6, 9, 12, 15, 18, 21, 24, 27, 30");
        } else {
            System.out.println("Невірний код. Спробуйте ще.");
        }

        //part 2

        int[] magicNumbers = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int total = 0;
        for (int i = 0; i < magicNumbers.length; i++) {
            total += magicNumbers[i];
        }

        System.out.println("Введіть суму чисел на чарівній дошці:");
        int userTotal = scanner.nextInt();
        boolean isTotalCorrect = true;
        if (userTotal != total) {
            isTotalCorrect = false;
        }

        if (isTotalCorrect) {
            System.out.println("Вітаємо! Відчиняється наступна кімната. Але тут на тебе чатує небезпечний дракон!");
        } else {
            System.out.println("Спробуйте ще.");
            return;
        }

        //part 3

        int[] attacks = {8, 16, 24, 32, 40, 33};

        boolean allEven = true;

        for (int i = 0; i < attacks.length; i++) {
            if (attacks[i] % 2 != 0) {
                allEven = false;
            }
        }

        if (allEven) {
            System.out.println("Атаки парні! Захист активовано!");
        } else {
            System.out.println("Увага! Непарна атака!");
        }

        // part 4

        System.out.println("Введи своє улюблене число:");
        int favoriteNumber = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < secretCode.length; i++) {
            if (secretCode[i] == favoriteNumber) {
                found = true;
                break;
            }
        }

        if (!found) {
            for (int i = 0; i < magicNumbers.length; i++) {
                if (magicNumbers[i] == favoriteNumber) {
                    found = true;
                    break;
                }
            }
        }


        if (!found) {
            for (int i = 0; i < attacks.length; i++) {
                if (attacks[i] == favoriteNumber) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Твій ключ знайдено!");
        } else {
            System.out.println("Треба більше магії...");
        }
    }
}

