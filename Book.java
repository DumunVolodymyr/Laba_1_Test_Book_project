package Book;

public class Book {
	public int number_page;
	public String autor;
	public int price;
	private String genre;
	static private int years;
	protected String name;
	protected String description;
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	public Book() {}
	
	public Book (int number_page, String autor, int price, String genre) {
		this.number_page = number_page;
		this.autor = autor;
		this.price = price;
		this.genre = genre;
	}
	
	public Book(int number_page, String autor, int price, String genre,int years,
			String name, String description) {
		this(number_page, autor, price, genre);
		this.years = years;
		this.name = name;
		this.description = description;			
	}
	
	public String toString() {
		return number_page + "" + autor + "" + price;
	}
	public void printYears() {
		System.out.println(years);
	}
	public void resetValues(int number_page, String autor, int price, String genre,int years,
			String name, String description) {
		this.number_page = number_page;
		this.autor = autor;
		this.price = price;
		this.genre = genre;
		this.years = years;
		this.name = name;
		this.description = description;	
	}
}
