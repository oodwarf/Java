package Bean;

public class Smessage {

	private int id;
	private String name;
	private String position;
	private int num;
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
	public String getPosition() {
		return position;
	}
	public void setLocation(String position) {
		this.position = position;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public Smessage(int id, String name, String position, int num) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.num = num;
	}
	public Smessage() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Smessage [id=" + id + ", name=" + name + ", position="
				+ position + ", num=" + num + "]";
	}
	
	
}
