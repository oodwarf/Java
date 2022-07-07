package ch3;

public class Example04 {

	public static void main(String[] args) {
		int grade=75;
		if(grade>80){
			//满足条件grade>80
			System.out.println("该成绩的等级为优");
		}else if(grade>70){
			//不满足条件grade>80,但是满足条件grade>70
			System.out.println("该成绩的等级为良");
		}else if(grade>60){
			//不满足条件grade>70,但是满足条件grade>60
			System.out.println("该成绩的等级为中");
		}else{
			//不满足条件grade>60
			System.out.println("该成绩的等级为差");
		}
	}

}
