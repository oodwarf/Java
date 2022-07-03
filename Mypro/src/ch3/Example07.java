package ch3;

public class Example07 {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=100)//当i<=100时，sum=sum+i
		{
			sum+=i;
			++i;//逻辑上i是先自增再在循环中使用的
		}
		System.out.println("整数1到100的和为:"+sum);
	}

}
