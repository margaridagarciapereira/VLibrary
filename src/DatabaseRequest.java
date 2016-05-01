
import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;
import com.couchbase.client.java.env.CouchbaseEnvironment;
import com.couchbase.client.java.env.DefaultCouchbaseEnvironment;

public class DatabaseRequest {
	Cluster cluster;
	Bucket bucket;
	
	public DatabaseRequest(){
		CouchbaseEnvironment env = DefaultCouchbaseEnvironment.builder().connectTimeout(10000).queryEnabled(true).queryPort(8091).build();
		this.cluster = CouchbaseCluster.create(env, "192.168.1.104:8091");
		this.bucket = this.cluster.openBucket("VLibrary", "ruadaspalheiras");
	}
	
	protected void finalize(){
		this.cluster.disconnect();
	}
	
	public JsonDocument AddBook(Book book){
		JsonObject bookJ = JsonObject.empty()
				.put("title", book.GetTitle())
				.put("author", book.GetAuthor())
				.put("year", book.GetYear())
				.put("edition", book.GetEdition());
				
		JsonDocument doc = JsonDocument.create(book.GetBookId(), bookJ);
		JsonDocument response = bucket.upsert(doc);
		return response;
	}
	
	public JsonDocument AddLoan(Loan loan){
		JsonObject loanA = JsonObject.empty()
				.put("date", loan.GetDate().toString())
				.put("bookRef", loan.GetBook().GetBookId())
				.put("person", loan.GetPerson().GetName())
				.put("personID", loan.GetPerson().GetId())
				.put("personPhone", loan.GetPerson().GetTelephone())
				.put("loanID", loan.GetLoanId());
		
		JsonDocument doc = JsonDocument.create(loan.GetLoanId(), loanA);
		JsonDocument response = bucket.upsert(doc);
		return response;
	}
	
}
