
public class AuthorBookTest {

	public static void main(String[] args) {
		
		Author author = new Author("Amina", "amina.mustafiic@gmail.com", 'f');
		Book book = new Book("Knjiga", author, 10, 2);
		
		System.out.println();book.toString();

	}

}
