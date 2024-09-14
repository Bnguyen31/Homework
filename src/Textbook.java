public class Textbook {
    // Instance variables to store textbook details
    private String title;
    private String author;
    private int edition;
    private String subject;

    //The no-argument constructor
    public Textbook() {
        this.title = "Introduction to Java";
        this.author = "John Doe";
        this.edition = 1;
        this.subject = "Computer Science";
    }

    // Constructor with parameters attached
    public Textbook(String title, String author, int edition, String subject) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.subject = subject;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for edition
    public int getEdition() {
        return edition;
    }

    // Setter for edition
    public void setEdition(int edition) {
        this.edition = edition;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Instance
    public void updateEdition(int newEdition) {
        if (newEdition > this.edition) {
            this.edition = newEdition;
            System.out.println("Edition updated to: " + newEdition);
        } else {
            System.out.println("New edition must be greater than current edition.");
        }
    }

    //toString method to display textbook details
    public String toString() {
        return "Textbook [Title: " + title + ", Author: " + author + ", Edition: " + edition + ", Subject: " + subject + "]";
    }
}
