package ch7;

public class Undergraduate extends Student {
	public Undergraduate() {
	}
	

	public void study(){
		System.out.println("本科生在学习");
	}
	String degree;
	public static void main(String[] args) {
		Student[] students=new Student[]{
				new Undergraduate(),
				new Undergraduate(),
				new Postgraduate()
		};
		for(int i=0;i<students.length;i++){
			students[i].study();
		}
	}

}
