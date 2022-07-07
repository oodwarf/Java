package ch3;

public class Example15 {
//break跳出外层循环
	public static void main(String[] args) {
		int i,j;
		itcase:for(i=1;i<=9;i++){//外层循环
			for(j=1;j<=i;j++){//内层循环
				if(i>4){//判断i的值是否大于4
					break itcase;//跳出外层循环
				}
				System.out.println("*");
			}
			System.out.println("\n");
		}

	}

}
