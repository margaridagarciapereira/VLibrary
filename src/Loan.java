import java.time.Instant;
import java.util.Date;
public class Loan {
	private String loanId;
	private Date date;
	private Book book;
	private Person person;
	
	/*public Loan(){
		this.book = "";
		
	}*/
	
	public Loan(Book book, Person person){
		this.book = book;
		this.person = person;
		this.date = Date.from(Instant.now());
		this.loanId = book.GetTitle() + person.GetName();
	}
	
	public Date GetDate(){
		return this.date;
	}
	
	public String GetLoanId(){
		return this.loanId;
	}
	
	public Book GetBook(){
		return this.book;
	}
	
	public Person GetPerson(){
		return this.person;
	}
	
}
