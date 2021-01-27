package Java1.lessons;

import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {
        int x = getNumberFromConsole();
        System.out.println(x);
    }


            static int getNumberFromConsole()
            {

            Scanner scan = new Scanner(System.in);
            int x;

            do {
                System.out.println("Введите от 0 до 9");
                x = scan.nextInt();

            } while (x < 0 || x > 9);

            return x;

        }
    }




