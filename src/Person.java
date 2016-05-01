
public class Person {
	private String name;
	private String telephone;
	private String id;
	
	public Person(String name, String phone){
		this.name = name;
		this.telephone = phone;
		this.id = name+phone;
	}
	
	
	public String GetName(){
		return this.name;
	}
	
		
	public String GetTelephone(){
		return this.telephone;
	}
	
	public String GetId(){
		return this.id;
	}
}
