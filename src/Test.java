import com.couchbase.client.java.document.JsonDocument;

public class Test {

	public static void main(String[] args){
		Book java = new Book("Java for everyone", "Vitor", 2013, "2nd");
		DatabaseRequest dbRequest = new DatabaseRequest();
		
		Person friend = new Person("Margarida", "934854542");
		JsonDocument resp = dbRequest.AddBook(java);
		System.out.println(resp);
		
		Loan loan = new Loan(java, friend);
		resp = dbRequest.AddLoan(loan);
		
		System.out.println(resp);
	}
}
