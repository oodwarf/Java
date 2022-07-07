package ch3;

public class Example16 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++){//i是一个偶数，不累加
			if(i%2==0){
				continue;//结束本次if循环，继续下个循环，相当于break if循环
			}
			sum+=i;
		}
		System.out.println("sum="+sum);
	}

}

