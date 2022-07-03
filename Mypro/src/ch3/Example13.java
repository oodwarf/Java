package ch3;

public class Example13 {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		for(;i<=10;){
			//若表达式3为空，且没有“循环控制变量值改变”的语句，会出现“死循环”
			sum+=i;
		}
		System.out.println("1+2+...+10="+sum);
	}
//运行无结果
}

