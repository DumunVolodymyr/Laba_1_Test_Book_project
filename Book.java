package Book;

public class Book {
	private int numberPage;
	private String autor;
	private int price;
	private String genre;
	private int numberChapter;
	private static int years;
	protected String name;
	protected String description;

	public String getGenre() {

		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNumberChapter() {

		return numberChapter;
	}

	public void setNumberChapter(int numberChapter) {
		this.numberChapter = numberChapter;
	}

	public Book() {
	}

	public Book(int numberPage, String autor, int price, String genre) {
		this.numberPage = numberPage;
		this.autor = autor;
		this.price = price;
		this.genre = genre;
	}

	public Book(int numberPage, String autor, int price, String genre, int numberChapter, int years, String name,
			String description) {
		this(numberPage, autor, price, genre);
		this.numberChapter = numberChapter;
		this.years = years;
		this.name = name;
		this.description = description;
	}

	public String toString() {
		return numberPage + " " + autor + " " + price + " " + genre + " " + numberChapter + " " + name + " "
				+ description;
	}

	public void printYears() {
		System.out.println(years);
	}

	public void printStaticYears() {
		System.out.println(years);
	}

	public void resetValues(int numberPage, String autor, int price, String genre, int numberChapter, int years,
			String name, String description) {
		this.numberPage = numberPage;
		this.autor = autor;
		this.price = price;
		this.genre = genre;
		this.numberChapter = numberChapter;
		this.years = years;
		this.name = name;
		this.description = description;
	}
}
