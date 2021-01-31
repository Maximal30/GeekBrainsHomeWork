package Java2.lessons.lesson3.phone;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Новый справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Вносим записи в справочник");
        phonebook.add("Иванов", "89002546552");
        phonebook.add("Петров", "89242546592");
        phonebook.add("Сидоров", "89652546254");
        phonebook.add("Сидоров", "89652546254");
        phonebook.add("Иванов", "89002546552");
        System.out.println("-----------------");

        System.out.println("Заполняем справочник номерами");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Отсутствие записи");
        System.out.println("Фролов");
        System.out.println(phonebook.get("Фролов"));
        System.out.println("-----------------");

        System.out.println("Добавляем существующий номер");
        phonebook.add("Иванов", "89002546552");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}

