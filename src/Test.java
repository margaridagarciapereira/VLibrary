import com.couchbase.client.java.document.JsonDocument;

public class Test {

	public static void main(String[] args){
		Book java = new Book("Java for everyone", "Vitor", 2013, "2nd");
		DatabaseRequest dbRequest = new DatabaseRequest();
		//dbRequest.AddBook(java);
		JsonDocument resp = dbRequest.AddBook(java);
		System.out.println(resp);
	}
}
