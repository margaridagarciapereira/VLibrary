
public class Book {
	private String title;
	private String author;
	private int year;
	private String edition;
	
	
	public Book(String title, String author, int year, String edition) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.edition = edition;
	}

	/*public void SetTitle(String title){
		this.title = title;
	}*/
	
	public String GetTitle(){
		return this.title;
	}
	
	/*public void SetAuthor(String author){
		this.author = author;
		
	}*/
	
	public String GetAuthor(){
		return this.author;
	}
	
	/*public void SetYear(int year){
		this.year = year;
	}*/
	
	public int GetYear(){
		return this.year;
	}
	
	/*public void SetEdition(String edition){
		this.edition = edition;
	}*/
	
	public String GetEdition(){
		return this.edition;
	}
	
	public String GetBookId(){
		return this.title + this.year;
	}
}
