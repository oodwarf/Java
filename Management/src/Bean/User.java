package Bean;

public class User {

	private int id;
	private String name;
	private String pwd;
	private int type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public User(int id, String name, String pwd, int type) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.type = type;
	}
	
	public User(String name, String pwd, int type) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.type = type;
	}
	public User() {
		super();
	}
	
	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	
	
	
}
