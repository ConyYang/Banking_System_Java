package IOoperationExample;

public class Person {
    private String name;
    private int age;
    private long phoneNumber;

    public Person(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.println("Person created: ");
        System.out.println("Name: "+name+"Age: "+age+"Phone Number: "+phoneNumber);
    }
}
