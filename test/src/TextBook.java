
public class TextBook extends Book {
	String subject;

    TextBook(String title, String author, int publicationYear, String subject) {
        super(title, author, publicationYear);
        this.subject = subject;
    }

    void displayTextBookInfo() {
        super.displayBookInfo();
        System.out.println("Subject: " + subject);
    }
	
	

}
