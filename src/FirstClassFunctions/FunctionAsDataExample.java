package FirstClassFunctions;

import java.security.cert.TrustAnchor;

public class FunctionAsDataExample {
    protected static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    } // Person class

    protected static class DataLoader {
        public final NoArgFunction<Person> loadPerson;
        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment?this::loadPersonFake:this::loadPersonReal;
        }
        private Person loadPersonReal(){
            System.out.println("Loading Person...");
            return new Person("Real Person", 73);
        } //Real

        private Person loadPersonFake(){
            System.out.println("Returning Fake Person");
            return new Person("Fake Person", 80);
        } // Fake
    } // DataLoader

    public static void main(String[] args) {
        final Boolean IS_DEVELOPMENT = false;
        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }


}
