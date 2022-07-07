package ch3;

public class Example12 {
//编写程序，求1+2+3+4
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=4;i++){//i的值会在1~4之间变化
			sum+=i;//代码执行步骤：i=0，判断i<=4成立，执行sum=sum+i，i的值自增
		}
		System.out.println("sum="+sum);
	}

}
