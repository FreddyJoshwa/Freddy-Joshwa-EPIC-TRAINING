package modal;

public class CustomerModal {

	int cusId;
	String name;
	String email;
	
	public CustomerModal(){
		
	}
	public CustomerModal(int cusId, String name, String email) {
		super();
		this.cusId = cusId;
		this.name = name;
		this.email = email;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}

