
public class Library {

	public static void main(String[] args) {
		  Book book1 = new Book("java", "sandeep", 2024);
	        book1.displayBookInfo();
	        
	        System.out.println("-------------------");
	        

	        TextBook textbook1 = new TextBook("Introduction to Java", "sandeep goud", 2023, "Java Programming");
	        textbook1.displayTextBookInfo();
		

	}

}
