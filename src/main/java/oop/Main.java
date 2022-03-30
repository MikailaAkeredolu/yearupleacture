package oop;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mikaila");
        System.out.println(person1);

        Employee employee = new Employee("Johnny", 40.0f, 35.0);
        employee.sex ='M';

        employee.setPronoun("Non Binary");
        System.out.println(employee.getPronoun());

        System.out.println(employee);
    }
}
