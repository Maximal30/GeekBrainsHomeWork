package Java1.lessons.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 3;
    private static final char[][] map = new char[SIZE][SIZE];

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    public static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        initializeGame();
        printMap();

        while (true) {
            humanTurn();
            printMap();
         if (checkEndGame(DOT_X)) {
                break;
            }

            computerTurn();
            printMap();
            if (checkEndGame(DOT_O)) {
                break;
            }

        }
    }

    private static boolean checkEndGame(char symbol){
            if (checkWin(symbol)) {
                System.out.println(isHumanTurn(symbol) ? "Человек победил!" : "Машина победила!");
                return true;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                return true;
            }
        return false;
        }

    private static boolean isMapFull() {
        for (char[] rows : map) {
            for (char cellValue : rows) {
                if (cellValue == DOT_EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean checkWin(char symbol) {
        //проверка строчек
        if (map [0][0] == symbol && map [0][1] == symbol && map[0][2] ==  symbol ) return true;
        if (map [1][0] == symbol && map [1][1] == symbol && map[1][2] ==  symbol ) return true;
        if (map [2][0] == symbol && map [2][1] == symbol && map[2][2] ==  symbol ) return true;

        //проверка колонок
        if (map [0][0] == symbol && map [1][0] == symbol && map[2][0] ==  symbol ) return true;
        if (map [0][1] == symbol && map [1][1] == symbol && map[2][1] ==  symbol ) return true;
        if (map [0][2] == symbol && map [1][2] == symbol && map[2][2] ==  symbol ) return true;

        //проверка диагонали
        if (map [0][0] == symbol && map [1][1] == symbol && map[2][2] ==  symbol ) return true;
        if (map [0][2] == symbol && map [1][1] == symbol && map[2][0] ==  symbol ) return true;

        return false;
    }

    private static void humanTurn() {
        int rowIndex = -1;
        int colIndex = -1;
        do {
                        System.out.print("Введите номер строки: ");
            if(!SCANNER.hasNextInt()){
                SCANNER.nextLine();
                System.out.println("Введите число!");
                continue;
            }
            rowIndex = SCANNER.nextInt() - 1;

            System.out.print("Введите номер столбца: ");
            if(!SCANNER.hasNextInt()){
                SCANNER.nextLine();
                System.out.println("Введите число!");
                continue;
            }
           colIndex = SCANNER.nextInt() - 1;
        } while (!isCellValid(rowIndex, colIndex, DOT_X));

        map[rowIndex][colIndex] = DOT_X;
    }

    private static void computerTurn() {
        int rowIndex = -1;
        int colIndex = -1;
        Random rand = new Random();
        do {
           rowIndex = rand.nextInt(SIZE); // от 0 до 2 включительно
           colIndex = rand.nextInt(SIZE); // от 0 до 2 включительно
        } while (!isCellValid(rowIndex, colIndex, DOT_O));

        map[rowIndex][colIndex] = DOT_O;
    }

    private static boolean isCellValid(int rowIndex, int colIndex, char symbol) {
        if (!isArrayIndexValid(rowIndex) || !isArrayIndexValid(colIndex)) { //проверка не заянятости ячейки
            if (isHumanTurn(symbol)) {
                System.out.println("Индексы строки и колонки должны быть в диапозоне от 0 до " + SIZE);
            }
            return false;
        }
        if (map[rowIndex][colIndex] != DOT_EMPTY) { // по данным координатам не находится символ
            if (isHumanTurn(symbol)) {
                System.out.println("Данная ячейка уже занята!");
            }
            return false;
        }

        return true;

    }

    private static boolean isHumanTurn(char symbol) {
        return symbol == DOT_X;
    }

    private static boolean isHumanTurn(char symbol, char dotX) {
        return symbol == dotX;
    }

    private static boolean isArrayIndexValid(int index) {
        return index >= 0 && index < SIZE;
    }

    private static void printMap () { //текущее состояние
        printHeader();
        printMapState();
        System.out.println();
    }

    private static void printMapState() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
                System.out.print((rowIndex + 1) + " ");//нумерация строк
                for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                    System.out.print(map[rowIndex][colIndex] + " ");
                }
                System.out.println();
            }
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) { //нумерация колонок
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void initializeGame () {    //инициализация состояний ячеек массива
            for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
                for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                    map[rowIndex][colIndex] = DOT_EMPTY;
                }
            }
        }

    }