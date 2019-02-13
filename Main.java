package Book;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book(255, "Franko", 110, "drama");
		Book book3 = new Book(255, "Franko", 110, "drama", 30, 1883, "Zachar Berkut", "nice book");
		System.out.println(book1.toString() + "\n" + book2.toString() + "\n" + book3.toString());
		book1.printYears();
		book2.printYears();
		book3.printYears();
	}
	
}