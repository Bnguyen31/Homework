public class PersonTester {
    public static void main(String[] args) {
        // Create person1 using the constructor
        Person person = new Person();

        // Get and print of the age of person1
        int x = person.getAge();
        System.out.println(x);

        // Creating another Person object using the constructor
        Person person2 = new Person();

        // Set age for the second object and print
        person2.setAge(500);
        System.out.println(person2.getAge());

        // Set name for the second object and print it with toString
        person2.setName("Ikigai");
        System.out.println(person2);

        // Create more objects for other constructors to be used incase
        Person Derox = new Person();
        Person Maple = new Person();

        // Create a new Person object with another constructor
        Person m2 = new Person("Benil", 100);

        // Get and print the age of m2
        int y = m2.getAge();
        System.out.println(y);

        // Print the details of m2 using toString
        System.out.println(m2);
    }
}


