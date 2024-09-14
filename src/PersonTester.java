public class PersonTester {
    public static void main(String[] args) {

        // Create person1 using the no-argument constructor
        Person person = new Person();

        // Get and print the age of person1
        int x = person.getAge();
        System.out.println(x);

        // Create more Person objects using the no-argument constructor
        Person joshua = new Person();
        Person christian = new Person();

        // Set name for person1 to "Howard Roark" and print its details
        person.setName("Howard Roark");
        System.out.println(person);
    }
}

