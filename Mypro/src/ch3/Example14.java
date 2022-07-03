package ch3;

public class Example14 {

	public static void main(String[] args) {
		int i=1,n=0;
		while(i<=100){
			if(i%3==0){
				System.out.println("i");
				n++;
			}
			if(n==5)
				break;
			i++;
		}
		//break语句可以终止循环或控制其他控制结构。只要执行到break语句，就会终止该层循环体的执行。
	}

}
