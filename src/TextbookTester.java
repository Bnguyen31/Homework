public class TextbookTester {
    public static void main(String[] args) {

        // Create textbook1 using the no-argument constructor
        Textbook textbook1 = new Textbook();

        // Print details of textbook1 using toString
        System.out.println(textbook1);

        // Create textbook2 using the parameterized constructor
        Textbook textbook2 = new Textbook("Advanced Java Programming", "Jane Smith", 3, "Computer Science");

        // Print of textbook2 using toString
        System.out.println(textbook2);

        // Use setter methods to modify the details of textbook1
        textbook1.setTitle("Object-Oriented Programming");
        textbook1.setAuthor("Robert Martin");
        textbook1.setEdition(2);
        textbook1.setSubject("Software Engineering");

        // Print modified details of textbook1
        System.out.println(textbook1);

        // Test the updateEdition method on textbook2
        textbook2.updateEdition(4); // Should update the edition to 4
        textbook2.updateEdition(2); // Should not update since it's lower than the current edition

        // Use of the getter method for print
        System.out.println("Title of textbook1: " + textbook1.getTitle());
        System.out.println("Author of textbook1: " + textbook1.getAuthor());
        System.out.println("Edition of textbook1: " + textbook1.getEdition());
        System.out.println("Subject of textbook1: " + textbook1.getSubject());
    }
}

