
public class Book {
	String title;
    String author;
	int publicationYear;
	
	  Book(String title, String author, int publicationYear) {
	        this.title = title;
	        this.author = author;
	        this.publicationYear = publicationYear;
	        
	  }
	  
	  void displayBookInfo() {
		  System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Publication Year: " + publicationYear);  

		  
		  
	  }
	        

	
	
	

}
