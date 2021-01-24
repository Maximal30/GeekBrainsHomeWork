package lessons.lesson5;

public class Cat {

    private String name;
    private String color;
    private int age;

    public Cat(){
        name = "Barsik";
        color = "White";
        age = 4;

    }


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.color = "White";
        cat1.age = 4;


        Cat cat2 = new Cat();
        cat2.name = "Markiz";
        cat2.color = "Black";
        cat2.age = 8;

        printInfo(cat1);
        printInfo(cat2);

    }

    private static void printInfo(Cat cat) {
        System.out.printf("Cat '%s'; color: %s; age: %d%n",
                cat.name, cat.color, cat.age);
    }
}
