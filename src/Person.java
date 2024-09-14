public class Person {
    // Private variables
    private String name;
    private int age;
    private String eyeColor;

    // Constructor
    public Person() {
        this("Your full name", 30, "brown");
    }

    // 3-arg Constructor
    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }
    //  Constructor
    public Person(String name, int age) {
        this(name, age, "unknown"); // Default eye color if not provided
    }

    // Getter and Setter of Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //get and set of Age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //get and set methods of EyeColor
    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    //toString method
    public String toString() {
        return "Person Details: [Name: " + name + ", Age: " + age + ", Eye Color: " + eyeColor + "]";
    }
}
