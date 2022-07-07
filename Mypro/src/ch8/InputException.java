package ch8;

public class InputException extends Exception{
	private String name;
	private int age;
	
	public InputException() {
	
	}

	public InputException(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str="输入的姓名是"+name+"姓名或年龄输入不合法";
		return str;
	}
}
