package lessons;

public class lesson1 {

    //Задание 1

    public static void main(String[] args) {
        System.out.println(primer(3.2f,4.3f,3.8f,4.6f)); // задание 3
        System.out.println(checksumm(17,50)); // задание 4
        System.out.println(MorOreLess(-9)); // задание 5
        System.out.println(trueOrefalse(10)); // задание 6
        System.out.println(youName("Базилио")); // задание 7
        System.out.println(leapYear(2021)); // задание 8
    }

    //Задание 2

    byte a = 5;
    short b = 5;
    int c = 5;
    long d = 5555555L;
    float e = 5.555f;
    double f = 5.555555555555555;
    char g = 55;
    boolean h = true;

    //Задание 3

    public static float primer  (float a, float b, float c, float d) {
        float primer = a*(b+(c/d));
        return primer;
    }

    //Задание 4

    public static boolean checksumm (int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 5

    public static int MorOreLess(int a) {
        if (a >= 0) {
            System.out.print("Передано положительное число: ");
        } else {
            System.out.print("Передано отрицательное число: ");
        }
        return a;
    }

    //Задание 6

    public static boolean trueOrefalse(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 7

    public static String youName(String name) {
        System.out.print("Привет, ");
        return name;
    }

    // Задание 8

    public static int leapYear(int l) {

        if ((l % 400 == 0) || ((l % 4 == 0) && (l % 100 != 0))) {
            System.out.print("Високосный год: ");
        }
        else{
            System.out.print("Не високосный год: ");
        }
        return l;


    }

}