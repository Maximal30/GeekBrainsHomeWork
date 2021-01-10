package lessons;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] empWork = new Employee[5];
        empWork[0] = new Employee("Somoilov Mochail", "judge", "som666@google.com", "89143456782",350000,39);
        empWork[1] = new Employee("Frolov Sergey", "assistant judge", "123frol@google.com", "89612345678",15000,24);
        empWork[2] = new Employee("Tereshkova Valentina", "cleaning lady", "null@mailbox.com", "89123425678",8000,72);
        empWork[3] = new Employee("Ivanov Ivan", "security Service", "ivan@mailbox.com", "8953345678",25000,41);
        empWork[4] = new Employee("Yakov Rabinovich", "accountant", "yak@mailbox.com", "89183456782",1500000,53);
        for (Employee employee : empWork)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}



